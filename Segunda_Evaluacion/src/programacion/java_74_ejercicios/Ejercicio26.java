package programacion.java_74_ejercicios;

import java.util.Random;

public class Ejercicio26 {
	
	private int[] array;
	
	public Ejercicio26() {
		array=new int[10];
		rellenarArray(array,0,3);
		imprimirArray(array);
		while(!cerosAlfinal(array)){
			for (int i = 0; i < array.length-1; i++) {
				if (array[i]==0) {
					array[i]=array[i+1];
					array[i+1]=0;
				}
			}
		}
		System.out.println("");
		imprimirArray(array);
	}
	public boolean cerosAlfinal(int[] array) {
		boolean cerosAlfinal=false;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]==0 && array[i+1]!=0) {
				cerosAlfinal=false;
			}else {
				cerosAlfinal=true;
			}	
		}
		return cerosAlfinal;
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
