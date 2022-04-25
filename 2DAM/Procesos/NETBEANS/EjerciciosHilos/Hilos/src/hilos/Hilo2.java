package hilos;
public class Hilo2 implements Runnable{
    private long numero;
    
    public Hilo2(long numero){
        this.numero=numero;
    }
    
    @Override
    public void run() {
        double raiz=Math.sqrt(numero);
        boolean primo=true;
        for (int i = 2; i <= raiz && primo; ++i) {
            if (numero%i==0){
                primo=false;
            }
        }
        if (primo)
            System.out.println("El numero "+numero+" es primo");
        else
            System.out.println("El numero "+numero+" no es primo");
    }// run()
}// Hilo2