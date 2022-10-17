package tareaProg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prog2 {

	private String nombreProceso = "notepad.exe";
	ProcessBuilder pb = new ProcessBuilder(nombreProceso);
	private Scanner t = new Scanner(System.in);
	private Process p = null;
	private String nombreFichero="";
	
	public void iniciarPrograma() {
		int opcion = 0;
		do {
			menu();
			opcion = pedirOpcion();
			System.out.println("--------------------------------------------------------");
			procesarOpcion(opcion);
		}while(opcion!=0);
	}
	
	public void menu() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Seleccione una opcion: ");
		System.out.println("\t 1. Crear fichero (nombre+texto).");
		System.out.println("\t 2. Abrir fichero (programa espera).");
		System.out.println("\t 3. Abrir fichero (programa no espera).");
		System.out.println("\t 4. Cerrar fichero.");
		System.out.println("\t 5. Leer fichero.");
		System.out.println("\t 0. Salir.");
		System.out.println("--------------------------------------------------------");
		System.out.print("> ");
	}
	
	public int pedirOpcion() {
		return Integer.parseInt(t.nextLine());
		
	}
	
	public void procesarOpcion(int opcion) {
		switch(opcion) {
		case 1:
			ficheros(opcion);
			break;
		case 2:
			programs(opcion);
			break;
		case 3:
			programs(opcion);
			break;
		case 4:
			programs(opcion);
			break;
		case 5:
			ficheros(opcion);
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		default:
			break;
		}
	}
	
	public void ficheros(int opcion) {
		try {
		if(opcion==1){
			System.out.println("Introduzca la direccion y el nombre del archivo:");
			System.out.print("> ");
			nombreFichero = t.nextLine();
			File f = new File(nombreFichero);
			f.createNewFile();
			BufferedWriter bfw = new BufferedWriter(new FileWriter(nombreFichero));
			System.out.println("Introduzca el contenido del archivo:");
			System.out.print("> ");
			String texto = t.nextLine();
			bfw.write(texto);
			bfw.close();
		}else if(opcion==5){
			BufferedReader bfr = new BufferedReader(new FileReader(nombreFichero));
			String textoFichero = bfr.readLine();
			bfr.close();
			System.out.println(textoFichero);
		}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	
	public void programs(int opcion) {
		try {
		if(opcion==2) {
			p = pb.start();
			p.waitFor();
		}else if(opcion==3) {
			p= pb.start();
		}else if(opcion==4){
			p.destroy();
		}
		}catch(IOException e){
			e.printStackTrace();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Prog2 menu = new Prog2();
		menu.menu();
	}
}
