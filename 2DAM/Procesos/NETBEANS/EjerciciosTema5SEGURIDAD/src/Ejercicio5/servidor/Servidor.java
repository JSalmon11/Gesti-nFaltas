package Ejercicio5.servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Servidor {

    public static void main(String[] args) {
        //Lo primero es recoger la clave. Este proceso
        //solamente debe hacerse una �nica vez.
        Datos datos = obtenerClave();
        try {
            ServerSocket ss = new ServerSocket(15000);
            while (true) {
                Socket s = ss.accept();
                Thread h = new Thread(new HiloServidor(datos, s));
                h.start();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //Obtenemos la clave del servidor de claves
    private static Datos obtenerClave() {
        Datos datos = null;
        InetAddress dir = null;
        int puerto = 15000;
        try {
            dir = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (dir != null) {
            DatagramSocket s = crearSocket();
            //Enviamos mensaje inicial al puerto 15000
            enviarMensaje(s, dir, puerto);
            //Recibimos la clave en Base64
            DatagramPacket paquete = recibirRespuesta(s);
            byte[] clave = paquete.getData();
            //Muy importante: la direcci�n IP normalmente no habr�
            //cambiado, pero al crearse un hilo para comunicarse
            //con nosotros su DatagramSocket estar� vinculado a
            //un puerto nuevo. Hemos de recoger esa informaci�n
            //y redirigir las comunicaciones al DatagramSocket
            //del hilo y no al del ServidorDeClaves.
            dir = paquete.getAddress();
            puerto = paquete.getPort();
            //Enviamos ok
            enviarMensaje(s, dir, puerto);
            //Recibimos el hash de la clave
            paquete = recibirRespuesta(s);
            byte[] hashClave = paquete.getData();
            datos = new Datos(clave, hashClave);
        }
        return datos;
    }

    private static DatagramSocket crearSocket() {
        DatagramSocket s = null;
        try {
            s = new DatagramSocket();
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }

    private static void enviarMensaje(DatagramSocket s, InetAddress dir, int puerto) {
        DatagramPacket paquete
                = new DatagramPacket(new byte[1], 1, dir, puerto);
        try {
            s.send(paquete);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static DatagramPacket recibirRespuesta(DatagramSocket s) {
        byte[] buffer = new byte[200];
        DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length);
        try {
            s.receive(respuesta);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return respuesta;
    }

}
