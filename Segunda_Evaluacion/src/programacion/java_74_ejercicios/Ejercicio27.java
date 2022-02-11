package programacion.java_74_ejercicios;

import java.util.Random;

public class Ejercicio27 {

	private int[] array; 
	
	public Ejercicio27() {
		array = new int[10];
		rellenarArray(array, 10, 20);
		int numeroPares=0;
		int numeroImpares=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0) 
				numeroPares++;
			else
				numeroImpares++;
		}
		imprimirArray(array);
		System.out.println("");
		System.out.println("Numero de pares: "+numeroPares);
		System.out.println("Numero de impares: "+numeroImpares);
	}
	public void rellenarArray(int[] array, int limiteInferior, int limiteSuperior) {
		Random r = new Random();
		int rango=limiteSuperior-limiteInferior;
		for (int i = 0; i < array.length; i++) {
			array[i]=Math.abs(r.nextInt(rango))+limiteInferior;
		}
	}
	
	public void imprimirArray(int[] array) {
		System.out.print("{ ");
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.print(array[array.length-1]+"}");
	}
	
}
