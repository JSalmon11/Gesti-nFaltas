package buscapalabras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HiloProductor implements Runnable {

	private Datos datos;
	private String texto;
	
	public HiloProductor(Datos datos) {
		this.datos=datos;
		texto="";
	}// HiloProductor()
	
	@Override
	public void run() {
		texto=leerArchivo(datos.getArchivo());
		String[] palabras=texto.split(" ");
		for (int i=0;i<palabras.length;++i) {
			datos.producir(palabras[i]);
		}
		datos.producir(Datos.CLAVE_FINAL);
	}// run()
	
	private String leerArchivo(String ruta) {
		File archivo=new File(ruta);
		String contenidos="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea;
			while((linea=br.readLine())!=null) {
				contenidos+=linea;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contenidos;		
	}// leerArchivo()

}// HiloProductor