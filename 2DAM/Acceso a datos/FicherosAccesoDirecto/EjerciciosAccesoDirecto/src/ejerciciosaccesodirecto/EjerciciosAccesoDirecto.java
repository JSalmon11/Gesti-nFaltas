package ejerciciosaccesodirecto;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class EjerciciosAccesoDirecto {

    public static void main(String[] args) {
        //intDoubles(); leerRegistros();
        //numerosHasta0();
        //alumnos();
        actualizarAlumnos();
    }// main()

    private static void intDoubles() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de registros:");
        int nDoubles = teclado.nextInt();

        File f = new File("registros.dat");
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for (int i = 0; i < nDoubles; ++i) {
                System.out.println("Double:");
                double num = teclado.nextDouble();
                raf.writeInt(i + 1);
                raf.writeDouble(num);
            }
            raf.close();
        } catch (Exception e) {
        }
    }// intDoubles()

    private static void leerRegistros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Registro a leer:");
        int registro = teclado.nextInt();

        File f = new File("registros.dat");
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            if (registro == 1) {
                raf.seek(0);
                System.out.print(raf.readInt() + "  ");
                System.out.println(raf.readDouble());
            } else {
                raf.seek((registro - 1) * 12);
                System.out.print(raf.readInt() + "  ");
                System.out.println(raf.readDouble());
            }
            raf.close();
        } catch (Exception e) {
        }
    }// leerRegistros()

    private static void numerosHasta0() {
        Scanner teclado = new Scanner(System.in);

        File f = new File("enteros.dat");
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");

            System.out.println("Numero:");
            int nEnteros = teclado.nextInt();
            while (nEnteros != 0) {
                System.out.println("Numero:");
                nEnteros = teclado.nextInt();
                raf.writeInt(nEnteros);
            }
            raf.close();
        } catch (Exception e) {
        }
    }// numerosHasta0()

    private static void alumnos() {
        Scanner teclado = new Scanner(System.in);

        File f = new File("alumnos.obj");
        try {
            if (!f.exists()) {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.close();
                fos.close();
            }

            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < 10; ++i) {
                int nClase = i;
                System.out.println("Alumno:");
                String nombre = teclado.nextLine();
                System.out.println("Nota:");
                double nota = teclado.nextDouble();
                teclado.nextLine();

                Alumno al;
                al = new Alumno(nClase, nombre, nota);
                oos.writeObject(al);
            }
            oos.close();
            fos.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }// alumnos()

    private static void actualizarAlumnos() {
        Scanner teclado = new Scanner(System.in);

        File f = new File("alumnos.obj");
        File fraf = new File("alumnos1.obj");
        try {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                RandomAccessFile raf = new RandomAccessFile(fraf, "rw");
                Alumno[] Alumnos = new Alumno[10];
                try {
                    Alumno al = (Alumno) ois.readObject();
                    int i = 0;
                    while (true) {
                        int nClase = al.getNclase();
                        String nombre = al.getNombre();
                        double nota = al.getNota();
                        raf.writeInt(nClase);
                        while (nombre.length() < 10) {
                            nombre += " ";
                        }
                        raf.writeUTF(nombre);
                        raf.writeDouble(nota);
                        Alumnos[i] = al;
                        ++i;
                        al = (Alumno) ois.readObject();
                    }
                } catch (EOFException e) {
                }
                ois.close();
                fis.close();

                try {
                    f.delete();
                    f = new File("alumnos.obj");
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    System.out.println("Numero de clase para actualizar");
                    int numClase = teclado.nextInt();
                    raf.seek((numClase - 1) * 24);
                    int clase = raf.readInt();
                    ++clase;
                    System.out.println("Numero clase: " + clase + ". Nombre: "
                            + raf.readUTF() + ". Nota" + raf.readDouble());
                    teclado.nextLine();
                    System.out.println("");
                    System.out.println("¿Quieres cambiar el nombre o la nota?");
                    String cambio = teclado.nextLine();
                    String newNombre = "11";
                    double newNota = 0;
                    if ("nombre".equals(cambio) || "Nombre".equals(cambio)) {
                        raf.seek(4);
                        System.out.println("Nuevo nombre:");
                        newNombre = teclado.nextLine();
                        while (newNombre.length() < 10) {
                            newNombre += " ";
                        }
                        raf.writeUTF(newNombre);
                        Alumnos[numClase - 1].setNombre(newNombre);
                    } else if ("nota".equals(cambio) || "Nota".equals(cambio)) {
                        raf.seek(16);
                        System.out.println("Nueva nota:");
                        newNota = teclado.nextDouble();
                        raf.writeDouble(newNota);
                        Alumnos[numClase - 1].setNota(newNota);
                    }
                    for (int i = 0; i < 10; ++i) {
                        oos.writeObject(Alumnos[i]);
                    }
                    oos.close();
                    fos.close();

                } catch (EOFException e) {
                }
                raf.close();
            } catch (ClassNotFoundException ex) {
            }
        } catch (IOException e) {
        }
    }// actualizarAlumnos()

}// EjerciciosAccesoDirecto()
