package procesos.hilospi;

public class Hilo implements Runnable {

    private Datos datos;

    public Hilo(Datos datos) {
        this.datos = datos;
    }

    @Override
    public void run() {
        int totalDardos = datos.getDardosPorHilo();
        int aciertos = 0;
        for (int i = 0; i < totalDardos; ++i) {
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2)) <= 0.5) {
                //if (Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2) <= 0.25) {
                ++aciertos;
            }
        }
        datos.acumularAciertos(aciertos);
    }

}
