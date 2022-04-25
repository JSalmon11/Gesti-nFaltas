package carreraanimales;

public class animal implements Runnable {
    private Datos datos;
    private int posicion;

    public animal(Datos datos) {
        posicion=0;
        this.datos=datos;
    }
    
    @Override
    public void run() {
        boolean finCarrera=false;
        while (!finCarrera) {
            //En cada turno se moverá entre 1 y 6 metros
            posicion+=(int)(Math.random()*4+6);
            System.out.println("El animal "+Thread.currentThread().getName()+
                                "lleva "+posicion+"metros");
            finCarrera=datos.actualizarPos(posicion);
        }
    }
}// animal
