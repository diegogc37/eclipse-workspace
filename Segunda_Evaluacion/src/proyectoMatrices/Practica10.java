package proyectoMatrices;

import java.util.*;

public class Practica10 {

	private int[][] m = new int[2][3];
	private int[][] n = new int[2][3];
	private int[][] a= new int[2][3];
	private Random r = new Random();
	
	public Practica10() {
		inicializar(m);
		inicializar(n);
		sumar(m,n,a);
		System.out.println(toString(m));
		System.out.println(toString(n));
		System.out.println(toString(a));
	}
	
	public void inicializar(int[][] matriz) {
		int num = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				num = r.nextInt(10)+1;
				matriz[i][j]=num;
			}
		}
	}
	
	public void sumar(int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {
		for (int i = 0; i < matrizSuma.length; i++) {
			for (int j = 0; j < matrizSuma[0].length; j++) {
				matrizSuma[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
	}
	
	public String toString(int[][] a) {
		String resultado="";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				resultado+=a[i][j]+" ";
			}
			resultado+="\n";
		}
		return resultado;
	}
	
}
