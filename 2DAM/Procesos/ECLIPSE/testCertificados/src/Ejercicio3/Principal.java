package Ejercicio3;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Pedimos datos al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del almacen:");
        String nombreAlmacen = sc.nextLine();
        System.out.println("Alias del certificado:");
        String alias = sc.nextLine();
        System.out.println("Password:");
        String contrasenha = sc.nextLine();
        sc.close();
        // Cargamos el almacen
        KeyStore almacen = cargarAlmacen("./assets/" + nombreAlmacen, contrasenha);

        // Extraemos el certificado
        X509Certificate certificado = null;
        if (almacen != null) {
            certificado = extraerCertificado(almacen, alias);
            if (certificado != null) {
                if (estaEnVigor(certificado)) {
                    System.out.println("El certificado esta en vigor");
                } else {
                    System.out.println("El certificado ha caducado");
                }
            }
        }
    }

    private static KeyStore cargarAlmacen(String ruta, String contrasenha) {
        KeyStore almacen;
        try {
            almacen = KeyStore.getInstance("JKS");
            FileInputStream fis = new FileInputStream(ruta);
            almacen.load(fis, contrasenha.toCharArray());
            fis.close();
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e) {
            System.out.println(e);
            almacen = null;
        }
        return almacen;
    }

    private static X509Certificate extraerCertificado(KeyStore almacen, String alias) {
        X509Certificate certificado;
        try {
            certificado = (X509Certificate) almacen.getCertificate(alias);
        } catch (KeyStoreException e) {
            e.printStackTrace();
            certificado = null;
        }
        return certificado;
    }

    // Devuelve true si el certificado est� en vigor
    private static boolean estaEnVigor(X509Certificate certificado) {
        Date fechaExpiracion = certificado.getNotAfter();
        Date ahora = new Date();
        return ahora.before(fechaExpiracion);
    }

}
