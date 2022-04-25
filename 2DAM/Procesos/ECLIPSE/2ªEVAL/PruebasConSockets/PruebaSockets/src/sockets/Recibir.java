package sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Recibir {
	
	public static void main (String[] args) throws SocketException{
		Scanner teclado = new Scanner(System.in);
		DatagramSocket socket=new DatagramSocket(15300);
		try {
			while(true) {
				byte[] buffer=new byte[250];
				DatagramPacket paquete=new DatagramPacket(buffer, buffer.length);
				socket.receive(paquete);
				
				InetAddress remitente=paquete.getAddress();
				int port = paquete.getPort();
				String mensajerecibido=new String(paquete.getData());
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println(remitente.getHostAddress()+": "+mensajerecibido);			

				System.out.println("Mensaje a enviar:");
				String mensaje = teclado.nextLine();
				byte[] respuesta=mensaje.getBytes();
				DatagramPacket paqueteRespuesta=new DatagramPacket(respuesta, respuesta.length,
						remitente, port);
				socket.send(paqueteRespuesta);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main()
	
}// Recibir