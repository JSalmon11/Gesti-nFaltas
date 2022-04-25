package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class principal {
    public static void main(String[] args) {
        //EjerHilos1();
        EjerHilos2();
        //hiloCreaHilos();
    }// main()
    
    public static void EjerHilos1(){
        Hilo hilo=new Hilo();
        Thread t=new Thread(hilo);
        t.setName("hilo1");
        t.start();
        
        Hilo hilo2=new Hilo();
        Thread t2=new Thread(hilo2);
        t2.setName("hilo2");
        t2.start();
        
        for (int i = 0; i < 10; ++i) {
            System.out.println("Voy por "+i);
        }
    }
    
    public static void EjerHilos2(){
        Hilo2 hilo=new Hilo2(8820872678086888387L);
        Thread t=new Thread(hilo);
        t.setName("hilo1");
        t.start();
        
        Hilo2 hilo2=new Hilo2(3826257419752385183L);
        Thread t2=new Thread(hilo2);
        t2.setName("hilo1");
        t2.start();
    }
    
    public static void hiloCreaHilos() {
        HiloCreaHilos hilo=new HiloCreaHilos();
        Thread t=new Thread(hilo);
        t.start();
        try {
            t.join();
            System.out.println("FIN");
        } catch (InterruptedException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// hiloCreaHilos()
    
}// principal
