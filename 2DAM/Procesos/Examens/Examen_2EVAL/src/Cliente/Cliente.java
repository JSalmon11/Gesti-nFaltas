package Cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Socket s = getSocket();
        BufferedWriter bw = getBufferedWriter(s);
        BufferedReader br = getBufferedReader(s);

        System.out.println("1: Registrar\n2: Login");
        int elige = teclado.nextInt();

        System.out.println("Usuario");
        teclado.nextLine();
        String user = teclado.nextLine();

        System.out.println("Password");
        String pass = teclado.nextLine();

        String msjServer = elige + "|" + user + "|" + pass;

        enviarMensaje(bw, msjServer);

        System.out.println(recibirMensaje(br));
        
        cerrarCanales(s, br, bw);
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
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }// cerrarCanales()
    
}// Cliente
