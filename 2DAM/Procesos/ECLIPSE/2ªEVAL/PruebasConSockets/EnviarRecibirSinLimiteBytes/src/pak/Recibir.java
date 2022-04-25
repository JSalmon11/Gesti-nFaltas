package pak;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.ByteBuffer;

public class Recibir {
	
	public static void main (String[] args)	{
		DatagramSocket s=getSocket();
		while (true) {
			if(s!=null) {
				byte[] longCodificada=recibirMensaje(4,s);			
				int longitud = ByteBuffer.wrap(longCodificada).getInt();
				
				byte[] mensaje = recibirMensaje(longitud,s);
				if ("-1".equals(new String(mensaje))) {break;}
				System.out.println("Mensaje recibido: "+new String(mensaje));
			}
		}
	}// main()
	
	private static byte[] recibirMensaje(int tamanio, DatagramSocket s) {
		byte[] buffer = new byte[tamanio];
		DatagramPacket paquete = new DatagramPacket(buffer, tamanio);
		try {
			s.receive(paquete);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return buffer;
	}// recibirMensaje()
	
	private static DatagramSocket getSocket(){
		DatagramSocket s=null;
		try {
			s = new DatagramSocket(20000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		return s;
	}// getSocket()
	
}// Recibir