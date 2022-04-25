package cuentavocales;

public class Principal {
    public static void main(String[] args) {
        Datos datos=new Datos();
        String vocal="aeiou";
        Thread[] hilos=new Thread[vocal.length()];
        
        for (int i = 0; i < vocal.length(); ++i) {
            Hilo h = new Hilo(datos, vocal.charAt(i));
            hilos[i] = new Thread(h);
            hilos[i].start();
        }
        for (int i = 0; i < vocal.length(); ++i) {
            try {
		hilos[i].join();
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
	}
        System.out.println("Numero de vocales del fichero: "+datos.getVocales());
    }// main()
}// Principal