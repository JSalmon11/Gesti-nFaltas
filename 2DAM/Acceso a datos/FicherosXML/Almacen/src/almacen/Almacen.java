package almacen;

public class Almacen {
    private String lote;
    private int numcajas;
    private Contenido contenido;
    private String peso;
    private String manipulacion;

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getNumcajas() {
        return numcajas;
    }

    public void setNumcajas(int numcajas) {
        this.numcajas = numcajas;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getManipulacion() {
        return manipulacion;
    }

    public void setManipulacion(String manipulacion) {
        this.manipulacion = manipulacion;
    }
    
    @Override
    public String toString() {
        return "Almacen: " + "lote: " + lote + ". Numcajas: " + numcajas + ". Contenido: "+contenido.toString() + ". Peso: " + peso + ". Manipulacion: " + manipulacion + '.';
    }
    
}// Almacen