package tareaProg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Prog3 {

	
	
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int opcion = 0;
		Scanner t = new Scanner(System.in);
		Runtime rt = Runtime.getRuntime();
		ProcessBuilder pb;
		String[] nombreProcesoArray = new String[5];
		String linea;
		BufferedReader br;
		Random r = new Random();
		Process p;
		String[] nombreProcesoCMD = new String[4];
		try {
		do {
			System.out.println("---------------------------------------------");
			System.out.println("Seleccione una opcion: ");
			System.out.println("\t1) Abrir bloc de notas. ");
			System.out.println("\t2) Comando ipconfig.");
			System.out.println("\t3) Introducir comando.");
			System.out.println("\t0) Salir.");
			System.out.println("Seleccione una opcion: ");
			System.out.print("> ");
			opcion=t.nextInt();
			t.nextLine();
			System.out.println("---------------------------------------------");
			switch (opcion) {
			case 1:
				nombreProcesoArray[0] = "notepad.exe";
				nombreProcesoArray[1] = "mspaint.exe";
				int randomNumber = r.nextInt(2);
				//Process p = rt.exec(nombreProcesoArray[randomNumber]);
				pb = new ProcessBuilder(nombreProcesoArray[randomNumber]);
				p = pb.start();
				p.waitFor();
				System.out.println("Aplicacion cerrada con exito");
				break;
			case 2:
				nombreProcesoArray[2] = ( "ipconfig");
				//p = rt.exec(nombreProcesoArray[2]);
				pb = new ProcessBuilder(nombreProcesoArray[2]);
				p = pb.start();
				br= new BufferedReader(new InputStreamReader (p.getInputStream()));
				while((linea = br.readLine())!=null) {
					System.out.println(linea);
				}
				br.close();
				break;
			case 3:
				System.out.println("Introduzca el comando a ejecutar.");
				System.out.print("> ");
				//nombreProcesoArray[3] = t.nextLine();
				try {
					nombreProcesoCMD = separarCadena(t.nextLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
				//p = rt.exec(nombreProcesoArray[3]);
				pb = new ProcessBuilder(nombreProcesoCMD);
				p = pb.start();
				br= new BufferedReader(new InputStreamReader (p.getInputStream()));
				while((linea = br.readLine())!=null) {
					System.out.println(linea);
				}
				br.close();
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				break;
			}
		}while(opcion!=0);
		}catch(IOException e){
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private static String[] separarCadena(String cadena) {
		String[] devuelto = cadena.split(" ");
		return devuelto;
	}
}
