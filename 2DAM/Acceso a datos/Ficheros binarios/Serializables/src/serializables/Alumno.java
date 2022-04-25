
package serializables;

import java.io.Serializable;

public class Alumno implements Serializable{
    private String nombre;
    private int matricula;
    private double nota;

    public Alumno(String nombre, int matricula, double nota) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno nombre: " + nombre + ", matricula=" + matricula + ", nota=" + nota;
    }
    
 }
