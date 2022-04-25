package Ejercicio5.servidorDeClaves;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServidorDeClaves {

    public static void main(String[] args) {
        Datos datos = new Datos();
        DatagramSocket s = crearSocket();
        //El servidor espera peticiones y crea un hilo para gestionarlas
        while (true) {
            DatagramPacket paquete = recibirMensaje(s);
            Thread hilo = new Thread(new HiloComunicaciones(datos, paquete));
            hilo.start();
        }
    }

    private static DatagramPacket recibirMensaje(DatagramSocket s) {
        DatagramPacket respuesta = new DatagramPacket(new byte[1], 1);
        try {
            s.receive(respuesta);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return respuesta;
    }

    private static DatagramSocket crearSocket() {
        DatagramSocket s = null;
        try {
            s = new DatagramSocket(15000);
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }

}
