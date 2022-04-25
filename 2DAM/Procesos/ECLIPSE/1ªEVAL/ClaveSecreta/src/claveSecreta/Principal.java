package claveSecreta;

public class Principal {
	
	public static void main(String[] args) {
		int nHilos=1;
		Datos datos = new Datos(nHilos);

		Thread[] hilo = new Thread[nHilos];
		for (int i = 0; i < hilo.length; ++i) {
			hilo[i] = new Thread(new Hilo(datos));
			hilo[i].setName(i+"");
			hilo[i].start();
		}
	}// main()
	
}// Principal