package carreraanimales;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Preloader;

public class Datos {
    private int longitudCarrera;
    private int nAnimales;
    private int cont;
    private boolean finCarrera;

    public Datos(int longitudCarrera, int nAnimales, int cont, boolean finCarrera) {
        this.longitudCarrera = longitudCarrera;
        this.nAnimales = nAnimales;
        this.cont = cont;
        this.finCarrera = finCarrera;
    }
    
    public synchronized boolean actualizarPos(int posicion){
        ++cont;
        if (posicion>longitudCarrera) {
            finCarrera=true;
        }
        if (cont<longitudCarrera) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            notifyAll();
            cont=0;
        }
        return finCarrera;
    }
}// Datos