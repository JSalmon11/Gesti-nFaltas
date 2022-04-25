package Ejercicio4;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.Certificate;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Programa2 {

    public static void main(String[] args) {
        String rutaAlmacen = "assets\\importados.keystore";
        char[] contrasenha = "369258".toCharArray();
        String alias = "publica";

        try {
            // Cargamos primero el certificado
            KeyStore almacen = KeyStore.getInstance("JKS");
            FileInputStream fis = new FileInputStream(rutaAlmacen);
            almacen.load(fis, contrasenha);
            fis.close();

            // Extraemos el certificado, de �l la clave p�blica y creamos un Cipher con ella
            Certificate certificado = almacen.getCertificate(alias);
            PublicKey publica = certificado.getPublicKey();
            Cipher cifradorCertificado = Cipher.getInstance(publica.getAlgorithm());
            cifradorCertificado.init(Cipher.ENCRYPT_MODE, publica);

            // Ahora creamos la clave
            KeyGenerator kg = KeyGenerator.getInstance("AES");
            SecretKey clave = kg.generateKey();

            // Encriptamos con la clave p�blica la SecretKey
            byte[] claveCodificada = cifradorCertificado.doFinal(clave.getEncoded());

            //Mandamos la clave codificada con la clave p�blica por DatagramSocket.
            //Preparamos la clave para decodificar
            DatagramSocket socket = getSocketParaEnviar();
            InetAddress dir = getDireccion("localhost");
            enviarMensaje(socket, claveCodificada, dir, 10000);
            Cipher cifrador = Cipher.getInstance(clave.getAlgorithm());
            cifrador.init(Cipher.DECRYPT_MODE, clave);

            //Ahora recibir�amos la longitud del mensaje a recibir, codificada. La decodificamos
            byte[] mensajeRecibido = recibirMensajeCifrado(socket, 16, cifrador);
            int longitud = ByteBuffer.wrap(mensajeRecibido).getInt();

            //Y, por �ltimo, recibir�amos el mensaje
            mensajeRecibido = recibirMensajeCifrado(socket, longitud, cifrador);
            String mensaje = new String(mensajeRecibido);
            System.out.println("El mensaje recibido del programa 1 es: " + mensaje);

        } catch (Exception e) {
            // La gesti�n de las excepciones deber�a ser mucho m�s personalizada, o
            // descomponer en funciones
            e.printStackTrace();
        }
    }

    private static DatagramSocket getSocketParaEnviar() {
        DatagramSocket ds;
        try {
            ds = new DatagramSocket();
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

    private static byte[] recibirMensajeCifrado(DatagramSocket ds, int longitud, Cipher cifrador) {
        byte[] mensajeDecodificado = null;
        byte[] buffer = new byte[longitud];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        try {
            ds.receive(dp);
            mensajeDecodificado = cifrador.doFinal(buffer);
        } catch (IOException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return mensajeDecodificado;
    }

    private static InetAddress getDireccion(String direccion) {
        InetAddress dir;
        try {
            dir = InetAddress.getByName(direccion);
        } catch (UnknownHostException e) {
            dir = null;
        }
        return dir;
    }
}
