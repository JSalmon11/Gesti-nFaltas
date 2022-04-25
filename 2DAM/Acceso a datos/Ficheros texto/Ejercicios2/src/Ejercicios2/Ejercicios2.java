package Ejercicios2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicios2 {
    private static Scanner  teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //InvertirTexto();
        //CuentaNLineas();
        EncriptarTexto();
    }// main()
    
    public static void InvertirTexto(){
        File texto=new File("texto.txt");
        File textoinvert=new File("invertido.txt");
        String frase;
        String fraseinvertida;
        
        try{
            FileReader frText=new FileReader(texto);
            BufferedReader brText=new BufferedReader(frText);
            FileWriter fwTextInvert=new FileWriter(textoinvert);
            BufferedWriter bwTextInvert=new BufferedWriter(fwTextInvert);
            frase = brText.readLine();
            while (frase!=null) {                
                StringBuilder sb=new StringBuilder(frase);
                sb.reverse();
                bwTextInvert.write(sb.toString());
                bwTextInvert.newLine();
                frase = brText.readLine();
            }
            brText.close();
            frText.close();
            
            bwTextInvert.close();
            fwTextInvert.close();
            
            FileReader frTextInvert=new FileReader(textoinvert);
            BufferedReader brTextInvert=new BufferedReader(frTextInvert);
            fraseinvertida = brTextInvert.readLine();
            while (fraseinvertida!=null) {
                System.out.println(fraseinvertida);
                fraseinvertida = brTextInvert.readLine();
            }
            
            brTextInvert.close();
            frTextInvert.close();
            
            }catch(IOException e){
                System.out.println("ERROR");
            }
    }// InvertirTexto()
    
    public static void CuentaNLineas(){
        File texto=new File("texto.txt");
        String frase;
        System.out.println("¿Cuántas líneas quieres leer?");
        int LineasLeer=teclado.nextInt();
        
        try{
            FileReader frText=new FileReader(texto);
            BufferedReader brText=new BufferedReader(frText);
            frase = brText.readLine();
            for (int i = 0; i < LineasLeer; i++) {
                if (frase==null){
                    System.out.println("\n"+"No hay más líneas para leer");
                    i = LineasLeer+1;
                }else{
                    System.out.println(frase);
                    frase = brText.readLine();
                }
            }
        
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }// CuentaNLineas()
    
    public static void EncriptarTexto(){
        File fText=new File("texto.txt");
        File fEncript=new File("Encriptado.txt");
            try {
                FileReader frText=new FileReader(fText);
                FileWriter fwEncript=new FileWriter(fEncript);
                int car=frText.read();               
                while (car!=-1){
                    if (car==' '){
                        fwEncript.write(" ");
                    }else{                       
                        switch (car){
                            case 'x' : fwEncript.write('a');
                                break;
                            case 'y' : fwEncript.write('b');
                                break;
                            case 'z' : fwEncript.write('c');
                                break;
                            case ',' : fwEncript.write(',');
                                break;
                            case '.' : fwEncript.write('.');
                                break;
                            case 10 : fwEncript.write(10);
                                break;
                            
                            default : fwEncript.write((char)(car+3));
                                break;
                        }
                    }
                    car=frText.read();
                }
                fwEncript.close();
                frText.close();
                
                frText=new FileReader(fEncript);
                BufferedReader brEncript = new BufferedReader(frText);
                String frase=brEncript.readLine();
                while (frase!=null) {
                    System.out.println(frase);
                    frase = brEncript.readLine();
                }
                brEncript.close();
                frText.close();
                
            }catch(Exception e) {
                System.out.println("ERROR");
            }
    }// EncriptarTexto()
    
}// Ejercicios2
