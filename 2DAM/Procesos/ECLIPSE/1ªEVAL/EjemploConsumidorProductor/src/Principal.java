
public class Principal {

	public static void main(String[] args) {

		Datos datos=new Datos();
		
		Thread productor=new Thread(new HiloProductor(datos));
		Thread consumidor=new Thread(new HiloConsumidor(datos));
		productor.start();
		consumidor.start();
		
		try {
			productor.join();
			consumidor.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("FIN");		
	}
}