package maxminmed;

import java.util.Scanner;

public class Minimo {

	public static void main(String[] args) {
        // El primer digito escoge si lo quieres por pantalla "p"  o lo quieres
        // guardar en un fichero de texto "t"
        // El segundo digito tiene que ser "a" para calcular el maximo 
        // "i" para el minimo y "m" para calcular la media
        // Recibe un array Ej: {p 1 4 6 7 32 12}
        // Devolvera el resultado de la operacion pedida
        int[] numeros=recibirNumeros();
        int minimo=DevMin(numeros);
        System.out.println(minimo);
    }
	
	private static int[] recibirNumeros(){
        Scanner input = new Scanner(System.in);
		String aDividir = input.nextLine();
        String[] numerosEnLetra =  aDividir.split(" ");
        int[] numeros=new int[numerosEnLetra.length];
        for(int i=0;i<numerosEnLetra.length;++i) {
        	numeros[i]=Integer.parseInt(numerosEnLetra[i]);
        }
        return numeros;
    }
	
	private static int DevMin(int[] numeros) {
        int numeroMenor = numeros[0];
        for (int i = 1; i < numeros.length; ++i) {
            if (numeroMenor > numeros[i]) {
                numeroMenor = numeros[i];
            }
        }
        return numeroMenor;
    }
	
}
