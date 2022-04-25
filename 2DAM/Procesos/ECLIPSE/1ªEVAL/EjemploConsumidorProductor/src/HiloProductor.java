
public class HiloProductor implements Runnable {

	private Datos datos;
	
	public HiloProductor(Datos datos) {
		this.datos=datos;
	}
	
	@Override
	public void run() {
		for (int i=0;i<10;++i) {
			//Producimos un número
			int numero=(int)(Math.random()*100);
			//Simulamos un tiempo de producción
			try {
				Thread.sleep((long)(Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Inserto en datos el número producido
			System.out.println("Productor: acabo de producir: "+numero);
			datos.producir(numero);
		}
	}

}
