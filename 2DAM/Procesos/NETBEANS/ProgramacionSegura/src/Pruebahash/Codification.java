package Pruebahash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Codification {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1:HASH\n2:Criptografía Simétrica(Codificar)\n"
        + "3:Criptografía Simétrica(Decodificar)\n4:Criptografía Asimétrica");
        int elige = teclado.nextInt();
        switch(elige){
            case 1:Hash();break;
            case 2:Codificar();break;
            case 3:Decodificar();break;
            default:System.out.println("no");
        }
    }// main()

    private static void Hash() {
        Scanner teclado = new Scanner(System.in);
        String mensaje = teclado.nextLine();
        //Se crea el MessageDigest con el algoritmo elegido
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
        if (md != null) {
            //Con update incorporamos información
            md.update(mensaje.getBytes());
            //Con digest creamos el resumen que aglutina todos los fragmentos de 
            //información incorporados con update
            byte[] resumen = md.digest();

            System.out.println("Sus bytes:");
            for (int i = 0; i < resumen.length; ++i) {
                System.out.print(resumen[i] + ",");
            }
            System.out.println("\nEncriptado con Hash:");
            String mensajeCodificado = Base64.getEncoder().encodeToString(resumen);
            System.out.println(mensajeCodificado);
        }
    }// Codification()
    
    private static void Codificar() {
        //Se crea y configura el KeyGenerator
        KeyGenerator kg = null;
        try {
            //CODIFICAR
            kg = KeyGenerator.getInstance("AES");
            kg.init(128, null);
            SecretKey k = kg.generateKey();

            byte[] claveEnBytes = k.getEncoded();
            String claveEnString = Base64.getEncoder().encodeToString(claveEnBytes);
            FileWriter fw = new FileWriter(new File("clave_secreta.txt"));
            fw.write(claveEnString+"\n");

            Cipher c = Cipher.getInstance(k.getAlgorithm());

            c.init(Cipher.ENCRYPT_MODE, k);

            String mensaje = "atacaremos al amanecer";
            byte[] mensajeEncriptado = c.doFinal(mensaje.getBytes());

            String mensajeEncriptadoBase64= Base64.getEncoder().encodeToString(mensajeEncriptado);
            System.out.print("Encriptando.");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(mensajeEncriptadoBase64);
            fw.write(mensajeEncriptadoBase64);
            fw.close();
        } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            System.out.println(ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Codification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Codification.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// CriptografiaSimetrica()

    private static void Decodificar() {
        FileReader fr;
        try {
            fr = new FileReader(new File("clave_secreta.txt"));
            BufferedReader br = new BufferedReader(fr);
            String claveString = br.readLine();
            byte[] clave = Base64.getDecoder().decode(claveString);
            String mensajeEncriptadoString = br.readLine();
            byte[] mensajeEncriptado = Base64.getDecoder().decode(mensajeEncriptadoString);

            SecretKeySpec k = new SecretKeySpec(clave, "AES");

            Cipher c = Cipher.getInstance("AES");
            c.init(Cipher.DECRYPT_MODE,k);

            byte[] mensajeDesencriptado = c.doFinal(mensajeEncriptado);
            String mensajeDesencriptadoString = new String(mensajeDesencriptado);
            System.out.print("Desencriptando.");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(mensajeDesencriptadoString);
        } catch (FileNotFoundException e) {
        } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException | InterruptedException e) {
        }
    }// Decodificar()
    
    private static void CriptografiaAsimetrica() {
        
    }// CriptografiaAsimetrica()
    
}// Codification
