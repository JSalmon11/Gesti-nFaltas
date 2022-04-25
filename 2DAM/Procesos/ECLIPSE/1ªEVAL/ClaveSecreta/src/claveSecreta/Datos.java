package claveSecreta;

public class Datos {
	private String clave="";
	private char[] caracteresClave=new char[64];
	int reparto=0;
	int numHilos;
	
	public Datos(int numHilos) {
		this.numHilos=numHilos-1;
		for(int j=0; j<26; ++j) {
			caracteresClave[j]=(char) ('a'+j);
		}
		int sum=25;
		for(int k=0; k<26; ++k) {
			caracteresClave[++sum]=(char) ('A'+k);
		}
		
		int summ=51;
		for(int w=0; w<10; ++w) {
			caracteresClave[++summ]=(char) ('0'+w);
		}
		caracteresClave[62]='ñ';
		caracteresClave[63]='Ñ';
		reparto=caracteresClave.length/numHilos;
		crearClave();
	}// Datos()

	private int repartido=0;
	private int contHilos=0;
	public synchronized String pedirL() {
		String caracteresHilo="";
		if (contHilos==numHilos) {
			for (int i=(caracteresClave.length-reparto); i<caracteresClave.length; ++i) {
				caracteresHilo+=caracteresClave[i]+" ";
			}
			caracteresHilo=caracteresHilo.substring(0, caracteresHilo.length()-1);
		}else {
			for (int i=repartido; i<(repartido+reparto); ++i) {
				caracteresHilo+=caracteresClave[i]+" ";
			}
			repartido+=reparto;
		}
		++contHilos;
		return caracteresHilo;
	}// pedirL()
	
	public void crearClave() {
		for (int i=0; i<4; ++i) {
			int randomPos=(int) (Math.random()*64);
			clave+=caracteresClave[randomPos];
		}
		prueba();
	}// crearClave()
	
	public synchronized String productorClaves(String letra1) {
		String claveProducida="";
		claveProducida=letra1;
		for (int i=0; i<3; ++i) {
			int randomPos=(int) (Math.random()*64);
			claveProducida+=caracteresClave[randomPos];
		}
		return claveProducida;
	}// productorClaves()
	
	private boolean claveEncontrada=false;
	public synchronized void consumidorClaves(String clave, String hilo) {
		if (clave==this.clave) {
			System.out.println("Hilo: "+hilo+", encontré la clave: "+clave);
			claveEncontrada=true;
		}
	}// consumidorClaves()
	
	public synchronized boolean finalizado() {
		return claveEncontrada;
	}// finalizado()
	
	public void prueba() {
		System.out.println(clave);
	}// prueba()
	
}// datos