package hilosvariablecomun;
public class Datos {

	private int variable=0;
	
	public synchronized void aumentarVariable() {
		++variable;
	}
	
	
	public int getVariable() {
		return variable;
	}
	
}
