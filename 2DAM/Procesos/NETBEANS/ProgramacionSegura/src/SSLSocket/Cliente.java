package SSLSocket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;

public class Cliente {

    public static void main(String[] args) {

        try {
            KeyStore k = KeyStore.getInstance("pkcs12");
            k.load(new FileInputStream(new File("claves.pk12")), "123qwe".toCharArray());

            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init(k);

            SSLContext contexto = SSLContext.getInstance("TLS");
            contexto.init(null, tmf.getTrustManagers(), null);

            SSLSocket ss = (SSLSocket) contexto.getSocketFactory().createSocket();

        }catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException | KeyManagementException e) {
            System.out.println(e);
        }   

    }// main()

}// Cliente
