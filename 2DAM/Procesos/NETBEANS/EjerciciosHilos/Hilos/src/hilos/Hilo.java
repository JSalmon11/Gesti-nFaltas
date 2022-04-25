package hilos;
public class Hilo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Soy el "+Thread.currentThread().getName()+" y voy por "+i);
        }
    }// run()
}// Hilo
