package Ejercicio4;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.security.PrivateKey;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Programa1 {

    public static void main(String[] args) {
        String rutaAlmacen = "assets\\certificados.p12";
        char[] contrasenha = "fnmt".toCharArray();
        String alias = "español español juan - dni 00000000t's fnmt-rcm id";

        try {
            // Cargamos primero el certificado
            KeyStore almacen = KeyStore.getInstance("PKCS12");
            FileInputStream fis = new FileInputStream(rutaAlmacen);
            almacen.load(fis, contrasenha);
            fis.close();

            //Ahora cargamos la clave privada y creamos un descifrador con ella
            PrivateKey privada = (PrivateKey) almacen.getKey(alias, contrasenha);
            Cipher cifradorClavePrivada = Cipher.getInstance(privada.getAlgorithm());
            cifradorClavePrivada.init(Cipher.DECRYPT_MODE, privada);

            //Esperamos el mensaje del programa 2 con la clave sim�trica codificada
            //con la clave p�blica
            DatagramSocket socket = getSocketParaRecibir(10000);
            DatagramPacket paquete = recibirMensaje(socket, 256);
            int puertoRespuesta = paquete.getPort();
            InetAddress dir = paquete.getAddress();
            byte[] claveRaw = cifradorClavePrivada.doFinal(paquete.getData());

            //Reconstruimos la clave y mandamos un mensaje con ella
            //Primero mandamos la longitud, y luego el propio mensaje
            SecretKeySpec claveReconstruida = new SecretKeySpec(claveRaw, "AES");
            Cipher cifradorClaveSimetrica = Cipher.getInstance(claveReconstruida.getAlgorithm());
            cifradorClaveSimetrica.init(Cipher.ENCRYPT_MODE, claveReconstruida);

            String mensaje = "en un lugar de la mancha";
            byte[] mensajeCodificado = cifradorClaveSimetrica.doFinal(mensaje.getBytes());
            byte[] longitudCodificada = cifradorClaveSimetrica.doFinal(ByteBuffer.allocate(4).putInt(mensajeCodificado.length).array());

            enviarMensaje(socket, longitudCodificada, dir, puertoRespuesta);
            enviarMensaje(socket, mensajeCodificado, dir, puertoRespuesta);

        } catch (Exception e) {
            // La gesti�n de las excepciones deber�a ser mucho m�s personalizada, o
            // descomponer en funciones
            e.printStackTrace();
        }
    }

    private static DatagramSocket getSocketParaRecibir(int puerto) {
        DatagramSocket ds;
        try {
            ds = new DatagramSocket(puerto);
        } catch (SocketException e) {
            ds = null;
        }
        return ds;
    }

    private static void enviarMensaje(DatagramSocket ds, byte[] mensaje, InetAddress direccion, int puerto) {
        DatagramPacket dp = new DatagramPacket(mensaje, mensaje.length, direccion, puerto);
        try {
            ds.send(dp);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        }

    }

    private static DatagramPacket recibirMensaje(DatagramSocket ds, int longitud) {
        byte[] buffer = new byte[longitud];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        try {
            ds.receive(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dp;
    }

}
