package SSLSocket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

public class Server {

    public static void main(String[] args) {
        try {
            KeyStore k = KeyStore.getInstance("pkcs12");
            k.load(new FileInputStream(new File("claves.pk12")),"123qwe".toCharArray());
            
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(k, "123qwe".toCharArray());
            
            SSLContext contexto = SSLContext.getInstance("TLS");
            contexto.init(kmf.getKeyManagers(), null, null);
            
            SSLServerSocket sss = (SSLServerSocket) contexto.getServerSocketFactory().createServerSocket();
            
            while (true) {                
                SSLSocket ss = (SSLSocket) sss.accept();
            }
        }
        catch (KeyStoreException | IOException | NoSuchAlgorithmException | CertificateException | UnrecoverableKeyException | KeyManagementException ex) {
            System.out.println(ex);
        }
    }// main()

}// Server