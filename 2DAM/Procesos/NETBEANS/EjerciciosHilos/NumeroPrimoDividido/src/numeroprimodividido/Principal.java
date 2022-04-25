package numeroprimodividido;

public class Principal {
    public static void main(String[] args) {
        Hilo hilo=new Hilo(8820872678086888387L);
        Thread t=new Thread(hilo);
        t.setName("hilo1");
        t.start();
    }// main()
}// Principal()
