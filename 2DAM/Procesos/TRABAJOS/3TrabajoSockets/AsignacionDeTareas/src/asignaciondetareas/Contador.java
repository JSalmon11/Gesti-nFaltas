package asignaciondetareas;

import java.io.IOException;
import java.net.ServerSocket;

public class Contador implements Runnable {

    private Datos datos;
    private ServerSocket ssocket;

    public Contador(Datos datos, ServerSocket ssocket) {
        this.datos = datos;
        this.ssocket = ssocket;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            datos.setDespertar(true);
            ssocket.close();
        }
        catch (InterruptedException | IOException ex) {
            System.out.println(ex);
        }
    }// run()

}// Contador
