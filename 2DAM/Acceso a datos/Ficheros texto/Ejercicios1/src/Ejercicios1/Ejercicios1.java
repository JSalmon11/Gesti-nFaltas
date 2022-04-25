package Ejercicios1;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class Ejercicios1 {
    public static void main(String[] args) {
        FraseHastaAsterisco();
        //CuentaLineas();
        //QuitaVocales();
    }
    
        public static void FraseHastaAsterisco(){
            Scanner teclado=new Scanner(System.in);
            String frase;
            File f=new File("parrafo.txt");
            try{
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(fw);
                System.out.println("Introducir frase, para cabaar pulsa *");
                frase=teclado.nextLine();
                while(!frase.equals("*")){
                    bw.write(frase);
                    bw.newLine();
                    System.out.println("Introducir frase, para cabaar pulsa *");
                    frase=teclado.nextLine();
                }
                bw.close();
                fw.close();

                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                frase=br.readLine();
                while(frase!=null){
                    System.out.println(frase);
                    frase=br.readLine();
                }
                br.close();
                fr.close();
            }catch(IOException e){
                System.out.println("ERROR");
            }
        }// FraseHastaAsterisco()
        
        public static void CuentaLetras(){
            
        }// CuentaLetras()
    
        public static void CuentaLineas(){
            File f=new File("parrafo.txt");
            Scanner teclado=new Scanner(System.in);

            try{
                
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                int lineas=0;
                while(br.readLine() != null){
                    lineas++;
                }
                System.out.println("El archivo tiene "+lineas+" lineas");
                fr.close();
                br.close();

                fr=new FileReader(f);
                br=new BufferedReader(fr);
                System.out.println("¿Que linea quieres leer de la 1 a la "+lineas+"?");
                int linealeer=teclado.nextInt()-1;
                String lineatext=br.readLine();
                for(int i=1; i<=linealeer; i++){
                    lineatext=br.readLine();
                }
                fr.close();
                br.close();
                System.out.println("La linea "+(linealeer+1)+" dice "+lineatext);

            }catch(IOException e){
                System.out.println("ERROR");
            }
        }// CuentaLineas()

        public static void QuitaVocales(){
            File f=new File("parrafo.txt");
            try {
                
                FileReader fr=new FileReader(f);
                int vocal = fr.read(); 
                while (vocal != -1) {
                    if (vocal =='a' || vocal =='e' || vocal =='i' ||
                        vocal =='o' || vocal =='u' || vocal =='A' ||
                        vocal =='E' || vocal =='I' || vocal =='O' ||
                        vocal =='U'){
                        System.out.print(" ");
                    }else{
                        System.out.print((char)vocal);                       
                    }
                    vocal = fr.read();
                }
                System.out.println();
                
            }catch(Exception e) {
                System.out.println("ERROR");
            }
        }// QuitaVocales()

}// Ejercicios1
