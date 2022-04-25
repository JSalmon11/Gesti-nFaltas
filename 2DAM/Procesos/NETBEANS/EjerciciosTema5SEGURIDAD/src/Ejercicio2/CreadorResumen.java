package Ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class CreadorResumen {

    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            System.out.println("Introduce un texto a encriptar:");
            Scanner sc = new Scanner(System.in);
            String mensaje = sc.nextLine();
            sc.close();

            md.update(mensaje.getBytes());

            byte[] resumen = md.digest();

            File archivoResumen = new File("resumen.md5");
            FileOutputStream fos = new FileOutputStream(archivoResumen);
            fos.write(resumen);
            fos.flush();
            fos.close();

            File archivoMensaje = new File("mensaje.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoMensaje));
            bw.write(mensaje);
            bw.flush();
            bw.close();

        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }

    }

}
