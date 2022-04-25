package clienteservidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {

	public static void main (String[] args)	{
		DatagramSocket socket = getSocket();
		byte[] buffer;
		DatagramPacket paquete;
		while (true) {
			buffer = new byte[1];
			paquete=new DatagramPacket(buffer, buffer.length);
			try {
				socket.receive(paquete);
			}catch (IOException e) {
				e.printStackTrace();
			}
			Thread hilo=new Thread(new HiloComunicador(paquete));
			hilo.start();
		}
	}// main()
	
	private static DatagramSocket getSocket() {
		DatagramSocket s=null;
		try {
			s=new DatagramSocket(20000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		return s;
	}
	
}// Servidor