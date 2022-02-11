package programacion.java_74_ejercicios;

import java.util.Random;

public class Ejercicio2 {

	private int[] array;
	
	public Ejercicio2() {
		array = new int[20];
		rellenarArray(array, 10, 50);
		imprimirArray(array);
		System.out.print(sumaValores());
		
	}
	
	public int sumaValores() {
		int suma=0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
		}
		return suma;
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
