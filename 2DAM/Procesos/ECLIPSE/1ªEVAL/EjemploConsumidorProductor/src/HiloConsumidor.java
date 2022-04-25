
public class HiloConsumidor implements Runnable {

	private Datos datos;
	
	public HiloConsumidor(Datos datos) {
		this.datos=datos;
	}
	
	@Override
	public void run() {
		for (int i=0;i<10;++i) {
			//Nos traemos la información de datos
			int info=datos.consumir();
			//Simulamos tiempo de proceso
			try {
				Thread.sleep((long)(Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Consumidor. He consumido "+info);
		}
	}

}
