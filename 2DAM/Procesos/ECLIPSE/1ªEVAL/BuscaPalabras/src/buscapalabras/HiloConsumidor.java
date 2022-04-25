package buscapalabras;
import java.util.ArrayList;

public class HiloConsumidor implements Runnable {
	private Datos datos;
	private String clave;

	public HiloConsumidor (Datos datos) {
		this.datos = datos;
		clave = datos.getClave().toLowerCase();
	}// HiloConsumidor()

	@Override
	public void run () {
		String palabra;
		ArrayList<String> palabrasQueContienenClave = new ArrayList<String>();
		while ((palabra = datos.consumir()) != Datos.CLAVE_FINAL) {
			if (palabra.toLowerCase().contains(clave)) {
				palabrasQueContienenClave.add(palabra);
			}
		}
		datos.acumularOcurrencias(palabrasQueContienenClave);
	}// run()
	
}// HiloConsumidor