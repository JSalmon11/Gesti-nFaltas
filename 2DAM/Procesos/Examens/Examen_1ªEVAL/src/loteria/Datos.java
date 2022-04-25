package loteria;

public class Datos {
	private int sorteos=0;
	private int apostantes=0;
	private int[] numGanador=new int[6];
	
	public Datos(int sorteos, int apostantes) {
		this.sorteos=sorteos;
		this.apostantes=apostantes;
	}// Datos()	
	
	boolean seguirSorteos=true;
	public synchronized boolean seguirSorteos()	{
		if (numSorteos==sorteos) {
			seguirSorteos=false;
		}
		return seguirSorteos;
	}// seguirSorteo()
	
	int numApostantes=0;
	int numSorteos=0;
	public synchronized void apostar () {
		if (numApostantes==apostantes-1) {
			++numSorteos;
			notifyAll();
		}else {
			try {
				++numApostantes;
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		numApostantes=0;
	}// apostar()
	
	public synchronized int resultado (int[] apuesta) {
		int numAciertos = 0;
		if (numApostantes==0) {
			for (int j=0; j<6; ++j) {
				boolean repetido=true;
				int random=0;
				while(repetido) {
					repetido=false;
					random = (int) (Math.random() * 48);
					for (int i=0; i<j; ++i) {
						if (numGanador[i]==random) {
							repetido=true;
						}
					}
				}
				numGanador[j]=random;
			}
			for (int j=0; j<6; ++j) {
				boolean repetido=true;
				while(repetido) {
					repetido=false;
					for (int i=0; i<j; ++i) {
						if (numGanador[i]==apuesta[j]) {
							repetido=true;
							++numAciertos;
						}
					}
				}
			}
		}else {
			for (int j=0; j<6; ++j) {
				boolean repetido=true;
				while(repetido) {
					repetido=false;
					for (int i=0; i<j; ++i) {
						if (numGanador[i]==apuesta[j]) {
							repetido=true;
							++numAciertos;
						}
					}
				}
			}
		}
		++numApostantes;
		return numAciertos;
	}// resultado()
	
	private float mediaAcertados0=0;
	private float mediaAcertados1=0;
	private float mediaAcertados2=0;
	private float mediaAcertados3=0;
	private float mediaAcertados4=0;
	private float mediaAcertados5=0;
	private float mediaAcertados6=0;
	public synchronized void mediaAciertos (int acertados0, int acertados1, int acertados2, int acertados3, int acertados4, int acertados5, int acertados6) {
		mediaAcertados0+=acertados0/sorteos;
		mediaAcertados1+=acertados1/sorteos;
		mediaAcertados2+=acertados2/sorteos;
		mediaAcertados3+=acertados3/sorteos;
		mediaAcertados4+=acertados4/sorteos;
		mediaAcertados5+=acertados5/sorteos;
		mediaAcertados6+=acertados6/sorteos;
	}// mediaAciertos()
	
	public void end() {
		System.out.println("Se han realizado "+sorteos+" sorteos.\nCon las siguientes medias de acierto:\n"
				+ "0 numeros: "+mediaAcertados0+".\n"
				+ "1 numeros: "+mediaAcertados1+".\n"
				+ "2 numeros: "+mediaAcertados2+".\n"
				+ "3 numeros: "+mediaAcertados3+".\n"
				+ "4 numeros: "+mediaAcertados4+".\n"
				+ "5 numeros: "+mediaAcertados5+".\n"
				+ "6 numeros: "+mediaAcertados6+".\n");
	}// end()
	
}// Datos