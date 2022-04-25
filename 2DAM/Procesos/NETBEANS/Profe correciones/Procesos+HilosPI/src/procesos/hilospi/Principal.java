package procesos.hilospi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nHilos = Integer.parseInt(sc.nextLine());
        int dardosPorHilo = Integer.parseInt(sc.nextLine());
        System.out.println("OK");
        Datos datos = new Datos(nHilos, dardosPorHilo);
        Thread[] hilos = new Thread[nHilos];
        Hilo h = new Hilo(datos);
        for (int i = 0; i < nHilos; ++i) {
            hilos[i] = new Thread(h);
            hilos[i].start();
        }

        for (int i = 0; i < nHilos; ++i) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println(datos.getAproximacionPI());

    }

    //Esta funci�n es �til para hacer debugging
    private static void guardarTraza(String mensaje) {
        try {
            File archivo = new File("kk.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(mensaje + "\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
