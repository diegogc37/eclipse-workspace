package programacion.java_74_ejercicios;

import java.util.Random;

public class Ejercicio4 {

	private int[] array;
	
	public Ejercicio4() {
		array = new int[4];
		rellenarArray(array);
		imprimirArray(array);
		System.out.println("");
		double averageValue=averageValue(array);
		System.out.println("El valor medio de los valores es: "+averageValue);
	}
	
	public double averageValue(int[] array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		double media=sum/array.length;
		return media;
	}
	
	public void rellenarArray(int[] array) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			int num = r.nextInt(10)+1;
			array[i]=num;
		}
	}
	
	public void imprimirArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.print(array[array.length-1]+"}");
	}
	
}
