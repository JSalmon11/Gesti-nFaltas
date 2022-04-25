package buscapalabras;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main (String[] args)	{
		Scanner teclado=new Scanner(System.in);
		System.out.print("Palabra a buscar: ");
		String clave=teclado.nextLine();
		System.out.println("Buscando...");
		int nHilosConsumidores = 4;
		String archivo = "Abe Shana - La última sirena.txt";
		
		Datos datos = new Datos(archivo, clave);
		Thread productor = new Thread(new HiloProductor(datos));
		productor.start();
		
		Thread[] consumidores = new Thread[nHilosConsumidores];
		for (int i = 0; i < consumidores.length; ++i) {
			consumidores[i] = new Thread(new HiloConsumidor(datos));
			consumidores[i].start();
		}
		for (int i = 0; i < consumidores.length; ++i) {
			try {
				consumidores[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		ArrayList<String> resultado = datos.getOcurrencias();
		if (resultado.size()>datos.CLAVE_FINAL.length()) {
			System.out.println("Palabras que contienen "+clave+":");
		}else {
			System.out.println("No se encontraron coincidencias.");
		}
		for (int i = 0; i < resultado.size(); ++i) {
			System.out.println("-> " + resultado.get(i));
		}
		if (resultado.size()>datos.CLAVE_FINAL.length()) {
			System.out.println("No hay más coincidencias.");
		}
	}// main()
	
}// Principal