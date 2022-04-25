package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {
        Datos datos = new Datos();
        ServerSocket ss = getServerSocket();

        while (ss.isBound()) {
            Socket s = aceptarComs(ss);
            Thread hilo;
            hilo = new Thread(new HiloComunicador(datos, s));
            hilo.start();
        }
        cerrarCanales(ss);
    }// main()

    private static ServerSocket getServerSocket() {
        ServerSocket ssocket = null;
        try {
            ssocket = new ServerSocket(20000);
        } catch (IOException e) {
            System.out.println(e);
        }
        return ssocket;
    }// getServerSocket()

    private static Socket aceptarComs(ServerSocket serverSocket) {
        Socket socket = null;
        try {
            socket = serverSocket.accept();
        } catch (IOException e) {
            System.out.println(e);
        }
        return socket;
    }// aceptarComs()

    private static void cerrarCanales(ServerSocket ss) {
        try {
            ss.close();
        } catch (IOException ex) {
        }
    }// cerrarCanales()

}// Servidor
