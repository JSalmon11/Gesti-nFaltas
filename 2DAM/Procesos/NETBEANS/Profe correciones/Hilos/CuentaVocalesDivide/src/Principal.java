
public class Principal {

    public static void main(String[] args) {

        System.out.println("Cada hilo cuenta un trozo:");
        ContarVocalesPorTrozos();

        /*System.out.println("Cada hilo cuenta una vocal:");
        contarVocalesCadaHiloUnaVocal();*/
    }// main()

    private static void ContarVocalesPorTrozos() {
        String vocales = "aeiou";
        int nHilos = 4;
        DatosAlt datos = new DatosAlt(nHilos, vocales, "texto largo.txt");

        long antes = System.currentTimeMillis();
        Thread[] hilos = new Thread[nHilos];
        for (int i = 0; i < nHilos; ++i) {
            HiloContadorAlt h = new HiloContadorAlt(datos);
            hilos[i] = new Thread(h);
            hilos[i].start();
        }

        for (int i = 0; i < hilos.length; ++i) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        long despues = System.currentTimeMillis();
        long tiempoTranscurrido = despues - antes;

        System.out.println("En total hay " + datos.getVocales() + " vocales");
        int[] desglose = datos.getDesgloseVocales();
        for (int i = 0; i < desglose.length; ++i) {
            System.out.println("Cantidad de " + vocales.charAt(i) + ": " + desglose[i]);
        }
        System.out.println("He tardado " + tiempoTranscurrido + " milisegundos");

    }// ContarVocalesPorTrozos()

    /*private static void contarVocalesCadaHiloUnaVocal() {
        String vocales = "aeiou";
        Datos datos = new Datos(vocales.length(), "texto largo.txt");

        long antes = System.currentTimeMillis();
        Thread[] hilos = new Thread[vocales.length()];
        for (int i = 0; i < vocales.length(); ++i) {
            HiloContador h = new HiloContador(vocales.charAt(i), datos, i);
            hilos[i] = new Thread(h);
            hilos[i].start();
        }

        for (int i = 0; i < hilos.length; ++i) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        long despues = System.currentTimeMillis();
        long tiempoTranscurrido = despues - antes;

        System.out.println("En total hay " + datos.getVocales() + " vocales");
        int[] desglose = datos.getDesgloseVocales();
        for (int i = 0; i < desglose.length; ++i) {
            System.out.println("Cantidad de " + vocales.charAt(i) + ": " + desglose[i]);
        }
        System.out.println("He tardado " + tiempoTranscurrido + " milisegundos");
    }// contarVocalesCadaHiloUnaVocal()*/
}// Principal
