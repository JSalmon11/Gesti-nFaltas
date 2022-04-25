package calculadora;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainCalculadora {
    static Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
                         
        System.out.println("Programa Calculadora");
        
        //Supongamos que ya hemos recibido la información del 
        //usuario y quiere que sumemos 7 y 5
        String mensaje="+ 7 5 10";
        //Elegimos el método
        arrancarCalculadora(mensaje);
        arrancarCalculadoraConArgumentos(mensaje);
    }
    
    private static void arrancarCalculadora(String mensaje) {
    	String[] mensajeSeparado=mensaje.split(" ");
        ProcessBuilder pb=new ProcessBuilder("java",
        		"-cp",
        		"C:\\Users\\madrid\\eclipse-workspace\\Calculadora\\bin",
        		"calculadora.MetodosCalculadora");
        try {
			Process p=pb.start();
			BufferedWriter bw=new BufferedWriter(
								new OutputStreamWriter(p.getOutputStream()));
			BufferedReader br=new BufferedReader(
								new InputStreamReader(p.getInputStream()));
			
			bw.write(mensaje+"\n");
			bw.flush();
			
			String resultado=br.readLine();
			System.out.println("Resultado: "+resultado);
			if (resultado.equals("#0")) {
				System.out.println("Ha habido un error");
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    private static void arrancarCalculadoraConArgumentos(String mensaje) {
        String[] mensajeSeparado=mensaje.split(" ");
        ProcessBuilder pb=new ProcessBuilder();
        ArrayList<String> comando=new ArrayList<String>();
        comando.add("java");
        comando.add("-cp");
        comando.add("C:\\Users\\madrid\\eclipse-workspace\\Calculadora\\bin");
        comando.add("calculadora.MetodosCalculadoraArgumentos");
        for (int i=0;i<mensajeSeparado.length;++i) {
        	comando.add(mensajeSeparado[i]);
        }
        pb.command(comando);
        try {
			Process p=pb.start();
			BufferedReader br=new BufferedReader(
								new InputStreamReader(p.getInputStream()));
			String resultado=br.readLine();
			System.out.println("Resultado: "+resultado);
			if (resultado.equals("#0")) {
				System.out.println("Ha habido un error");
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    
    
}
