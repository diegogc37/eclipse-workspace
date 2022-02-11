package programacion.java_74_ejercicios;

public class Ejercicio3 {

	private char[][] array;
	
	public Ejercicio3() {
		array = new char[10][10];
		rellenarArray(array);
		imprimirArray(array);
	}
	
	public void rellenarArray(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j]='-';
			}
		}
	}
	
	public void imprimirArray(char[][] array) {
		System.out.print("{ ");
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
