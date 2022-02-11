package proyectoMatrices;

import java.util.Random;
import java.util.Scanner;

public class Practica4 {

	private int[][] m;
	private Scanner t = new Scanner(System.in);
	
	public Practica4() {
		m=new int[4][4];
	}
	
	public void inicializar() {
		Random r=new Random();
		int valor;
		for (int i = 0; i < this.getFila();i++)
			for(int j=0;j<this.getColumna();j++) {
				System.out.println("Introduce el valor de la posicion x = "+(i+1)+" e y = "+(j+1)+":");
				valor=t.nextInt();
				m[i][j]=valor;
			}
	}

	private int getColumna() {
		return m.length;
	}

	private int getFila() {
		return m[0].length;
	}

	public int sumaFila(int fila) throws Exception {
		if (fila>m.length-1 || fila<0)
			throw new Exception("No puede seleccionar una fila fuera de los limites");
		int suma=0;
		for (int i = 0; i < m.length; i++) {
			suma+=m[fila][i];
		}
		return suma;
	}

	public int sumaColumna(int columna) throws Exception {
		if (columna>m.length-1 || columna<0)
			throw new Exception("No puede seleccionar una fila fuera de los limites");
		int suma=0;
		for (int i = 0; i < m.length; i++) {
			suma+=m[i][columna];
		}
		return suma;
	}
	
	public int sumaDiagonalPrincipal(){
		int suma=0;
		for (int i = 0; i < m.length; i++) {
			suma+=m[i][i];
		}
		return suma;
	}
	
	public int sumaDiagonalSecundaria(){
		int suma=0;
		int i=m.length-1;
			for (int j = 0; j < m.length; j++) {
				suma+=m[j][i];
				i--;
			}
		return suma;
	}
	
	public int media(){
		int suma=0;
		int contador=0;
		for (int i = 0; i < m.length; i++) {
			for(int j=0; j< m[0].length;j++) {
				suma+=m[i][j];
				contador+=1;
			}
		}
		int media = suma/contador;
		return media;
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<this.getFila();i++) {
			for (int j = 0; j < this.getColumna(); j++) {
				resultado+=m[i][j]+" ";
			}
		resultado+="\n";
		}
		return resultado;
	}
}
