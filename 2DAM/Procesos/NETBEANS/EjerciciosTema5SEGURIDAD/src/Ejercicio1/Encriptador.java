package Ejercicio1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Encriptador {

    public static void main(String[] args) {
        try {
            KeyGenerator kg = KeyGenerator.getInstance("DESede");
            kg.init(168, null);
            SecretKey clave = kg.generateKey();
            Cipher cifrador = Cipher.getInstance("DESede");
            cifrador.init(Cipher.ENCRYPT_MODE, clave);

            System.out.println("Introduce un texto a encriptar:");
            Scanner sc = new Scanner(System.in);
            String mensaje = sc.nextLine();
            sc.close();

            byte[] mensajeCifrado = cifrador.doFinal(mensaje.getBytes());
            System.out.println(new String(mensajeCifrado));

            File archivoClave = new File("clave.key");
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(archivoClave));
            ous.writeObject(clave);
            ous.flush();
            ous.close();

            File archivoMensaje = new File("mensaje.cf");
            FileOutputStream fos = new FileOutputStream(archivoMensaje);
            fos.write(mensajeCifrado);
            fos.flush();
            fos.close();

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException | IOException e) {
        }

    }
}
