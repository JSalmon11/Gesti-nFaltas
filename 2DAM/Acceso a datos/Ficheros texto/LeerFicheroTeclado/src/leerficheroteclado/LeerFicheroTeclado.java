package leerficheroteclado;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerFicheroTeclado {
    private static Scanner  teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Qué fichero quieres leer?");
        String ficheroaleer = teclado.nextLine();
        File fichero=new File(ficheroaleer+".txt");
        String frase;
        int car;
        int contLineas=0;
        int contChar=0;
        int contPalabras=0;
        try{
            FileReader frText=new FileReader(fichero);
            BufferedReader brText=new BufferedReader(frText);
            frase = brText.readLine();
            while (frase!=null) {
                ++contLineas;
                frase = brText.readLine();
            }           
            brText.close();
            frText.close();
            
            frText=new FileReader(fichero);
            brText=new BufferedReader(frText);
            car = frText.read();
            while (car!=-1) {                
                ++contChar;
                car = frText.read();
            }
            brText.close();
            frText.close();
            
            frText=new FileReader(fichero);
            brText=new BufferedReader(frText);
            String[] lineas;
            frase = brText.readLine();
            while (frase!=null) {
                lineas=frase.split(" ");
                contPalabras += lineas.length;
                frase = brText.readLine();
            }
            brText.close();
            frText.close();
            
            System.out.println("El fichero "+ficheroaleer+".txt, tiene "
                    +contLineas+" líneas, "+contPalabras+" palabras y "+contChar+" caracteres");
            
        }catch(IOException e){
            System.out.println("ERROR: fichero inexistente");
        }
    }// main()
    
}// LeerFicheroTeclado
