
public class HiloContadorAlt implements Runnable {

	private String texto;
	private String vocales;
	private DatosAlt datos;
	private int indice;
	private int[] desgloseVocales;

	public HiloContadorAlt(DatosAlt datos) {
		this.datos = datos;
		this.texto = datos.getTexto();
		this.vocales = datos.getVocalesABuscar();
		this.desgloseVocales = new int[vocales.length()];
	}

	@Override
	public void run() {
		int contador = 0;
		for (int i = 0; i < texto.length(); ++i) {
			char caracter = texto.charAt(i);
			for (int j = 0; j < vocales.length(); ++j) {
				if (caracter == vocales.charAt(j)) {
					//++contador;
					++this.desgloseVocales[j];
				}
			}
		}

		for (int i = 0; i < desgloseVocales.length; ++i) {
			//System.out.println("Soy el hilo "+Thread.currentThread().getName()+" y he encontrado "+desgloseVocales[i]+" ocurrencias de "+vocales.charAt(i));
			contador += desgloseVocales[i];
		}
		datos.acumularVocales(contador, desgloseVocales);
	}
}
