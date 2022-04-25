package asignaciondetareas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Jefe {

    public static void main(String[] args) {
        ServerSocket ssocket = getServerSocket();
        ArrayList<String> informe = new ArrayList<>();
        Tarea task;
        if (ssocket != null) {
            Socket socket = aceptarComs(ssocket);
            BufferedReader br = getBufferedReader(socket);
            ObjectOutputStream out = getObjectOutputStream(socket);

            boolean acabado = false;
            int idTarea = 1;
            String mensaje;
            while (!acabado) {
                //El servidor manda una tarea
                task = new Tarea(idTarea, (int) Math.round((Math.random() * 2 + 1)), true);
                enviarTarea(out, task);
                ++idTarea;
                //El servidor espera el mensaje de aceptacion o rechazo
                mensaje = recibirMensaje(br);
                if (mensaje.equals("rechazar")) {
                    //La tarea ha sido rechazada
                    System.out.println("Tarea " + task.getId() + " rechazada (" + task.getDuracion() + " horas)");
                    if (task.getDuracion() == 1) {
                        //Si la tarea rechazada es de menos de 1 hora, el servidor envia
                        //una tarea con la informacion para que el cliente pare de pedir
                        task = new Tarea(0, 0, false);
                        //false un boolean de seguir o no
                        enviarTarea(out, task);
                        //Se escribe un informe de las tareas
                        SacarInforme(informe);
                        acabado = true;
                    }
                } else {
                    //La tarea ha sido aceptada
                    //Se aniade la tarea aceptada al informe
                    informe.add("Tarea " + task.getId() + " asignada.\tDuración: " + task.getDuracion() + " horas.");
                }
            }
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

    private static void enviarTarea(ObjectOutputStream out, Tarea task) {
        try {
            out.writeObject(task);
            out.flush();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }// enviarTarea()

    private static void SacarInforme(ArrayList<String> informe) {
        FileWriter fw = null;
        try {
            File f = new File("informe.txt");
            fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < informe.size(); ++i) {
                bw.write(informe.get(i) + "\n");
            }
            bw.close();
            fw.close();
        } // SacarInforme()
        catch (IOException ex) {
            System.out.println(ex);;
        }
    }

    private static String recibirMensaje(BufferedReader br) {
        String mensaje = null;
        try {
            mensaje = br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        return mensaje;
    }// recibirMensaje()

}// Jefe
