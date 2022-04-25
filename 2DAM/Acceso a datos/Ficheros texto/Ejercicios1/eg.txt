package contadordeletras;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class ContadorDeLetras {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String frase;
        File f=new File("parrafo.txt");
        File f2=new File("letras.txt");
        int[] cont=new int[26];
        for (int i = 0; i < cont.length; i++) 
            cont[i]=0;
        
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
            int letra=fr.read();
            while (letra != -1) {
                if (letra >= 'a' && letra <= 'z'){
                    cont[letra-97]++;
                    letra=fr.read();
                }
            }
            fr.close();
            
            FileWriter fw2=new FileWriter(f2);
            BufferedWriter bw2=new BufferedWriter(fw);
            
            for (int i=0;i<cont.length;i++){
                System.out.println("La letra "+(char)(97+i)+"se ha repetido"+cont[i]);
            }
                
        }catch(IOException e){
            System.out.println("ERROR");
        }
}