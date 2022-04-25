package asignaciondetareas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Datos {

    private boolean despertar = false;
    private Tarea task = null;
    private int numWorkers = 0;
    private boolean pedirTarea = false;
    private boolean todosAcaban = false;
    private ArrayList<String> informe = new ArrayList<>();
    private ArrayList<String> hilosRepetidos = new ArrayList<>();
    //private String[] hilosRepetidos;

    public synchronized void addInforme(HashMap tareas) {
        
    }// addInforme()

    public void GuardarInforme() {
        FileWriter fw = null;
        try {
            File f = new File("informe.txt");
            fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            Collections.sort(informe);
            for (int i = 0; i < informe.size(); ++i) {
                bw.write(informe.get(i));
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }// GuardarInforme()

    private int cont = 0;
    public synchronized void FIN(HashMap tareas, int lastTask) {
        String tarea = "Trabajador: "+Thread.currentThread().getName().substring(7)+"\n";
        for (int i = 0; i < lastTask; ++i) {
            if (tareas.get(i)!=null) {
                tarea += ("Tarea: "+i+".\tDuración: "+tareas.get(i).toString()+" horas.\n");
                //tarea += ("Tarea: "+tareas.get(i));                
            }
        }
        informe.add(tarea+"-----------------------------------\n");
        ++cont;
        if (cont == numWorkers) {
            todosAcaban = true;
        }
    }// FIN()

    public boolean getTodosAcaban() {
        return todosAcaban;
    }// getTodosAcaban()

    public synchronized void setPedirTarea(boolean pedirTarea) {
        this.pedirTarea = pedirTarea;
    }// setPedirTarea()

    public boolean getPedirTarea() {
        return pedirTarea;
    }// getPedirTarea()

    public int getNumWorkers() {
        return numWorkers;
    }// getNumWorkers()

    public synchronized void setNumWorkers(int num) {
        this.numWorkers=num;
        //hilosRepetidos = new String[numWorkers];
    }// setNumWorkers()

    public synchronized Tarea getTask() {
        if (pedirTarea) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else{
            pedirTarea=false;
        }
        return task;
    }// getTask()

    public synchronized void setTask(Tarea task) {
        boolean hiloRepetido = false;
        if (this.task == task) {
            for (int i = 0; i < hilosRepetidos.size(); ++i) {
                if (Thread.currentThread().getName().equals(hilosRepetidos.get(i))) {
                    hiloRepetido = true;
                }
            }
            if (!hiloRepetido) {
                hilosRepetidos.add(Thread.currentThread().getName());
                notify();
            }
            if (hilosRepetidos.size() == numWorkers) {
                pedirTarea=true;
                hilosRepetidos.clear();
            }
        }else{
            this.task=task;
            notify();
        }
    }// setTask()
    
    public boolean getDespertar() {
        return despertar;
    }// getDespertar()

    public void setDespertar(boolean despertar) {
        this.despertar = despertar;
    }// setDespertar()

}// Datos
