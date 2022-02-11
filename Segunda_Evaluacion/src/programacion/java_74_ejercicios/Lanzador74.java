package programacion.java_74_ejercicios;

import java.util.Scanner;

public class Lanzador74 {

	private Scanner t = new Scanner(System.in); 
	
	private Ejercicio2 ej2;
	private Ejercicio3 ej3;
	private Ejercicio4 ej4;
	private Ejercicio26 ej26;
	private Ejercicio27 ej27;
	private Ejercicio32 ej32;
	private EjercicioExamen ej75;
	private EjercicoVoltearMatrices ej76;
	
	public Lanzador74() {
		int opcion;
		do {
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println("Elija una opcion: ");
			System.out.println("\t1 1) Ejercicio1 ");
			System.out.println("\t2 2) Suma de los valores de un array aleatorio. ");
			System.out.println("\t3 3) Imprimir una matriz 10x10 de guiones. ");
			System.out.println("\t4 4) Calcular la media de los valores de un array de una medida predeterminada. ");
			System.out.println("\t26 26) Mover todos los ceros de un array a la derecha. ");
			System.out.println("\t27 27) Calcular numero de impares y pares en un array. ");
			System.out.println("\t32 32) Comprobar dos enteros en matriz. ");
			System.out.println("\t75 75) Ejercicio simulacro Examen. ");
			System.out.println("\t76 76) Ejercicio simulacro Examen. ");
			System.out.println("\t0 ) Salir ");
			System.out.print(">");
			opcion = t.nextInt();
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			switch(opcion) {
			case 0:
				System.out.println("Apagando el sistema............");
				break;
			case 1:
				
				break;
			case 2:
				ej2 = new Ejercicio2();
				System.out.println("");
				break;
			case 3:
				ej3 = new Ejercicio3();
				break;
			case 4:
				ej4 = new Ejercicio4();
				break;
			case 26:
				ej26 = new Ejercicio26();
				System.out.println("");
				break;
			case 27:
				ej27 = new Ejercicio27();
				break;
			case 32:
				ej32= new Ejercicio32();
				System.out.println("");
				break;
			case 75:
				ej75 = new EjercicioExamen();
				break;
			case 76:
				ej76 = new EjercicoVoltearMatrices();
				System.out.println("");
				break;
			default:
				break;
			}
		}while(opcion!=0);
		t .close();		
	}
	
	public static void main(String[] args) {
		Lanzador74 main= new Lanzador74();
	}

}
