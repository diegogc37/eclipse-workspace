package programacion.java_74_ejercicios;

public class EjercicoVoltearMatrices {

	private int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
	
	public EjercicoVoltearMatrices() {
		
		imprimirArray(array);
		array = voltear(array);
		System.out.println("");
		imprimirArray(array);
	}
	
	public int[][] voltear(int[][] array) {
		int[][] array2 = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array2[array.length-(i+1)][array[0].length-(j+1)]=array[i][j];
			}
		}
		return array2;
	}
	
	public void imprimirArray(int[][] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" {");
			for (int j = 0; j < array[0].length-1; j++) {
				System.out.print(array[i][j]+", ");
			}
			System.out.print(array[i][array[0].length-1]+"}");
		}
		System.out.print(" }");
	}
}
