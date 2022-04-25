package hilosvariablecomun;
public class Hilo implements Runnable {

	private Datos datos;
	
	public Hilo(Datos datos) {
		this.datos=datos;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i=0;i<10;++i) {
			datos.aumentarVariable();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
