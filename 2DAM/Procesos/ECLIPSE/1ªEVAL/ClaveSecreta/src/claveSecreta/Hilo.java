package claveSecreta;

import java.util.ArrayList;

public class Hilo implements Runnable {
	private Datos datos;
	public Hilo(Datos datos) {
		this.datos=datos;
	}
	
	@Override
	public void run() {
		String primeraLetra=datos.pedirL();
		String[] letra1=primeraLetra.split(" ");
		ArrayList <String> probados=new ArrayList<String>();
		String clave="";
		
		for (int i=0; i<letra1.length; ++i) {
			int cont=0;
			clave=datos.productorClaves(letra1[i]);
			while(!probados.contains(clave) && cont<262144) {
				probados.add(clave);
				clave=datos.productorClaves(letra1[i]);
				datos.consumidorClaves(clave, Thread.currentThread().getName());
				++cont;
			}
			if (datos.finalizado()) {
				break;
			}
		}
		System.out.println("Hilo: "+Thread.currentThread().getName()+", acabé porque otro hilo encontró la clave");
	}// run()
	
}// Hilo