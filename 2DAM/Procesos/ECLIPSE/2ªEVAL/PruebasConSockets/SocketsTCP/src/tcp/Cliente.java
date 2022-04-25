package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Cliente {
	
	public static void main (String[] args)	{
		Socket socket = getSocket();
		BufferedReader br = getBufferedReader(socket);
		BufferedWriter bw = getBufferedWriter(socket);
		
		String mensaje=Math.random()+"";
		enviarMensaje(bw, mensaje);
		
		String respuesta = recibirMensaje(br);
		cerrarCanales(br, bw, socket);
	}// main()
	
	private static Socket getSocket() {
		Socket socket=null;
		try {
			socket=new Socket("localhost", 20000);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return socket;
	}
	
	private static BufferedReader getBufferedReader(Socket socket) {
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return br;
	}// getBufferedReader()
	
	private static BufferedWriter getBufferedWriter(Socket socket) {
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bw;
	}// getBufferedWriter()
	
	private static void enviarMensaje(BufferedWriter bw, String mensaje) {
		try {
			bw.write(mensaje+"\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// enviarMensaje()
	
	private static String recibirMensaje(BufferedReader br) {
		String mensaje=null;
		try {
			mensaje=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensaje;
	}// recibirMensaje()
	
	private static void cerrarCanales(BufferedReader br, BufferedWriter bw, Socket socket) {
		try {
			br.close();
			bw.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// cerrarCanales()
	
}// Cliente