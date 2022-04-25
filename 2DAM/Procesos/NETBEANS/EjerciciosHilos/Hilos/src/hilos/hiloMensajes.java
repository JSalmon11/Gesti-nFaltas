package hilos;

public class hiloMensajes implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {           
            System.out.println("Soy el "+Thread.currentThread().getName());
        }
    }// run()
}// hiloMensajes
