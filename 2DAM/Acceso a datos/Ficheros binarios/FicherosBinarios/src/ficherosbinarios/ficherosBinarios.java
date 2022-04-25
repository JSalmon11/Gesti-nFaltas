package ficherosbinarios;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class ficherosBinarios {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        File f=new File("Ficheros.bin");
        
        try {
            FileOutputStream fos=new FileOutputStream(f, true);
            DataOutputStream dos=new DataOutputStream(fos);
            
            String nombre;
            int edad;
            double nota;
            System.out.println("Introducir nombre(* para acabar)");
            nombre=teclado.nextLine();
            
            while (!nombre.equalsIgnoreCase("*")) {
                System.out.println("Introducir edad");
                edad=teclado.nextInt();
                System.out.println("Introducir nota");
                nota=teclado.nextDouble();
                dos.writeUTF(nombre);
                dos.writeInt(edad);
                dos.writeDouble(nota);
                //Por los problemas del nexline yu know
                teclado.nextLine();
                System.out.println("Introducir nombre(* para acabar)");
                nombre=teclado.nextLine();
            }
            dos.close();
            fos.close();
            
            FileInputStream fis=new FileInputStream(f);
            DataInputStream dis=new DataInputStream(fis);
            
            try {
                while (true) {                    
                    nombre=dis.readUTF();
                    edad=dis.readInt();
                    nota=dis.readDouble();
                    System.out.println(nombre+" "+edad+" "+nota);
                }
                
            } catch (EOFException e) {
                System.out.println("\nSe acabó el fichero");
            }
            fis.close();
            dis.close();
            
        } catch (IOException e) {
        }
    }
    
}
