package Matrices;

import java.util.*;

public class LanzadorMatrices {

	private Matriz matrizA;
	private Matriz matrizB;
	private Scanner t;
	
	public LanzadorMatrices() throws Exception {
		t = new Scanner(System.in);
		System.out.println("Introduce el numero de filas de la primera matriz: ");
		System.out.print("> ");
		int f1=t.nextInt();
		System.out.println("");
		System.out.println("Introduce el numero de columnas de la primera matriz: ");
		System.out.print("> ");
		int c1=t.nextInt();
		System.out.println("");
		System.out.println("Introduce el numero de filas de la segunda matriz: ");
		System.out.print("> ");
		int f2=t.nextInt();
		System.out.println("");
		System.out.println("Introduce el numero de columnas de la segunda matriz: ");
		System.out.print("> ");
		int c2=t.nextInt();
		System.out.println("");
		matrizA=new Matriz(f1,c1);
		matrizA.inicializar();
		System.out.println("MatrizA: ");
		System.out.println(matrizA.toString());
		matrizB=new Matriz(f2,c2);
		matrizB.inicializar();
		System.out.println("MatrizB: ");
		System.out.println(matrizB.toString());
		System.out.println("MatrizA + MatrizB: ");
		Matriz matrizC = matrizA.sumar(matrizB);
		System.out.println(matrizC.toString());
		System.out.println("MatrizA * MatrizB: ");
		Matriz matrizD = matrizA.multiplicar(matrizB);
		System.out.println(matrizD.toString());
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LanzadorMatrices lm = new LanzadorMatrices();
	}

}
