package parking;

public class Datos {
	private int nPlazasTotales;
	private int nPlazasLibres;
	private String[] parking;
	
	public Datos(int nPlazasTotales) {
		this.nPlazasTotales=nPlazasTotales;
		this.nPlazasLibres=nPlazasTotales;
		parking=new String[nPlazasTotales];
		for (int i=0;i<parking.length;++i) {
			parking[i]="L";
		}
	}

	public synchronized int aparcar(String coche) {
		while (nPlazasLibres==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int plazaAOcupar=buscarPlazaLibre();
		parking[plazaAOcupar]=coche;
		--nPlazasLibres;
		System.out.println("Ha entrado el coche "+coche+" en la plaza "+(plazaAOcupar+1));
		mostrarInforme();
		System.out.println("\n");
		return plazaAOcupar;
	}// aparcar()
	
	public synchronized void irse (int plaza) {
		++nPlazasLibres;
		System.out.println("Ha salido el coche "+parking[plaza]+" de la plaza "+(plaza+1));
		parking[plaza]="L";
		mostrarInforme();
		System.out.println("\n");
		notifyAll();
	}// irse ()
	
	private int buscarPlazaLibre() {
		boolean encontrado=false;
		int resultado=-1;
		for (int i=0;i<parking.length && !encontrado;++i) {
			if (parking[i].equals("L")) {
				resultado=i;
				encontrado=true;
			}
		}
		return resultado;
	}// buscarPlazaLibre()
	
	private void mostrarInforme() {
		int totalCaracteres=16*nPlazasTotales+1;
		for (int i=0;i<totalCaracteres;++i) {
			System.out.print("-");
		}
		System.out.println("");
		//Primera línea, números de plazas
		for (int i=0;i<parking.length;++i) {
			System.out.print("|    Plaza "+(i+1)+"\t");
		}
		System.out.println("|");
		//Segunda línea separadora
		totalCaracteres=16*nPlazasTotales;
		for (int i=0;i<totalCaracteres;++i) {
			if (i%16==0) {
				System.out.print("|");
			}else {
				System.out.print("-");
			}
		}
		System.out.println("|");
		//Tercera línea, libre u ocupada
		for (int i=0;i<parking.length;++i) {
			System.out.print("|\t"+parking[i]+"\t");
		}
		System.out.println("|");
		//Última línea, cierre
		totalCaracteres=16*nPlazasTotales+1;
		for (int i=0;i<totalCaracteres;++i) {
			System.out.print("-");
		}
	} //mostrarInforme()
	
}// Datos