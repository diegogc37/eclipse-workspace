package juegos.launcher;

import java.util.*;
import io.juegos.*;
import juegos.wordle.*;
import juegos.batallas.*;

public class Launcher {
	
	private Random r = new Random();
	
	public Launcher() {
		Scanner t = new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("Introduce una opcion: ");
			System.out.println("\t 1) Wordle.");
			System.out.println("\t 2) Batallas.");
			System.out.println("***");
			System.out.println("\t 0) Salir.");
			System.out.print("> ");
			opcion=t.nextInt();
			System.out.println("---------------------------------------------------------");
			switch(opcion) {
			case 1:
				Wordle w = new Wordle(seleccionarPalabra());
				break;
			case 2:
				Batallas b = new Batallas();
				break;
			case 0:
				System.out.println("Apagando el sistema...");
				break;
			default:
				break;
			}
		}while(opcion!=0);
		t.close();
	}
	
	public String seleccionarPalabra() {
		String palabra="";
		Lector<String> l = new Lector<>("wordleLectura/palabras5letras.dat");
		ArrayList<String> palabrasElegir = l.leer();
		int numPos=Math.abs(r.nextInt(palabrasElegir.size()));
		palabra=palabrasElegir.get(numPos);
		return palabra;
	}
	
	public static void main(String[] args) {
		Launcher l = new Launcher();
	}

}
