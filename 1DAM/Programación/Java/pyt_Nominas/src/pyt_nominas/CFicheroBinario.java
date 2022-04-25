/*
En una empresa se tiene un fichero binario “nominas.dat” que almacena en cada registro 
el nombre de cada empleado (String) con el número de días de baja (int) y su nómina (double). 
Hacer un programa que actualice las nóminas de forma que:
- a los que tengan 0 días de baja se le hace un aumento del 5%, 
- a los que tengan entre 1 y 3 días de baja se quedan con la misma nómina, 
- a los que tengan entre 4 y 10 se les baja un 10% y 
- a los que tengan más de 10 días de baja se les se elimina del fichero.
Finalmente, se escribirá en pantalla el fichero “nominas.dat” ya actualizado, indicando
a cuantos empleados se ha dado de baja.
*/
package pyt_nominas;
import java.io.*;
import java.util.Scanner;

public class CFicheroBinario {
    private static int piContBajas;
    public static void main(String[] args) {
        mvCrearFichDeNominas();
        mvMostrarFichDeNominas();
        mvActualizarFichDeNominas();
        System.out.println("Se han dado de baja a " + piContBajas + " empleados\n");
        mvMostrarFichDeNominas();
    }//main()

    static void mvCrearFichDeNominas() {
        // Este método crea el fichero de nóminas
        try {
            File fVj = new File("nominas.dat");
            FileOutputStream fos = new FileOutputStream(fVj, true);
            DataOutputStream dos = new DataOutputStream(fos);

            String wsEmpleado;
            int wiDiasDeBaja;
            double wuNomina;
            Scanner woTeclado = new Scanner(System.in);

            try {
                System.out.println("Para acabar, pulse solo intro al pedir el Nombre.");
                while (true) {
                    System.out.println("Nombre:  ");
                    wsEmpleado = woTeclado.nextLine();
                    wsEmpleado = wsEmpleado.trim();
                    if (wsEmpleado.length() == 0) {
                        break;
                    }
                    System.out.println("Días de Baja: ");
                    wiDiasDeBaja = woTeclado.nextInt();
                    System.out.println("Importe de la Nómina: ");
                    wuNomina = woTeclado.nextDouble();
                    woTeclado.nextLine();

                    dos.writeUTF(wsEmpleado);
                    dos.writeInt(wiDiasDeBaja);
                    dos.writeDouble(wuNomina);
                }//while

            } catch (IOException e) {
                System.out.println("" + e + "Error en la escritura del fichero");
            }
            dos.close();
            fos.close();

        } catch (IOException e) {
            System.out.println("Error IO ----" + e);
        }
    }//mvCrearFichDeNominas()	

    static void mvActualizarFichDeNominas() {
        // Este método actualiza el fichero de nominas
        try {
            File f1 = new File("nominas.dat");
            FileInputStream fis = new FileInputStream(f1);
            DataInputStream dis = new DataInputStream(fis);

            File fx = new File("auxiliar.dat");
            FileOutputStream fos = new FileOutputStream(fx);
            //FileOutputStream fos = new FileOutputStream("auxiliar.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            try {
                piContBajas = 0;
                while (true) {
                        boolean wbEliminar = false;
                        String wsEmpleado = dis.readUTF();
                        int wiDiasDeBaja = dis.readInt();
                        double wuNomina = dis.readDouble();

                        if (wiDiasDeBaja == 0) {
                            wuNomina = wuNomina + (wuNomina * 0.05);
                        }

                        if (wiDiasDeBaja >= 4 && wiDiasDeBaja <= 10) {
                            wuNomina = wuNomina - (wuNomina * 0.1);
                        }

                        if (wiDiasDeBaja > 10) {
                            wbEliminar = true;
                        }

                        if (!wbEliminar) {
                            dos.writeUTF(wsEmpleado);
                            dos.writeInt(wiDiasDeBaja);
                            dos.writeDouble(wuNomina);
                        } else {
                            piContBajas++;
                        }
                }//while
            } catch (EOFException e) {
                System.out.println("mvActualizarFichDeNominas()--Lectura de fichero terminada\n");
            } catch (IOException e) {
                System.out.println("Error IO " + e + "Error en lectura o escritura de uno de los ficheros\n");
            }

            dos.close();
            fos.close();
            dis.close();
            fis.close();

            f1.delete();
            fx.renameTo(f1);

        } catch (IOException e) {
            System.out.println("" + e);
        }
    }//mvActualizarFichDeNominas()

    static void mvMostrarFichDeNominas() {
        // mostramos el contenido del fichero  
        try {
            File f1 = new File("nominas.dat");
            FileInputStream fis = new FileInputStream(f1);
            DataInputStream dis = new DataInputStream(fis);
            try {
                while (true) {

                    System.out.print(">>>");   ///
                    System.out.println("Nombre: " + dis.readUTF());
                    System.out.print(" - ");
                    System.out.println("Días de Baja: " + dis.readInt());
                    System.out.print(" - ");
                    System.out.println("Nómina: " + dis.readDouble());
                }
            } catch (EOFException e) {
                System.out.println("mvMostrarFichDeNominas()--Lectura del fichero finalizada");
            } catch (IOException e) {
                System.out.println("" + e + "Error en lectura del fichero");
            }
            fis.close();
            dis.close();

        } catch (IOException e) {
            System.out.println("Error IO " + e);
        }
    }//mvMostrarFichDeNominas()

}//CFicheroBinario
