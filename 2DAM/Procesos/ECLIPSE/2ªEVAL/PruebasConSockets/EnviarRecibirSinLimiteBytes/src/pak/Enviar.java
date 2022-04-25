package pak;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Enviar {
	
	public static void main (String[] args)	{
		DatagramSocket s = getSocket();
		Scanner teclado = new Scanner(System.in);
		if (s!=null) {
			InetAddress direccionReceptor;
			if((direccionReceptor=getAddress("localhost"))!=null) {
				int puerto=20000;
				String mensaje = teclado.nextLine();
				
				ByteBuffer bb=ByteBuffer.allocate(4);
				bb.putInt(mensaje.length());
				byte[] buffer = bb.array(); 
				DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, direccionReceptor, puerto);
				enviarPaquete(paquete,s);
				
				buffer = mensaje.getBytes();
				paquete = new DatagramPacket(buffer, buffer.length, direccionReceptor, puerto);
				enviarPaquete(paquete,s);
			}
		}
	}// main()
	
	private static void enviarPaquete(DatagramPacket paquete, DatagramSocket s) {
		try {
			s.send(paquete);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// enviarPaquete()
	
	private static InetAddress getAddress(String dir) {
		InetAddress direccion=null;
		try {
			direccion=InetAddress.getByName(dir);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return direccion;
	}// getAddress()
	
	private static DatagramSocket getSocket(){
		DatagramSocket s=null;
		try {
			s = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		return s;
	}// getSocket()
	
}// Enviar