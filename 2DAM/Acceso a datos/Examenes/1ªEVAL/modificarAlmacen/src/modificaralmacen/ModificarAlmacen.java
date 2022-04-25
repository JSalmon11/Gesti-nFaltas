package modificaralmacen;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ModificarAlmacen {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner(System.in);

        File f = new File("datos.txt");
        File fraf = new File("productos.dat");
        RandomAccessFile raf = new RandomAccessFile(fraf, "rw");
        String frase;
        
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        frase = br.readLine();
        while (frase!=null) {
            String[] mod=frase.split(" ");
            switch(mod[0]){
                case "Modificacion":
                    int cod = Integer.parseInt(mod[1]);
                    raf.seek(0);
                    int codigo=raf.readInt();
                    while (codigo!=cod) {                        
                        raf.readInt();
                        raf.readDouble();
                        codigo=raf.readInt();
                    }
                    if ("cantidad".equals(mod[2])) {
                        raf.writeInt(Integer.parseInt(mod[3]));
                    }else if("precio".equals(mod[2])){
                        raf.readInt();
                        raf.writeDouble(Double.parseDouble(mod[3]));
                    }
                    break;
                case "Alta":
                    raf.seek(0);
                    int finCod=0;
                    cod = Integer.parseInt(mod[1]);
                    codigo=raf.readInt();
                    try{
                        while (codigo!=cod) {                        
                            raf.readInt();
                            raf.readDouble();
                            finCod=raf.readInt();
                        }
                    } catch (EOFException e) {
                    }
                    int cantidad=Integer.parseInt(mod[1]);
                    double precio=Double.parseDouble(mod[2]);
                    raf.seek(raf.length());
                    raf.writeInt(finCod+1);
                    raf.writeInt(cantidad);
                    raf.writeDouble(precio);
                    break;
                case "Baja":
                    cod = Integer.parseInt(mod[1]);
                    raf.seek(0);
                    codigo=raf.readInt();
                    while (codigo!=cod) {                        
                        raf.readInt();
                        raf.readDouble();
                        codigo=raf.readInt();
                    }
                    raf.writeInt(-1);
            }
            frase = br.readLine();
        }
        br.close();
        fr.close();
        raf.seek(0);
        try{
            while (raf.getFilePointer()!=raf.length()) {
                int cod = raf.readInt();
                int cant = raf.readInt();
                double precio = raf.readDouble();
                if (cant!=-1){
                    System.out.println("-----------------------------");
                    System.out.print("Producto ");
                    System.out.println(cod+":");
                    System.out.println("-Cantidad:\t"+cant+" unidades.");
                    System.out.println("-Precio:\t"+precio+"€.");
                }
            }
        } catch (EOFException e) {
        }
        raf.close();
    }// main()

}// ModificarAlmacen
