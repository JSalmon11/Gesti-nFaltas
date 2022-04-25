package parking;

public class Coche implements Runnable {
	private Datos datos;
	private int posicion;
	public Coche (Datos datos) {
		this.datos=datos;
	}

	@Override
	public void run () {
		for (int i=0; i<2; ++i) {
			posicion=datos.aparcar(Thread.currentThread().getName()+"");
			esperar();
			datos.irse(posicion);
			esperar();
		}
	}// run()
	
	private static void esperar() {
		try {
			Thread.sleep((long)(Math.random()*10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// esperar()
	
}// Coche