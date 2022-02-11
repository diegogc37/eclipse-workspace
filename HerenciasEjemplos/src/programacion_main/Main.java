package programacion_main;

import java.util.Scanner;

import herencia.mamiferos.Elefante;
import herencia.mamiferos.Gato;
import herencia.mamiferos.Ornitorrinco;
import programacion_classes_abstract.Mamifero;
import programacion_main_class.Vertebrado;

public class Main {

	public Main() {
		menu();
	}
	
	public void menu(){
		Scanner t = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Introduce una opcion: ");
			System.out.println("\t 1) Mamifero.");
			System.out.println("\t 2) Ornitorrinco.");
			System.out.println("\t 3) Gato.");
			System.out.println("***");
			System.out.println("\t 0) Salir.");
			opcion = t.nextInt();
			System.out.println("---------------------------------------------------------------------");
			switch(opcion) {
			case 1:
				
			case 2:
				
				break;
			case 3:
				
				break;
			case 0:
				System.out.println("Apagando el sistema....3...2...1...");
				break;
			default:
				break;
			}
			
		}while(opcion!=0);
		t.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
	}

}
