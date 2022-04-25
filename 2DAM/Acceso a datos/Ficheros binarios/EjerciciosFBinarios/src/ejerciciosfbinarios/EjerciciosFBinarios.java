package ejerciciosfbinarios;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjerciciosFBinarios {

    public static void main(String[] args) {
        //numeros1100();
        becas();calcularBeca();
    }// main()
    
    public static void numeros1100() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de numeros a generar");
        int numeros = teclado.nextInt();
        File f = new File("numeros.bin");
        
        try {
            if (!f.exists()) {
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.close();
                fos.close();
            }
            
            FileOutputStream fos = new FileOutputStream(f, true);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < numeros; ++i) {
                dos.writeInt((int) (Math.random() * 101));
            }
            dos.close();
            fos.close();
            
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            try {
                while (true) {
                    System.out.println(dis.readInt());
                }
                
            } catch (EOFException e) {
            }
            dis.close();
            fis.close();
        } catch (IOException e) {
        }
    }// numeros1100()
    
    public static void becas() {
        Scanner teclado = new Scanner(System.in);
        
        String nombreApellido;
        String sexo;
        int edad;
        int numSuspensosCursoAnterior;
        boolean residenciaFamiliar;
        int ingresosAnuales;

        File f = new File("becados.bin");
        try {
            if (!f.exists()) {
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.close();
                fos.close();
            }
            
            FileOutputStream fos = new FileOutputStream(f, true);
            DataOutputStream dos = new DataOutputStream(fos);
            
            System.out.println("Nombre y apellido(* para acabar): ");
            nombreApellido= teclado.nextLine();

            while (!nombreApellido.equalsIgnoreCase("*")) {
                System.out.println("Sexo(H/M): ");
                sexo= teclado.nextLine();

                System.out.println("Edad: ");
                edad=teclado.nextInt();
                teclado.nextLine();

                System.err.println("Numero de suspensos en el curso anteriror: ");
                numSuspensosCursoAnterior=teclado.nextInt();
                teclado.nextLine();

                System.out.println("Residencia familiar(true/false): ");
                residenciaFamiliar=teclado.nextBoolean();
                
                System.out.println("Ingresos anuales: ");
                ingresosAnuales=teclado.nextInt();
                
                dos.writeUTF(nombreApellido);
                dos.writeUTF(sexo);
                dos.writeInt(edad);
                dos.writeInt(numSuspensosCursoAnterior);
                dos.writeBoolean(residenciaFamiliar);
                dos.writeInt(ingresosAnuales);
                
                teclado.nextLine();
                System.out.println("Nombre y apellido(* para acabar): ");
                nombreApellido= teclado.nextLine();
            }
            
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            try {
                while (true) {
                    System.out.println("Nombre:\t\t\t"+dis.readUTF());
                    
                    sexo=dis.readUTF();
                    if("H".equals(sexo) || "h".equals(sexo)){
                        System.out.println("Sexo:\t\t\tHombre");
                    }else if ("M".equals(sexo) || "m".equals(sexo)) {
                        System.out.println("Sexo:\t\t\tMujer");
                    }
                    
                    System.out.println("Edad:\t\t\t"+dis.readInt());
                    
                    System.out.println("Suspensas año anterior:\t"+dis.readInt());
                    
                    residenciaFamiliar=dis.readBoolean();
                    if(residenciaFamiliar){
                        System.out.println("Residencia familiar:\tSí");
                    }else{
                        System.out.println("Residencia familiar:\tNo");
                    }
                    
                    System.out.println("Ingresos anuales:\t"+dis.readInt());
                    System.out.println("-----------------------------------------");
                }
                
            } catch (EOFException e) {
            }
            fis.close();
            dis.close();
            
        } catch (IOException e) {
        }
    }// becas()
    
    public static void calcularBeca() {
        System.out.println("------\nBECAS:\n------");
        try {
            File f = new File("becados.bin");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            try {
                while (true) {
                    String nombreApellido=dis.readUTF();
                    String sexo=dis.readUTF();
                    int edad=dis.readInt();
                    int suspensosAnioAnt=dis.readInt();
                    boolean residenciaFamiliar=dis.readBoolean();
                    int ingresosAnuales=dis.readInt();
                    
                    int cantidadBeca=1500;
                    
                    if (ingresosAnuales<=12000) {
                        cantidadBeca+=500;
                    }
                    if (edad<23){
                        cantidadBeca+=200;
                    }
                    switch (suspensosAnioAnt) {
                        case 0: cantidadBeca+=500; break;
                        case 1: cantidadBeca+=200; break;
                        default: cantidadBeca=cantidadBeca;
                    }
                    if (!residenciaFamiliar) {
                        cantidadBeca+=1000;
                    }
                    
                    System.out.println("Nombre:\t"+nombreApellido+"\n"
                            + "Cuantía de la beca:\t"+cantidadBeca+"€\n"
                            + "-----------------------------------------");
                }
                
            } catch (EOFException e) {
            }
            fis.close();
            dis.close();
        }
        catch (IOException ex) {
        }
    }// calcularBeca()
    
}// EjerciciosFBinarios
