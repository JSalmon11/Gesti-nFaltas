package loteria;

public class Hilo implements Runnable {
	private Datos datos;
	private int Acertados0=0;
	private int Acertados1=0;
	private int Acertados2=0;
	private int Acertados3=0;
	private int Acertados4=0;
	private int Acertados5=0;
	private int Acertados6=0;
	
	public Hilo (int sorteos, Datos datos) {
		this.datos=datos;
	}// Hilo()

	@Override
	public void run () {
		while (datos.seguirSorteos()) {
			int[] apuesta=new int[6];
			for (int j=0; j<6; ++j) {
				boolean repetido=true;
				int random=0;
				while(repetido) {
					repetido=false;
					random = (int) (Math.random() * 48);
					for (int i=0; i<j; ++i) {
						if (apuesta[i]==random) {
							repetido=true;
						}
					}
				}
				apuesta[j]=random;
			}
			datos.apostar();
			int numAciertos=datos.resultado(apuesta);
			switch (numAciertos) {
				case 0:++Acertados0; break;
				case 1:++Acertados1; break;
				case 2:++Acertados2; break;
				case 3:++Acertados3; break;
				case 4:++Acertados4; break;
				case 5:++Acertados5; break;
				case 6:++Acertados6; break;
			}
		}
		datos.mediaAciertos(Acertados0, Acertados1, Acertados2, Acertados3, Acertados4, Acertados5, Acertados6);
	}// run()
	
}// Hilo