package tareaProg1;
import java.io.IOException;
import java.util.Scanner;
public class Prog1 {
	
	Scanner t = new Scanner(System.in);
	String nombreProceso;
	ProcessBuilder pb = new ProcessBuilder();
	Runtime rt = Runtime.getRuntime() ;
	
	
	public void iniciarPrograma() {
		int opcion = 0;
		do {
			menu();
			opcion=pedirOpcion();
			System.out.println("--------------------------------------------------------");
			procesarOpcion(opcion);
		}while(opcion!=0);
	}
	
	public void menu() {
		System.out.println("-------------------------------------");
		System.out.println("Seleccione una opción: ");
		System.out.println("\t  1) Notepad con ProcessBuilder");
		System.out.println("\t  2) Paint con ProcessBuilder.");
		System.out.println("\t  3) Notepad con RunTime.");
		System.out.println("\t  4) Paint con RunTime.");
		System.out.println("\t  0) Salir.");
		System.out.println("-------------------------------------");
		System.out.print("> ");
		
	}
	
	public int pedirOpcion() {
		return Integer.parseInt(t.nextLine());
		
	}
	
	public void procesarOpcion(int opcion) {
		switch (opcion) {
		case 1: 
			nombreProceso = "notepad.exe";
			abrirProgramaPB(nombreProceso);
			break;
		case 2:
			nombreProceso = "mspaint.exe";
			abrirProgramaPB(nombreProceso);
			break;
		case 3: 
			nombreProceso = "notepad.exe";
			abrirProgramaRT(nombreProceso);
			break;
		case 4: 
			nombreProceso = "mspaint.exe";				
			abrirProgramaRT(nombreProceso);
			break;
		case 0:
			System.out.println("-------------------------------------");
			System.out.println("Saliendo del programa...");
			break;
		default:
			System.err.println("Unexpected value: " + opcion);
			break;
		}
	}
	
	public void abrirProgramaPB(String nombreProceso) {
		Process p = null;
		try {
			pb.command(nombreProceso);
			p = pb.start();//Establecer proceso
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Pid del proceso: "+p.pid());
		System.out.println("Informacion del proceso: "+p.info());
	}
	
	public void abrirProgramaRT(String nombreProceso) {
		Process p = null;
		try {
			p = rt.exec(nombreProceso);//Establecer proceso
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Pid del proceso: "+p.pid());
		System.out.println("Informacion del proceso: "+p.info());
	}
	
	public static void main(String[] args) {
		Prog1 p = new Prog1();
		p.iniciarPrograma();
	}
}