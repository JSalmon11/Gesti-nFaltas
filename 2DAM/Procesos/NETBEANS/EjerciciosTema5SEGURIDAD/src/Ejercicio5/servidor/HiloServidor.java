package Ejercicio5.servidor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class HiloServidor implements Runnable {

    private Datos datos;
    private Socket socket;

    public HiloServidor(Datos datos, Socket socket) {
        this.datos = datos;
        this.socket = socket;
    }

    @Override
    public void run() {
        //Obtenemos la clave de Datos. No contactamos con el servidor de claves.
        SecretKey clave = datos.getClave();

        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            recibirMensaje(br, clave);
            enviarMensaje(bw, "Saludos, terricola", clave);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void recibirMensaje(BufferedReader br, SecretKey clave) {
        try {
            String mensajeCodificado = br.readLine();
            String mensaje = codificarDecodificarMensaje(mensajeCodificado, clave, Cipher.DECRYPT_MODE);
            System.out.println("Mensaje recibido: " + mensaje);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void enviarMensaje(BufferedWriter bw, String mensaje, SecretKey clave) {
        String mensajeCodificado = codificarDecodificarMensaje(mensaje, clave, Cipher.ENCRYPT_MODE);
        try {
            bw.write(mensajeCodificado + "\n");
            bw.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //Esta funci�n codifica y decodifica, dependiendo del par�metro accion.
    private String codificarDecodificarMensaje(String mensaje, SecretKey clave, int accion) {
        String mensajeFinal = null;
        try {
            Cipher cifrador = Cipher.getInstance(clave.getAlgorithm());
            cifrador.init(accion, clave);

            //Para encriptar, primero encripta con el cifrador y luego codifica en Base64
            if (accion == Cipher.ENCRYPT_MODE) {
                byte[] mensajecodificado = cifrador.doFinal(mensaje.getBytes());
                mensajeFinal = Base64.getEncoder().encodeToString(mensajecodificado);
            } //Para desencriptar, primero decodifica el Base64 y despu�s desencripta con el cifrador.
            else if (accion == Cipher.DECRYPT_MODE) {
                byte[] mensajeCodificado = Base64.getDecoder().decode(mensaje);
                mensajeFinal = new String(cifrador.doFinal(mensajeCodificado));
            }

        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BadPaddingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mensajeFinal;
    }

}
