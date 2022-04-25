package asignaciondetareas;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Trabajador {
    
    public static void main(String[] args) {
        Socket socket = getSocket();
        ObjectInputStream in = getObjectInputStream(socket);
        BufferedWriter bw = getBufferedWriter(socket);
        int horas = 40;
        Tarea task = null;
        
        //Espera a recibir la primera tarea del servidor
        task = getTarea(task, in);
        //Mientras el boolean segui del objeto tarea sea true, no sale del bucle
        while (task.getSeguir()) {
            if (horas<task.getDuracion()) {
                //Rechaza la tarea si dura mas de las horas que le quedan
                comunicarServer(bw, "rechazar");
            }else{
                //Acepta la tarea y resta su duracion a las horas
                comunicarServer(bw, "aceptar");
                horas -= task.getDuracion();
            }
            //Espera a recibir la siguiente tarea
            task = getTarea(task, in);
        }
        cerrarCanales(in, bw, socket);
    }// main()

    private static Socket getSocket() {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 20000);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return socket;
    }// getSocket()

    private static ObjectInputStream getObjectInputStream(Socket socket) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return in;
    }// getObjectInputStream()

    private static BufferedWriter getBufferedWriter(Socket socket) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println(e);
        }
        return bw;
    }// getBufferedWriter()

    private static void comunicarServer(BufferedWriter bw, String msg) {
        try {
            bw.write(msg + "\n");
            bw.flush();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }// comunicarServer()

    private static void cerrarCanales(ObjectInputStream in, BufferedWriter bw, Socket socket) {
        try {
            in.close();
            bw.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }// cerrarCanales()

    private static Tarea getTarea(Tarea task, ObjectInputStream in) {
        try {
            task = (Tarea) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return task;
    }// getTarea()
    
}// Trabajador()
