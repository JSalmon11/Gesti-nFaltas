
package ejerciciosaccesodirecto;

import java.io.Serializable;

public class Alumno implements Serializable{
    private int nClase;
    private String nombre;
    private double nota;

    public Alumno(int nClase, String nombre, double nota) {
        this.nClase = nClase;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getNclase() {
        return nClase;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setnClase(int nClase) {
        this.nClase = nClase;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Alumno, nombre: " + nombre + ". Clase: " + nClase + ". Nota: " + nota;
    }   
}
