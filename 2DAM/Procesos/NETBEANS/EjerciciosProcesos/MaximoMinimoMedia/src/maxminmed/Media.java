package maxminmed;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		// El primer digito escoge si lo quieres por pantalla "p" o lo quieres
		// guardar en un fichero de texto "t"
		// El segundo digito tiene que ser "a" para calcular el maximo
		// "i" para el minimo y "m" para calcular la media
		// Recibe un array Ej: {p 1 4 6 7 32 12}
		// Devolvera el resultado de la operacion pedida
		int[] numeros = recibirNumeros();
		float media = DevMedia(numeros);
		System.out.println(media);
	}

	private static int[] recibirNumeros() {
		Scanner input = new Scanner(System.in);
		String aDividir = input.nextLine();
		String[] numerosEnLetra = aDividir.split(" ");
		int[] numeros = new int[numerosEnLetra.length];
		for (int i = 0; i < numerosEnLetra.length; ++i) {
			numeros[i] = Integer.parseInt(numerosEnLetra[i]);
		}
		return numeros;
	}

	private static float DevMedia(int[] numeros) {
		float media = 0;
		for (int i = 0; i < numeros.length; ++i) {
			media += numeros[i];
		}
		media = media / numeros.length;
		return media;
	}
}
