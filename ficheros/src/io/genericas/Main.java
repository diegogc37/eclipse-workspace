package io.genericas;

import java.util.Scanner;

public class Main {

	public Main() {
		Scanner t = new Scanner(System.in);
		int opcion=0;
		Escritor<Datos> e = new Escritor<Datos>("Array2.txt");
		do {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Elija una opcion: ");
			System.out.println("\t 1) Escribir una Matriz.");
			System.out.println("\t 2) Escribir una Fila");
			System.out.println("\t 3) Leer los datos añadidos.");
			System.out.println("***");
			System.out.println("\t 0) Salir.");
			System.out.println("-----------------------------------------------------------------------------");
			opcion=t.nextInt();
			switch(opcion) {
			case 1:
				Matriz matriz = new Matriz();
				e.escribir(matriz);
				break;
			case 2:
				Fila fila = new Fila();
				e.escribir(fila);
				break;
			case 3:
				Lector<Datos> l = new Lector<Datos>("Array2.txt");
				System.out.println(l);
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
	
	public static void main (String[] args) {
		Main m = new Main();
	}
	
}
