package accesodirecto;

import java.io.File;
import java.io.RandomAccessFile;

public class accesoDirecto {
    public static void main(String[] args) {
        Ejemplo1();
    }// main()
    
    private static void Ejemplo1() {
        File f = new File("numeros.dat");
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            
            System.out.println("Tamaño fichero: "+raf.length());
            System.out.println("Puntero inicial: "+raf.getFilePointer());
            raf.writeInt(5);
            System.out.println("Puntero primer int: "+raf.getFilePointer());
            raf.writeDouble(3.5);
            System.out.println("Puntero primer double: "+raf.getFilePointer());
            
            System.out.println("Tamaño fichero: "+raf.length());
            raf.seek(0);
            
            System.out.println(raf.readInt());
            System.out.println("Posicion puntero: "+raf.getFilePointer());
            raf.seek(4);
            
            System.out.println(raf.readDouble());
            System.out.println("Posicion puntero: "+raf.getFilePointer());
            
            raf.close();
        } catch (Exception e) {
        }
    }// Ejemplo1()
    
}// accesoDirecto()