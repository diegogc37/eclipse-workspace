package programacion.main;

import java.util.*;

public class Main {

	public Main() {
		Scanner t = new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("Introduce una opcion: ");
			System.out.println("***");
			System.out.println("\t 0) Salir.");
			System.out.print("> ");
			opcion=t.nextInt();
			System.out.println("---------------------------------------------------------------------------------------------");
			switch(opcion) {
			case 0:
				System.out.println("Apagando el sistema...");
				break;
			
			default:
				break;
			}
		}while(opcion!=0);
		t.close();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}

}
