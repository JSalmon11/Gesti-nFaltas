package clienteservidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Cliente {
	private static DatagramSocket socket;
	private static int puertoServidor;
	private static InetAddress dirServidor;
	
	public static void main (String[] args)	{
		dirServidor = getInetAddress();
		puertoServidor = 20000;
		socket=getSocket();
		enviarMensaje(new byte[1]);
		
		DatagramPacket paquete=recibirMensaje();
		
		puertoServidor = paquete.getPort();
		
		enviarMensaje("Buenisimas tardes".getBytes());
		socket.close();
	}// main()
	
	private static void enviarMensaje(byte[] buffer) {
		DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, dirServidor, puertoServidor);
		try {
			socket.send(paquete);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static DatagramPacket recibirMensaje() {
		DatagramPacket paquete = new DatagramPacket(new byte[20], 20);
		try {
			socket.receive(paquete);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return paquete;
	}
	
	private static InetAddress getInetAddress() {
		InetAddress dir=null;
		try {
			dir = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return dir;
	}// getInetAddress()
	
	private static DatagramSocket getSocket(){
		DatagramSocket s=null;
		try {
			s = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		return s;
	}// getSocket()
	
}// Cliente