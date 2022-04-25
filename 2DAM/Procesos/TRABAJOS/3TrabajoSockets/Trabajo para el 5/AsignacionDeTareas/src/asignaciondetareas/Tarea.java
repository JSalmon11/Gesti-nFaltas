package asignaciondetareas;

import java.io.Serializable;

public class Tarea implements Serializable {

    private int id;
    private int duracion;
    private boolean seguir;
    
    public Tarea(int id, int duracion, boolean seguir) {
        this.id = id;
        this.duracion = duracion;
        this.seguir = seguir;
    }// Tarea()

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean getSeguir() {
        return seguir;
    }

    public void setSeguir(boolean seguir) {
        this.seguir = seguir;
    }
    
}// Tarea
