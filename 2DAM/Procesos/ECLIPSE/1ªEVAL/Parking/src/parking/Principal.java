package parking;

public class Principal {
	
	public static void main (String[] args) {
		int nPlazas=6;
		int nCoches=8;
		Datos datos=new Datos(nPlazas);
		
		Thread[] coches = new Thread[nCoches];
		for (int i = 0; i < nCoches; ++i) {
			coches[i] = new Thread(new Coche(datos));
			coches[i].setName("C"+(i+1));
			coches[i].start();
		}
		for (int i = 0; i < coches.length; ++i) {
			try {
				coches[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// main()
	
}// Principal