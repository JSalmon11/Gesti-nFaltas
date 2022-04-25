package maxminmed;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaximoMinimoMedia {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // El primer digito escoje si lo quieres por pantalla "p"  o lo quieres
        // guardar en un fichero de texto "t"
        // El segundo digito tiene que ser "a" para calcular el maximo 
        // "i" para el minimo y "m" para calcular la media
        // Recibe un array Ej: {p 1 4 6 7 32 12}
        // Devolvera el resultado de la operacion pedida
        System.out.println(SelectorOperacion());
        
    }
    
    private static float SelectorOperacion(){
        String aDividir = input.nextLine();
        String[] Calcular =  aDividir.split(" ");
        if(Calcular[0].equals("p")){
            return salidaPorPantalla(Calcular);
        }else if(Calcular[0].equals("t")){
            salidaPorFichero(Calcular);
        }
        return 303;
    }

    private static float salidaPorPantalla(String [] Calcular){
        float Resultado = 0;
        {
            switch (Calcular[1]){
                case "a": 
                    Resultado = DevMax(Calcular);
                break;
                case "i": 
                    Resultado = DevMin(Calcular);
                break; 
                case "m": 
                    Resultado = DevMed(Calcular);
                break;
                
            }  
        return Resultado;
    
        }
    }
    private static void salidaPorFichero(String [] Calcular){
        
        File f = new File("Errores.txt");
        switch ( Calcular[1]){
                case "a": 
                    f = new File("maximo.txt");
                break;
                case "i": 
                    f = new File("minimo.txt");
                break; 
                case "m": 
                    f = new File("media.txt");
                break; 
        }
        try{
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw); 
            bw.write(String.valueOf( salidaPorPantalla(Calcular)));                
        }catch(IOException e){
            System.out.println("99989");
        }
    }
    
    
    private static int DevMax(String[] numeros) {
        int numeroMayor = Integer.parseInt(numeros[2]);
        for (int i = 3; i < numeros.length; ++i) {
            if (numeroMayor > Integer.parseInt(numeros[i])) {
            } else {
                numeroMayor = Integer.parseInt(numeros[i]);
            }
        }
        return numeroMayor;
    }
    private static int DevMin(String[] numeros) {
        int numeroMenor = Integer.parseInt(numeros[2]);
        for (int i = 3; i < numeros.length; ++i) {
            if (numeroMenor > Integer.parseInt(numeros[i])) {
                numeroMenor = Integer.parseInt(numeros[i]);
            }
        }
        return numeroMenor;
    }
    private static float DevMed(String[] numeros) {
        int media = 0;
        int cont =0 ;
        for (int i = 2; i < numeros.length; ++i) {
            media += Integer.parseInt(numeros[i]);
            ++cont;
        }
        
        return (media/cont);
    }
}
