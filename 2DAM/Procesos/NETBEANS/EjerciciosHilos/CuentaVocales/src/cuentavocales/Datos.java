package cuentavocales;

public class Datos {

    private int vocales = 0;

    public synchronized void sumarVocal(int numVocal) {
        vocales += numVocal;
    }

    public int getVocales() {
        return vocales;
    }
}// Datos
