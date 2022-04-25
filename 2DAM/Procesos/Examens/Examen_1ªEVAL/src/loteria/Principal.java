package loteria;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args)	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero de sorteos a realizar:");
		int sorteos = teclado.nextInt();
		System.out.println("Numero de apostantes:");
		int apostantes  = teclado.nextInt();
		
		Datos datos = new Datos(sorteos, apostantes);
		Thread[] hilo = new Thread[apostantes];
		for (int i = 0; i < hilo.length; ++i) {
			hilo[i] = new Thread(new Hilo(sorteos, datos));
			hilo[i].start();
		}
		for (int i = 0; i < hilo.length; ++i) {
			try {
				hilo[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		datos.end();
	}// main()
	
}// Principal