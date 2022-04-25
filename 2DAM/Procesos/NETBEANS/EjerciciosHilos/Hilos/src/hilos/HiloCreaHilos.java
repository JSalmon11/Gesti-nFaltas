package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloCreaHilos implements Runnable{

    @Override
    public void run() {
        hiloMensajes hilo=new hiloMensajes();
        Thread[] hilos=new Thread[5];
        for (int i = 0; i < 5; ++i) {
            hilos[i]=new Thread(hilo);
            hilos[i].start();
        }
        for (int i = 0; i < 5; ++i) {
            try {
                hilos[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCreaHilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// run()
}// HiloCreaHilos
