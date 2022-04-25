package buscapalabras;
import java.util.ArrayList;

public class Datos {
	public final static String CLAVE_FINAL = "$--/FIN/--$";
	private String clave;
	private String siguientePalabra;
	private String archivo;
	private ArrayList<String> ocurrencias;

	public Datos (String archivo, String clave) {
		this.archivo = archivo;
		this.clave = clave;
		ocurrencias = new ArrayList<String>();
	}// Datos()

	public String getArchivo ()
	{
		return archivo;
	}

	public String getClave ()
	{
		return clave;
	}

	public synchronized void acumularOcurrencias (ArrayList<String> parcial)
	{
		ocurrencias.addAll(parcial);
	}

	public ArrayList<String> getOcurrencias ()
	{
		return ocurrencias;
	}

	public synchronized void producir (String palabra)	{
		while (siguientePalabra != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		siguientePalabra = palabra;
		notifyAll();
	}// producir()

	public synchronized String consumir() {
		while (siguientePalabra == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String aux = siguientePalabra;
		if (siguientePalabra != CLAVE_FINAL) {
			siguientePalabra = null;
		}
		notifyAll();
		return aux;
	}// consumir()
	
}// Datos