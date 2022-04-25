package Ejercicio2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ComprobadorResumen {

    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            File archivoMensaje = new File("mensaje.txt");
            BufferedReader br = new BufferedReader(new FileReader(archivoMensaje));
            String mensaje = br.readLine();
            br.close();

            File archivoResumen = new File("resumen.md5");
            DataInputStream dis = new DataInputStream(new FileInputStream(archivoResumen));
            byte[] resumen = new byte[(int) archivoResumen.length()];
            dis.readFully(resumen);
            dis.close();

            md.update(mensaje.getBytes());
            byte[] resumen2 = md.digest();

            if (resumenesSonIguales(resumen, resumen2)) {
                System.out.println("El mensaje se corresponde con su resumen");
            } else {
                System.out.println("El mensaje no se corresponde con su resumen");
            }

        } catch (NoSuchAlgorithmException | IOException e) {
        }

    }// main()

    private static boolean resumenesSonIguales(byte[] resumen1, byte[] resumen2) {
        boolean sonIguales = true;
        for (int i = 0; i < resumen1.length == sonIguales; ++i) {
            if (resumen1[i] != resumen2[i]) {
                sonIguales = false;
            }
        }
        return sonIguales;
    }// resumenesSonIguales()

}// ComprobadorResumen