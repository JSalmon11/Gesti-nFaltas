package cuentavocales;
import java.io.File;
import java.io.FileReader;

public class Hilo implements Runnable {
    private Datos datos;
    private char vocal;
    
    public Hilo(Datos datos, char vocal) {
        this.datos=datos;
        this.vocal=(char) vocal;
    }

    @Override
    public void run() {
        int vocalNum=0;
        File f = new File("voc.txt");
        
        try {
            FileReader fr = new FileReader(f);
            
            while (fr.read()!=-1) {
                char letra=(char) fr.read();
                if (letra == (char) vocal){
                    ++vocalNum;
                }
            }
            datos.sumarVocal(vocalNum);
            
        } catch (Exception e) {
        }
    }// run()
}// Hilo