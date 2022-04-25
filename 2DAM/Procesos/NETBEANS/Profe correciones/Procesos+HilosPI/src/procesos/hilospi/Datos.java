package procesos.hilospi;

public class Datos {

    private int nHilos;
    private int dardosPorHilo;
    private int dardosTotales;
    private int aciertos;

    public Datos(int nHilos, int dardosPorHilo) {
        this.nHilos = nHilos;
        this.dardosPorHilo = dardosPorHilo;
        this.dardosTotales = nHilos * dardosPorHilo;
        aciertos = 0;
    }

    public int getDardosPorHilo() {
        return dardosPorHilo;
    }

    public synchronized void acumularAciertos(int aciertosParcial) {
        aciertos += aciertosParcial;
    }

    public double getAproximacionPI() {
        return (double) (4 * aciertos) / dardosTotales;
    }

}
