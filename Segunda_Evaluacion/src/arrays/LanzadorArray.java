package arrays;

import java.util.*;

public class LanzadorArray {
	
	private ArraysCadenas f18;
	private Scanner t;
	
	public LanzadorArray() {
		t = new Scanner(System.in);
		System.out.println("Introduze el tamanio de la matriz: ");
		System.out.print("> ");
		int tamanioMatriz= t.nextInt(); 
		System.out.println("");
		f18 = new ArraysCadenas(tamanioMatriz);
		f18.inicializar();
		System.out.println(f18.toString());
		f18.invertir();
		System.out.println(f18.toString());
		f18.ordenar();
		System.out.println(f18.toString());
		f18.ordenarInverso();
		System.out.println(f18.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanzadorArray unLanzador=new LanzadorArray();
	}

}
