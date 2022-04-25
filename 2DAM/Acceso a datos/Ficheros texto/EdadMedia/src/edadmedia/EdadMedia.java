package edadmedia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class EdadMedia {
    public static void main(String[] args) {
        File f=new File("Empleados.txt");
        try {
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String linea;
            String componente[];
            linea=br.readLine();
            int media=0;
            int empleados=0;
            int mediaEdad;
            while (linea!=null) {                
                componente=linea.split(" ");
                media+=Integer.parseInt(componente[1]);
                empleados++;
                linea=br.readLine();
            }
            mediaEdad=media/empleados;
            System.out.println("La edad media de los empleados es "+mediaEdad+".");
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }// main()  
}// EdadMedia