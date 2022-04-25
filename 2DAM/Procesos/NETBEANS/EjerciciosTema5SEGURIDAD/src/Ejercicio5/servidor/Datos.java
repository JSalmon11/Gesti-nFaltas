package Ejercicio5.servidor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Datos {

    private SecretKey clave;

    //La clase Datos contacta con el servidor de claves
    //para recibir la clave, comprueba su integridad,
    //la reconstruye y la ofrece a los hilos que
    //el servidor vaya creando.
    public Datos(byte[] claveBase64, byte[] hash) {
        claveBase64 = limpiarMensaje(claveBase64);
        hash = limpiarMensaje(hash);
        if (validarHash(claveBase64, hash)) {
            clave = reconstruirClave(claveBase64);
        }
    }

    public SecretKey getClave() {
        return clave;
    }

    //Esta funci�n elimina todos los ceros que puedan sobrar del
    //mensaje. Si la elecci�n de algoritmos fuese fija, podr�amos
    //haber creado buffers del tama�o exacto.
    private byte[] limpiarMensaje(byte[] mensaje) {
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

    //Esta funci�n comprueba que el hash se corresponde con la clave.
    private boolean validarHash(byte[] mensaje, byte[] hash) {
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return valido;
    }

    //Genera un objeto SecretKey a partir de la clave en bytes.
    private SecretKey reconstruirClave(byte[] claveBase64) {
        byte[] claveDecodificada = Base64.getDecoder().decode(claveBase64);
        return new SecretKeySpec(claveDecodificada, "AES");
    }

}
