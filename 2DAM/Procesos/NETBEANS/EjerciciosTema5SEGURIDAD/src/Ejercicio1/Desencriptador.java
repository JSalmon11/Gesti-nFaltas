package Ejercicio1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Desencriptador {

    public static void main(String[] args) {
        File archivoClave = new File("clave.key");
        File archivoMensaje = new File("mensaje.cf");
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream(archivoClave));
            SecretKey clave = (SecretKey) (ois.readObject());
            ois.close();
            DataInputStream dis = new DataInputStream(new FileInputStream(archivoMensaje));
            byte[] mensajeCifrado = new byte[(int) archivoMensaje.length()];
            dis.readFully(mensajeCifrado);
            dis.close();
            Cipher descifrador = Cipher.getInstance(clave.getAlgorithm());
            descifrador.init(Cipher.DECRYPT_MODE, clave);
            byte[] mensajeDescifrado = descifrador.doFinal(mensajeCifrado);
            System.out.println(new String(mensajeDescifrado));
        } catch (IOException | ClassNotFoundException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }

    }

}
