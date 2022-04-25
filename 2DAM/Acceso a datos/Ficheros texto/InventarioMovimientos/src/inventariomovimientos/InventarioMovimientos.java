package inventariomovimientos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class InventarioMovimientos {
    public static void main(String[] args) {
        
        File inventario=new File("inventario.txt");
        File movimientos=new File("movimientos.txt");
        String frase;
        
        try{
            FileReader frInvent=new FileReader(inventario);
            BufferedReader brInvent=new BufferedReader(frInvent);
            frase = brInvent.readLine(); 
            String[] inventProd=new String[frase.length()];
            while (frase!=null) {
                inventProd = frase.split(" ");
                System.out.println(inventProd[0]+"-"+inventProd[2]);
                frase = brInvent.readLine();
            }            
            
        }catch(IOException e){
                System.out.println("ERROR");
        }
    }// main()
}// InventarioMovimientos
