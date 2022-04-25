package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class HiloComunicador implements Runnable {

    private Datos datos;
    private Socket s;

    public HiloComunicador(Datos datos, Socket s) {
        this.datos = datos;
        this.s = s;
    }// HiloComunicador()

    @Override
    public void run() {
        BufferedReader br = getBufferedReader(s);
        BufferedWriter bw = getBufferedWriter(s);

        String[] msjCliente = recibirMensaje(br).split("\\|");
        if (msjCliente[0].equals("1")) {
            datos.setUser(msjCliente[1], msjCliente[2]);
            enviarMensaje(bw, "3|OK|");
        } else if (msjCliente[0].equals("2")) {
            boolean userValid = datos.userValid(msjCliente[1], msjCliente[2]);
            if (userValid) {
                enviarMensaje(bw, "3|OK|");
            } else {
                enviarMensaje(bw, "4|NOK|");
            }
        }
        cerrarCanales(s, br, bw);
    }// run()

    private static BufferedReader getBufferedReader(Socket socket) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.out.println(e);
        }
        return br;
    }// getBufferedReader()

    private static BufferedWriter getBufferedWriter(Socket socket) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println(e);
        }
        return bw;
    }// getBufferedWriter()

    private static void enviarMensaje(BufferedWriter bw, String msg) {
        try {
            bw.write(msg + "\n");
            bw.flush();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }// enviarMensaje()

    private static String recibirMensaje(BufferedReader br) {
        String mensaje = null;
        try {
            mensaje = br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        return mensaje;
    }// recibirMensaje()

    private static void cerrarCanales(Socket s, BufferedReader br, BufferedWriter bw) {
        try {
            br.close();
            bw.close();
            s.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }// cerrarCanales()

}// HiloComunicador
