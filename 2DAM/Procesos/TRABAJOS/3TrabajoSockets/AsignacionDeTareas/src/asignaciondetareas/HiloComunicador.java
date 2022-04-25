package asignaciondetareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class HiloComunicador implements Runnable {

    private Socket socket;
    private Datos datos;
    private ArrayList<String> tareas = new ArrayList<>();
    private HashMap<Integer, Integer> informe = new HashMap<>();

    public HiloComunicador(Socket socket, Datos datos) {
        this.socket = socket;
        this.datos = datos;
    }

    @Override
    public void run() {
        BufferedReader br = getBufferedReader(socket);
        ObjectOutputStream out = getObjectOutputStream(socket);
        //CONTROLAR LA ID DE LA TAREA PARA NO MANDAR LA MISMA TAREA VARIAS VECES AL MISMO TRABAJADOR
        Tarea task;
        boolean acabado = false;
        int idTarea = 1;
        int cont = 0;
        String mensaje;
        while (!acabado) {
            //El servidor manda una tarea
            task = datos.getTask();
            if (!tareaRepetida(task)) {
                enviarTarea(out, task);
                ++idTarea;
                mensaje = recibirMensaje(br);
                if (mensaje.equals("rechazar")) {
                    //La tarea ha sido rechazada
                    System.out.println("Tarea " + task.getId() + " rechazada (" + task.getDuracion() + " horas) por " + Thread.currentThread().getName());
                    tareas.add(task.getId()+"");
                    datos.setTask(task);
                    if (task.getDuracion() == 1) {
                        //Si la tarea rechazada es de menos de 1 hora, el servidor envia
                        //una tarea con la informacion para que el cliente pare de pedir
                        int lastTask = task.getId();
                        task = new Tarea(0, 0, false);
                        //false un boolean de seguir o no
                        enviarTarea(out, task);
                        datos.FIN(informe, lastTask);
                        System.out.println(cont + " horas");
                        acabado = true;
                    }
                } else {
                    cont += task.getDuracion();
                    //Se añade la tarea aceptada al informe
                    informe.put(task.getId(), task.getDuracion());
                    //add("Trabajador " + Thread.currentThread().getName() + ": Tarea: " + task.getId() + ".\tDuración: " + task.getDuracion() + " horas.\n");
                    datos.setPedirTarea(true);
                }                
            }else{
                datos.setTask(task);
            }
        }
        
        cerrarCanales(br, socket);
    }// run()

    private boolean tareaRepetida(Tarea task) {
        boolean repetido = false;
        for (int i = 0; i < tareas.size() && !repetido; ++i) {
            if ((task.getId()+"").equals(tareas.get(i))) {
                repetido = true;
            }else{
                repetido = false;
            }
        }
        return repetido;
    }// tareaRepetida()
    
    private static BufferedReader getBufferedReader(Socket socket) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.out.println(e);
        }
        return br;
    }// getBufferedReader()

    private static ObjectOutputStream getObjectOutputStream(Socket socket) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return out;
    }// getObjetInputStream()

    private static String recibirMensaje(BufferedReader br) {
        String mensaje = null;
        try {
            mensaje = br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        return mensaje;
    }// recibirMensaje()

    private static void enviarTarea(ObjectOutputStream out, Tarea task) {
        try {
            out.writeObject(task);
            out.flush();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }// enviarTarea()

    private static void cerrarCanales(BufferedReader br, Socket socket) {
        try {
            br.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }// cerrarCanales()

}// HiloComunicador
