package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public static void main (String[] args)	{
		ServerSocket ssocket=getServerSocket();		
		if (ssocket!=null) {
			Socket socket=aceptarComs(ssocket);
			BufferedReader br=getBufferedReader(socket);
			BufferedWriter bw=getBufferedWriter(socket);
			while(true) {
				String mensaje=recibirMensaje(br);
				System.out.print("-----------------------------------"
						+ "\nRecibido:  "+mensaje+"\nRespuesta: ");
				
				Scanner teclado = new Scanner(System.in);
				String respuesta = teclado.nextLine();
				
				enviarMensaje(bw, respuesta);
			}
			
			//cerrarCanales(br, bw, socket);
		}
	}// main()
	
	private static ServerSocket getServerSocket()	{
		ServerSocket ssocket=null;
		try {
			ssocket=new ServerSocket(20000);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ssocket;
	}// getServerSocket()
	
	private static Socket aceptarComs(ServerSocket serverSocket)	{
		Socket socket=null;
		try {
			socket=serverSocket.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return socket;
	}// aceptarComs()
	
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
	
}// Servidor