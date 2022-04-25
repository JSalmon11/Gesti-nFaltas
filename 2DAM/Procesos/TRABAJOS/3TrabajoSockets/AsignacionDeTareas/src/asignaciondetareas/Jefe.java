package asignaciondetareas;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Jefe {

    public static void main(String[] args) {
        Datos datos = new Datos();
        ServerSocket ssocket = getServerSocket();
        Thread contador = new Thread(new Contador(datos, ssocket));
        if (ssocket != null) {
            //Comienza el contador de 10 segundos
            contador.start();
            int workerID = 1;
            ArrayList <Thread> hilos = new ArrayList <>();
            Socket socket = aceptarComs(ssocket);
            //Bucle que acepta peticiones de clientes durante 10 segundos
            while (!datos.getDespertar()) {
                Thread hilo = new Thread(new HiloComunicador(socket, datos));
                hilo.setName("Worker " + workerID);
                //Da nombre y guarda en un array los hilos,
                //para que despues empiecen todos a la vez
                hilos.add(hilo);
                ++workerID;
                socket = aceptarComs(ssocket);
            }
            //Pasa a datos el numero de trabajadores
            datos.setNumWorkers(hilos.size());
            for (int i = 0; i < hilos.size(); ++i) {
                hilos.get(i).start();
            }
            int idTarea = 1;
            //Bucle de creación de tareas
            datos.setPedirTarea(true);
            while (!datos.getTodosAcaban()) {
                if (datos.getPedirTarea()) {
                    datos.setTask(new Tarea(idTarea, (int) Math.round((Math.random() * 2 + 1)), true));
                    //datos.setPedirTarea(false);
                    ++idTarea;
                }
            }
            datos.GuardarInforme();
        }
    }// main()

    private static ServerSocket getServerSocket() {
        ServerSocket ssocket = null;
        try {
            ssocket = new ServerSocket(20000);
        } catch (IOException e) {
            System.out.println(e);
        }
        return ssocket;
    }// getServerSocket()

    private static Socket aceptarComs(ServerSocket serverSocket) {
        Socket socket = null;
        try {
            socket = serverSocket.accept();
        } catch (IOException e) {
            System.out.println(e);
        }
        return socket;
    }// aceptarComs()
    
}// Jefe
