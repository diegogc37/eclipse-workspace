package programacion.java_74_ejercicios;

import java.util.Random;

public class Ejercicio32 {
		
		private int[] array;
	
		public Ejercicio32() {
			array = new int[20];
			rellenarArray(array, 64, 78);
			imprimirArray(array);
			System.out.print(contener());
		}
	
		public boolean contener() {
			boolean existe65=false;
			boolean existe77=false;
			for (int i = 0; i < array.length; i++) {
				if (array[i]==65) {
					existe65=true;
				}else if(array[i]==77){}
					existe77=true;
			}
			return existe65 && existe77;
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
