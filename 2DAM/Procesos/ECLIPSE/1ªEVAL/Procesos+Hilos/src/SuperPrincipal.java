import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SuperPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessBuilder pb=new ProcessBuilder("java","-cp","D:\\Compartir\\Eclipsepyts\\Procesos+Hilos\\bin","Principal");
		int nProcesos=8;
		int nHilos=4;
		int dardosPorHilo=1000;
		BufferedReader[] buffers=new BufferedReader[nProcesos];
		
		for (int i=0;i<nProcesos;++i) {
			try {
				Process p=pb.start();
				BufferedWriter bw=new BufferedWriter(
						new OutputStreamWriter(p.getOutputStream()));
				buffers[i]=new BufferedReader(
						new InputStreamReader(p.getInputStream()));
				bw.write(nHilos+"\n");
				bw.flush();
				bw.write(dardosPorHilo+"\n");
				bw.flush();
				System.out.println(buffers[i].readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		double aproxPI=0;
		
		for (int i=0;i<nProcesos;++i) {
			try {
				aproxPI+=Double.parseDouble(buffers[i].readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		aproxPI/=nProcesos; // aproxPI = aproxPI / nProcesos;

		System.out.println("La aproximación es "+aproxPI);
	}

}
