package jv20t3;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class CGestiónFaltas {

    static Connection poConexion;
    static Statement poInstruccion;
    static ResultSet poTabla;

    public static void main(String[] args) {
        mvCrearFichFaltas();
        mvMostrarFichFaltas();
        CrearBBDD();
        MostrarAlumnosFaltas();
    }//main ()

    static void mvCrearFichFaltas() {
        try {
            int wiEval;
            int wsDNI;
            String wsNombre;
            int wiFaltas;
            String wsApellidos;
            Scanner woTeclado = new Scanner(System.in);
            System.out.println("Para acabar, 0 al pedir la Evaluación.");

            while (true) {
                System.out.println("Evaluación(1/2/3):  ");
                wiEval = woTeclado.nextInt();
                woTeclado.nextLine();
                if (wiEval == 0) {
                    break;
                }

                if (wiEval == 1) {
                    File fVj = new File("fFaltas1.dat");
                    FileOutputStream fos = new FileOutputStream(fVj, true);
                    DataOutputStream dos = new DataOutputStream(fos);

                    try {
                        while (true) {
                            System.out.println("0 En el DNI para salir");
                            System.out.println("DNI:  ");
                            wsDNI = woTeclado.nextInt();
                            woTeclado.nextLine();
                            if (wsDNI == 0) {
                                break;
                            }
                            System.out.println("Nombre:  ");
                            wsNombre = woTeclado.nextLine();
                            wsNombre = wsNombre.trim();
                            System.out.println("Apellidos:  ");
                            wsApellidos = woTeclado.nextLine();
                            wsApellidos = wsApellidos.trim();
                            System.out.println("Faltas de la evaluación: ");
                            wiFaltas = woTeclado.nextInt();
                            woTeclado.nextLine();

                            dos.writeInt(wsDNI);
                            dos.writeUTF(wsNombre);
                            dos.writeUTF(wsApellidos);
                            dos.writeInt(wiFaltas);
                        }//while
                    } catch (IOException e) {
                        System.out.println("" + e + "Error en la escritura del fichero");
                    }
                    dos.close();
                    fos.close();
                }

                if (wiEval == 2) {
                    File fVj2 = new File("fFaltas2.dat");
                    FileOutputStream fos2 = new FileOutputStream(fVj2, true);
                    DataOutputStream dos2 = new DataOutputStream(fos2);
                    try {
                        while (true) {
                            System.out.println("0 En el DNI para salir");
                            System.out.println("DNI:  ");
                            wsDNI = woTeclado.nextInt();
                            woTeclado.nextLine();
                            if (wsDNI == 0) {
                                break;
                            }
                            System.out.println("Nombre:  ");
                            wsNombre = woTeclado.nextLine();
                            wsNombre = wsNombre.trim();
                            System.out.println("Apellidos:  ");
                            wsApellidos = woTeclado.nextLine();
                            wsApellidos = wsApellidos.trim();
                            System.out.println("Faltas de la evaluación: ");
                            wiFaltas = woTeclado.nextInt();
                            woTeclado.nextLine();

                            dos2.writeInt(wsDNI);
                            dos2.writeUTF(wsNombre);
                            dos2.writeUTF(wsApellidos);
                            dos2.writeInt(wiFaltas);
                        }//while
                    } catch (IOException e) {
                        System.out.println("" + e + "Error en la escritura del fichero");
                    }
                    dos2.close();
                    fos2.close();
                }
                if (wiEval == 3) {
                    File fVj3 = new File("fFaltas3.dat");
                    FileOutputStream fos3 = new FileOutputStream(fVj3, true);
                    DataOutputStream dos3 = new DataOutputStream(fos3);
                    try {
                        while (true) {
                            System.out.println("0 En el DNI para salir");
                            System.out.println("DNI:  ");
                            wsDNI = woTeclado.nextInt();
                            woTeclado.nextLine();
                            if (wsDNI == 0) {
                                break;
                            }
                            System.out.println("Nombre:  ");
                            wsNombre = woTeclado.nextLine();
                            wsNombre = wsNombre.trim();
                            System.out.println("Apellidos:  ");
                            wsApellidos = woTeclado.nextLine();
                            wsApellidos = wsApellidos.trim();
                            System.out.println("Faltas de la evaluación: ");
                            wiFaltas = woTeclado.nextInt();
                            woTeclado.nextLine();

                            dos3.writeInt(wsDNI);
                            dos3.writeUTF(wsNombre);
                            dos3.writeUTF(wsApellidos);
                            dos3.writeInt(wiFaltas);
                        }//while
                    } catch (IOException e) {
                        System.out.println("" + e + "Error en la escritura del fichero");
                    }
                    dos3.close();
                    fos3.close();
                }
            }

        } catch (IOException e) {
            System.out.println("Error IO ----" + e);
        }
    }//mvCrearFichFaltas ()

    static void mvMostrarFichFaltas() {
        try {
            File f1 = new File("fFaltas1.dat");
            FileInputStream fis = new FileInputStream(f1);
            DataInputStream dis = new DataInputStream(fis);

            try {
                System.out.println("");
                System.out.println("PRIMERA EVALUACIÓN");
                while (true) {

                    System.out.println("Alumno: ");
                    System.out.print(" - ");
                    System.out.println("DNI: " + dis.readInt());
                    System.out.print(" - ");
                    System.out.println("Nombre: " + dis.readUTF());
                    System.out.print(" - ");
                    System.out.println("Apellidos: " + dis.readUTF());
                    System.out.print(" - ");
                    System.out.println("Faltas evalucaión: " + dis.readInt());
                }
            } catch (EOFException e) {
                System.out.println("Lectura del fichero finalizada");
            } catch (IOException e) {
                System.out.println("" + e + "Error en lectura del fichero");
            }
            fis.close();
            dis.close();

            File f2 = new File("fFaltas2.dat");
            FileInputStream fis2 = new FileInputStream(f2);
            DataInputStream dis2 = new DataInputStream(fis2);

            try {
                System.out.println("");
                System.out.println("SEGUNDA EVALUACIÓN");
                while (true) {

                    System.out.println("Alumno: ");
                    System.out.print(" - ");
                    System.out.println("DNI: " + dis2.readInt());
                    System.out.print(" - ");
                    System.out.println("Nombre: " + dis2.readUTF());
                    System.out.print(" - ");
                    System.out.println("Apellidos: " + dis2.readUTF());
                    System.out.print(" - ");
                    System.out.println("Faltas evalucaión: " + dis2.readInt());
                }
            } catch (EOFException e) {
                System.out.println("Lectura del fichero finalizada");
            } catch (IOException e) {
                System.out.println("" + e + "Error en lectura del fichero");
            }
            fis2.close();
            dis2.close();

            File f3 = new File("fFaltas3.dat");
            FileInputStream fis3 = new FileInputStream(f3);
            DataInputStream dis3 = new DataInputStream(fis3);

            try {
                System.out.println("");
                System.out.println("TERCERA EVALUACIÓN");
                while (true) {

                    System.out.println("Alumno: ");
                    System.out.print(" - ");
                    System.out.println("DNI: " + dis3.readInt());
                    System.out.print(" - ");
                    System.out.println("Nombre: " + dis3.readUTF());
                    System.out.print(" - ");
                    System.out.println("Apellidos: " + dis3.readUTF());
                    System.out.print(" - ");
                    System.out.println("Faltas evalucaión: " + dis3.readInt());
                }
            } catch (EOFException e) {
                System.out.println("Lectura del fichero finalizada");
            } catch (IOException e) {
                System.out.println("" + e + "Error en lectura del fichero");
            }
            fis3.close();
            dis3.close();

        } catch (IOException e) {
            System.out.println("Error IO " + e);
        }

    }//mvMostrarFichFaltas ()

    public static void mvConectarConBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String wsProtocolo_Driver_Pc_Bd = "jdbc:mysql://localhost/bbdd_gestionfaltas";
            poConexion = DriverManager.getConnection(wsProtocolo_Driver_Pc_Bd, "root", "");
            poInstruccion = poConexion.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("<mvConectarConBD--Class> " + e);
        } catch (SQLException e) {
            System.out.println("<mvConectarConBD-Sql> " + e);
        } catch (Exception e) {
            System.out.println("<mvConectarConBD-Exception> " + e);
        }
    }//mvConcectarConBD ()

    public static void mvDesconectarConBD() {
        try {
            if (null != poTabla) {
                poTabla.close();
            }
            if (null != poInstruccion) {
                poInstruccion.close();
            }
            if (null != poConexion) {
                poConexion.close();
            }
        } catch (Exception e) {
            System.out.println("<mvDesconectarConBD-Exception> " + e);
        }
    }//mvDesconectarConBD ()

    public static void CrearBBDD() {
        mvConectarConBD();
        try {
            boolean wb;
            int wi;

            wb = poInstruccion.execute("Drop table if exists tFaltas;");

            wb = poInstruccion.execute("create table tFaltas "
                    + "(DNI INTEGER Primary Key, NombreCompleto VARCHAR(40), FaltasDelCurso INTEGER);");

            try {
                File f1 = new File("fFaltas1.dat");
                FileInputStream fis = new FileInputStream(f1);
                DataInputStream dis = new DataInputStream(fis);

                File f2 = new File("fFaltas2.dat");
                FileInputStream fis2 = new FileInputStream(f2);
                DataInputStream dis2 = new DataInputStream(fis2);

                File f3 = new File("fFaltas3.dat");
                FileInputStream fis3 = new FileInputStream(f3);
                DataInputStream dis3 = new DataInputStream(fis3);

                try {
                    while (true) {
                        int wiDNI = dis.readInt();
                        String wsNombreCompleto = dis.readUTF() + dis.readUTF();
                        int wiFaltas1 = dis.readInt();

                        int wiDNI2 = dis2.readInt();
                        String wsNombreCompleto2 = dis2.readUTF() + dis2.readUTF();
                        int wiFaltas2 = dis2.readInt();

                        int wiDNI3 = dis3.readInt();
                        String wsNombreCompleto3 = dis3.readUTF() + dis3.readUTF();
                        int wiFaltas3 = dis3.readInt();

                        wi = poInstruccion.executeUpdate("INSERT INTO tFaltas values (" + wiDNI + ",'" + wsNombreCompleto + "'," + (wiFaltas1 + wiFaltas2 + wiFaltas3) + ");");
                    }
                } catch (EOFException e) {
                } catch (IOException e) {
                    System.out.println("" + e + "Error en lectura del fichero");
                }
                fis.close();
                dis.close();
                fis2.close();
                dis2.close();
                fis3.close();
                dis3.close();

            } catch (IOException e) {
                System.out.println("Error IO " + e);
            }
        } catch (SQLException e) {
            System.out.println("<Error Sql> " + e);
        } catch (Exception e) {
            System.out.println("<CrearBBDD Exception> " + e);
        }
        mvDesconectarConBD();
    }//CrearBBDD () 

    public static void MostrarAlumnosFaltas() {
        mvConectarConBD();
        try {
            System.out.println("");
            System.out.println("Lectura en la base de datos");
            System.out.println("---------------------------");
            poTabla = poInstruccion.executeQuery("SELECT * FROM tFaltas");
            while (poTabla.next()) {
                System.out.println("DNI: " + poTabla.getInt("DNI") + " \tNombre: " + poTabla.getString("NombreCompleto") + " \tFaltas: " + poTabla.getInt("FaltasDelCurso"));
            }
        } catch (SQLException e) {
            System.out.println("Errorr SQL:  " + e);
        } catch (Exception e) {
            System.out.println("<MostrarAlumnosFaltas Exception> " + e);
        }
        mvDesconectarConBD();
    }//MostrarAlumnosFaltas ()

}//CGestiónFaltas
