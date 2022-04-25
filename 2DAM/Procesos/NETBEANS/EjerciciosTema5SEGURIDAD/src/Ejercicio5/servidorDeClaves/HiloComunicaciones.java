package Ejercicio5.servidorDeClaves;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//La clase Ejercicio5.servidorDeClaves.HiloComunicaciones gestiona las comunicaciones
//con Cliente y Servidor para enviar la clave y el hash de la clave.
public class HiloComunicaciones implements Runnable {

    private Datos datos;
    private InetAddress dirDestino;
    private int puertoDestino;

    public HiloComunicaciones(Datos datos, DatagramPacket paqueteDelDestino) {
        this.datos = datos;
        dirDestino = paqueteDelDestino.getAddress();
        puertoDestino = paqueteDelDestino.getPort();
    }

    @Override
    public void run() {
        //Crear un socket para enviar
        DatagramSocket s = crearSocket();

        if (s != null) {
            //Enviar la clave
            enviarMensaje(s, datos.getClave());

            //Recibimos ok
            recibirRespuesta(s);

            //Enviar el hash
            enviarMensaje(s, datos.getHash());

            //Recibimos ok
            recibirRespuesta(s);
        }
    }

    private void enviarMensaje(DatagramSocket s, byte[] mensaje) {
        DatagramPacket paquete
                = new DatagramPacket(mensaje, mensaje.length, dirDestino, puertoDestino);
        try {
            s.send(paquete);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void recibirRespuesta(DatagramSocket s) {
        DatagramPacket respuesta = new DatagramPacket(new byte[1], 1);
        try {
            s.receive(respuesta);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private DatagramSocket crearSocket() {
        DatagramSocket s = null;
        try {
            s = new DatagramSocket();
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }

}
