package procesos.hilospi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SuperPrincipal {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("java", "-cp", "G:\\Mi unidad\\Mis cosa de clase\\2DAM\\Procesos\\Profe correciones\\Procesos+HilosPI\\build\\classes\\procesos\\hilospi",
                "Principal");
        int nProcesos = 8;
        int nHilos = 4;
        int dardosPorHilo = 5000000;
        BufferedReader[] buffers = new BufferedReader[nProcesos];

        for (int i = 0; i < nProcesos; ++i) {
            try {
                Process p = pb.start();
                BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(p.getOutputStream()));
                buffers[i] = new BufferedReader(
                        new InputStreamReader(p.getInputStream()));
                bw.write(nHilos + "\n");
                bw.flush();
                bw.write(dardosPorHilo + "\n");
                bw.flush();
                System.out.println(buffers[i].readLine());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        double aproxPI = 0;

        for (int i = 0; i < nProcesos; ++i) {
            try {
                aproxPI += Double.parseDouble(buffers[i].readLine());
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        aproxPI /= nProcesos; // aproxPI = aproxPI / nProcesos;

        System.out.println("La aproximación es " + aproxPI);
    }

}
