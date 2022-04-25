package maxminmed;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.ProcessBuilder;
import java.lang.Process;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MaxMinMed {
	
	
    public static void main(String[] args) throws IOException {
      
    	String numeros=recibirNumerosDelUsuario();
    	String[] resultados=new String[3];
    	String[] nombresProcesos=new String[] {"maxminmed.Maximo","maxminmed.Minimo","maxminmed.Media"};
    	
    	for (int i=0;i<3;++i) {
    		ProcessBuilder pb = new ProcessBuilder("java","-cp",
                    "C:\\Users\\madrid\\eclipse-workspace\\MaximoMinimoMedia\\bin",
            		nombresProcesos[i]);
    		resultados[i]=invocarProceso(pb,numeros);
    	}
    	
    	System.out.println("Resultado: el máximo es "+resultados[0]+", el mínimo es "+resultados[1]+" y la media es "+resultados[2]);
    	
    	
    	//En lugar de hacer el bucle, esto hace lo mismo, pero peor porque
    	//repite código
    	/*
        ProcessBuilder pb = new ProcessBuilder("java","-cp",
                "C:\\Users\\madrid\\eclipse-workspace\\MaximoMinimoMedia\\bin",
        		"maxminmed.Maximo");
        String maximo=invocarProceso(pb,numeros);
        pb = new ProcessBuilder("java","-cp",
                "C:\\Users\\madrid\\eclipse-workspace\\MaximoMinimoMedia\\bin",
				"maxminmed.Minimo");
        String minimo=invocarProceso(pb,numeros);
        pb = new ProcessBuilder("java","-cp",
                "C:\\Users\\madrid\\eclipse-workspace\\MaximoMinimoMedia\\bin",
				"maxminmed.Media");
        String media=invocarProceso(pb,numeros);
        */
    }
    
    private static String recibirNumerosDelUsuario() {
    	return "6 4 23 0 15 99 43 73 25";
    }
    
    private static String invocarProceso(ProcessBuilder pb,String numeros) {
    	Process p;
    	String resultado="";
		try {
			p = pb.start();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
			BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			bw.write(numeros+"\n");
			bw.flush();
			
			resultado = br.readLine();
			
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultado;    	
    }
    
    
    
    
}
