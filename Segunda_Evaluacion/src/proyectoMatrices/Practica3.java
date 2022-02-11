package proyectoMatrices;

import java.util.Random;
import java.util.Scanner;

import Matrices.Matriz;

public class Practica3 {

	private int[][] c;
	private Scanner t = new Scanner(System.in);
	
	public Practica3() {
		System.out.println("Introduce las dimensiones de tu matriz");
		System.out.print("> ");
		int dimension=t.nextInt();
		System.out.println("");
		c=new int[dimension][dimension];
	}
	
	public Practica3(int[][] resultadoArray) {
		this.c = resultadoArray;
	}

	public String toString() {
		String resultado="";
		for(int i=0;i<this.getFila();i++) {
			for (int j = 0; j < this.getColumna(); j++) {
				resultado+=c[i][j]+" ";
			}
		resultado+="\n";
		}
		return resultado;
	}
	
	public void inicializar() {
		Random r=new Random();
		int valor;
		for (int i = 0; i < this.getFila();i++)
			for(int j=0;j<this.getColumna();j++) {
				System.out.println("Introduce el valor de la posicion x = "+(i+1)+" e y = "+(j+1)+":");
				valor=t.nextInt();
				c[i][j]=valor;
			}
	}
	
	public int getFila() {
		return c.length;
	}
	
	public int getColumna() {
		return c[0].length;
	}
	
	public int getValor(int i, int j) {
		return c[i][j];
	}
	
	public boolean mismaDimension(Practica3 a, Practica3 b) {
		boolean sonIguales = true;
			if(a.getFila() != b.getFila() || a.getColumna() != b.getColumna()) {
				sonIguales=false;
				return sonIguales;
			}
		return sonIguales;
	}
	
	public Practica3 sumnaMatriz(Practica3 b) throws Exception{
		
		//if(!mismaDimension(this, b))
			//throw new Exception("No pueden sumarse matrices de dimensiones distintas");
		int[][] resultadoArray=new int[b.getFila()][b.getColumna()];
		for (int i = 0; i < this.getFila(); i++) {
			for (int j = 0; j < b.getColumna(); j++) {
				resultadoArray[i][j]=this.getValor(i, j)+b.getValor(i, j);
			}
		}
		Practica3 resultado=new Practica3(resultadoArray);
		return resultado;
	}
}
