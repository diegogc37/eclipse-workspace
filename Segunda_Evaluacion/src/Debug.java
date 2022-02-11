
public class Debug {

	private static boolean encendido=true;
	private static int verbosity=0;
	public static final int TRAZA=0;
	public static final int INFO=1;
	//public static final int =2;
	public static final int ERROR=3;
	
	
	public static void depurar(String mensaje) {
		if(encendido)
			System.out.println("["+java.time.LocalDateTime.now()+"]"+mensaje);
	}
	
	public static void depurar(String mensaje, int parametorVerbosity) {
		if(encendido&&parametorVerbosity<=verbosity)
			System.out.println("["+java.time.LocalDateTime.now()+"]"+mensaje);
	}
	
	public boolean getEstado() {
		return encendido;
	}
	
	public void setEstado(boolean estado) {
		encendido=estado;
	}
	
	
	
}
