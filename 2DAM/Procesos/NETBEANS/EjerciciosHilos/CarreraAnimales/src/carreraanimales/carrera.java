package carreraanimales;

public class carrera {
    private int longitudCarrera=30;
    
    public static void main(String[] args) {
        Datos datos=new Datos();
        Thread[] hilos=new Thread[3];       
        for (int i = 0; i < hilos.length; ++i) {
            animal h = new animal(datos);
            hilos[i] = new Thread(h);
            hilos[i].setName("Animal"+i);
            hilos[i].start();
        }
    }// main()
}// carrera()
