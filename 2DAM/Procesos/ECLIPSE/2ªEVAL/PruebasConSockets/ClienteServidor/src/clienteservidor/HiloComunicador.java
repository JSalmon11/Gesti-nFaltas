package clienteservidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class HiloComunicador implements Runnable {
	private DatagramPacket paquete;
	private DatagramSocket socket;
	private InetAddress dirCliente;
	private int puertoCliente;
	
	public HiloComunicador (DatagramPacket paquete) {
		this.paquete=paquete;
	}

	@Override
	public void run() {
		dirCliente = paquete.getAddress();
		puertoCliente = paquete.getPort();
		socket = getSocket();
		if(socket!=null) {
			//Enviar a cliente puerto al paquete
			//comunicarse a traves de un mensaje
			enviarMensaje("OK".getBytes());
			DatagramPacket respuesta = recibirMensaje();
			System.out.println("Mensaje recibido: "+new String(respuesta.getData()));
			socket.close();
		}
	}// run()
	
	private void enviarMensaje(byte[] buffer) {
		DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, dirCliente, puertoCliente);
		try {
			socket.send(paquete);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private DatagramPacket recibirMensaje() {
		DatagramPacket paquete = new DatagramPacket(new byte[20], 20);
		try {
			socket.receive(paquete);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return paquete;
	}
	
	private static DatagramSocket getSocket(){
		DatagramSocket s=null;
		try {
			s = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		return s;
	}// getSocket()
	
}// Servidor