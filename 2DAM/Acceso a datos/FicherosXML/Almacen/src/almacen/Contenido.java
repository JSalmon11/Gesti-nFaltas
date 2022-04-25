package almacen;

public class Contenido {
    private String componente;
    private String numserie;
    private int unidades;

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "-Componente: " + componente + ". -Numserie: " + numserie + ". -Unidades: " + unidades;
    }
    
}// Contenido