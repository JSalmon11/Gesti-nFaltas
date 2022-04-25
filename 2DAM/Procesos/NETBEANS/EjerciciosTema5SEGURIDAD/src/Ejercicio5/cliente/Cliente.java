package Ejercicio5.cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Cliente {

    public static void main(String[] args) {
        try {
            //Primero, contactamos con el servidor de claves para recoger la clave
            SecretKey clave = obtenerClave();
            //Con la clave, enviamos un mensaje al servidor y esperamos respuesta.
            InetAddress dir = InetAddress.getByName("localhost");
            Socket s = new Socket(dir, 15000);
            try {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                enviarMensaje(bw, "Tierra a Jupiter", clave);
                recibirMensaje(br, clave);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //Las funciones para enviar y recibir mensajes y para encriptar y desencriptar son exactamente las mismas
    //que las que tiene el HiloServidor.
    //Las funciones para contactar con el servidor de claves y, comprobar la integridad de la clave y 
    //reconstruirla son iguales que las que est�n en Ejercicio5.servidor.Datos.
    private static void recibirMensaje(BufferedReader br, SecretKey clave) {
        try {
            String mensajeCodificado = br.readLine();
            String mensaje = codificarDecodificarMensaje(mensajeCodificado, clave, Cipher.DECRYPT_MODE);
            System.out.println("Mensaje recibido: " + mensaje);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void enviarMensaje(BufferedWriter bw, String mensaje, SecretKey clave) {
        String mensajeCodificado = codificarDecodificarMensaje(mensaje, clave, Cipher.ENCRYPT_MODE);
        try {
            bw.write(mensajeCodificado + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String codificarDecodificarMensaje(String mensaje, SecretKey clave, int accion) {
        String mensajeFinal = null;
        try {
            Cipher cifrador = Cipher.getInstance(clave.getAlgorithm());
            cifrador.init(accion, clave);

            if (accion == Cipher.ENCRYPT_MODE) {
                byte[] mensajecodificado = cifrador.doFinal(mensaje.getBytes());
                mensajeFinal = Base64.getEncoder().encodeToString(mensajecodificado);
            } else if (accion == Cipher.DECRYPT_MODE) {
                byte[] mensajeCodificado = Base64.getDecoder().decode(mensaje);
                mensajeFinal = new String(cifrador.doFinal(mensajeCodificado));
            }

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return mensajeFinal;
    }

    //Obtenemos la clave del servidor de claves
    private static SecretKey obtenerClave() {
        SecretKey clave = null;
        InetAddress dir = null;
        int puerto = 15000;
        try {
            dir = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        if (dir != null) {
            DatagramSocket s = crearSocket();
            //Enviamos mensaje inicial
            enviarMensaje(s, dir, puerto);
            //Recibimos la clave en Base64
            DatagramPacket paquete = recibirRespuesta(s);
            dir = paquete.getAddress();
            puerto = paquete.getPort();
            byte[] claveBase64 = paquete.getData();
            //Enviamos ok
            enviarMensaje(s, dir, puerto);
            //Recibimos el hash de la clave
            paquete = recibirRespuesta(s);
            byte[] hashClave = paquete.getData();

            claveBase64 = limpiarMensaje(claveBase64);
            hashClave = limpiarMensaje(hashClave);
            if (validarHash(claveBase64, hashClave)) {
                clave = reconstruirClave(claveBase64);
            }
        }
        return clave;
    }

    private static DatagramSocket crearSocket() {
        DatagramSocket s = null;
        try {
            s = new DatagramSocket();
        } catch (SocketException e) {
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
            e.printStackTrace();
        }
    }

    private static DatagramPacket recibirRespuesta(DatagramSocket s) {
        byte[] buffer = new byte[200];
        DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length);
        try {
            s.receive(respuesta);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    private static byte[] limpiarMensaje(byte[] mensaje) {
        int longitud = 0;
        for (int i = mensaje.length - 1; i >= 0 && longitud == 0; --i) {
            if (mensaje[i] != 0) {
                longitud = i + 1;
            }
        }
        byte[] mensajeLimpio = new byte[longitud];
        for (int i = 0; i < longitud; ++i) {
            mensajeLimpio[i] = mensaje[i];
        }
        return mensajeLimpio;
    }

    private static boolean validarHash(byte[] mensaje, byte[] hash) {
        //Creamos el hash del mensaje
        MessageDigest md;
        boolean valido = false;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(mensaje);
            byte[] nuevoHash = md.digest();

            String hashString = Base64.getEncoder().encodeToString(hash);
            String nuevoHashString = Base64.getEncoder().encodeToString(nuevoHash);
            valido = hashString.equals(nuevoHashString);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return valido;
    }

    private static SecretKey reconstruirClave(byte[] claveBase64) {
        byte[] claveDecodificada = Base64.getDecoder().decode(claveBase64);
        return new SecretKeySpec(claveDecodificada, "AES");
    }

}
