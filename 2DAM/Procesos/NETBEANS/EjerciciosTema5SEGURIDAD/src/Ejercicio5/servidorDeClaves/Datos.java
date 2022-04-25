package Ejercicio5.servidorDeClaves;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

//La clase Ejercicio5.servidorDeClaves.Datos es la que genera y custodia
//la clave secreta, para que los hilos puedan extraerla y mandarla por UDP
public class Datos {

    private byte[] claveEnBase64;
    private byte[] claveEnHash;

    public Datos() {
        generarClave();
    }

    public byte[] getClave() {
        return claveEnBase64;
    }

    public byte[] getHash() {
        return claveEnHash;
    }

    //Esta funci�n solamente debe invocarse una vez
    private void generarClave() {
        try {
            KeyGenerator kg = KeyGenerator.getInstance("AES");
            kg.init(128, null);
            SecretKey clave = kg.generateKey();
            byte[] claveEnBytes = clave.getEncoded();
            claveEnBase64 = Base64.getEncoder().encode(claveEnBytes);

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(claveEnBase64);
            claveEnHash = md.digest();

        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
