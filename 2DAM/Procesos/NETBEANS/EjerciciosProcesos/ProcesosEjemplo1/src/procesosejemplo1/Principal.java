package procesosejemplo1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
public class Principal {
    public static void main(String[] args) {
        //cmd();
        ping();
    }// main
    
    public static void cmd(){
                ProcessBuilder pb=new ProcessBuilder("cmd.exe","/C","start");
        try {
            for (int i = 0; i < 5; i++) {
            Process cmd=pb.start();                
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }// cmd()
    
    public static void ping(){
        //Hace un solo ping tras pasarle el parámetro -n
        ProcessBuilder pb=new ProcessBuilder("ping","8.8.8.8","-n","1");
        try {
            Process procesoPing=pb.start();           
            BufferedReader br=new BufferedReader(new InputStreamReader(procesoPing.getInputStream()));
            String mensaje;
            while((mensaje = br.readLine())!=null){          
            System.out.println(mensaje);
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}// Principal()