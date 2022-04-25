package hilosvariablecomun;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datos datos=new Datos();
		Hilo h = new Hilo(datos);
		Thread[] hilos = new Thread[10];
		for (int i = 0; i < 10; ++i) {
			hilos[i] = new Thread(h);
			hilos[i].start();
		}
		for (int i = 0; i < 10; ++i) {
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Al final, variable = " + datos.getVariable());

	}

}
