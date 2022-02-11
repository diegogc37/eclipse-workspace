package proyectoMatrices;

import java.util.*;

public class Practica2 {

	private int[][] c;
	private Scanner t= new Scanner(System.in);
	
	public Practica2() {
		System.out.println("Introduce el numero de columnas");
		System.out.print("> ");
		int columnas=t.nextInt();
		System.out.println("");
		c= new int[5][columnas];
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<5;i++) {
			for (int j = 0; j < c[0].length; j++) {
				resultado+=c[i][j]+" ";
			}
		resultado+="\n";
		}
		return resultado;
	}
	
	public void inicializar() {
		Random r=new Random();
		for (int i = 0; i < 5;i++)
			for(int j=0;j<c[0].length;j++) {
				c[i][j]=r.nextInt(10)+1;
			}
	}
	
}
