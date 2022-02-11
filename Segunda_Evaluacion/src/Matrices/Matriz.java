package Matrices;

import java.util.Random;

public class Matriz {

	private int[][] matriz;
	
	public Matriz(int filas, int columnas) {
		matriz = new int[filas][columnas];
	}
	
	public Matriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public Matriz sumar(Matriz matriz) throws Exception {
		if(!coincidenDimensiones(this,matriz))
			throw new Exception("No pueden sumarse matrices de dimensiones distintas");
		int numeroFilas=matriz.getFila();
		int numeroColumnas=matriz.getColumna();
		int[][] resultadoArray = new int[numeroFilas][numeroColumnas];
		for(int i=0;i<numeroFilas;i++)
			for(int j=0;j<numeroColumnas;j++) 
				resultadoArray[i][j]=matriz.get(i,j)+this.get(i,j);
		Matriz resultado=new Matriz(resultadoArray);
		return resultado;
	}
	
	private int get(int i, int j) {
		return matriz[i][j];
	}
	
	/**
	 * M�todo que multiplica los valores de una matriz y genera una nueva con dichos valores
	 * @param matriz que vamos a multiplicar
	 * @return nueva matriz con los valores modificados
	 * @throws Exception no podemos multiplicar si el numero de columnas de la matriz1 es diferente al numero de filas de la matriz 2
	 * o las filas de la matriz 1 es mayor que las columnas de la matrtiz2
	 */

	public Matriz multiplicar(Matriz matriz) throws Exception {
		int[][] c = new int[this.getFila()][matriz.getColumna()];
		if(!coincidenDimensionesMultiplicar(this, matriz))
			throw new Exception("No pueden sumarse matrices de dimensiones distintas");
		for(int i=0;i<this.getFila();i++) {
			for(int j=0;j<matriz.getFila();j++) {
				for(int k=0; k< matriz.getColumna();k++) {
					c[i][j] += this.get(i,k)*matriz.get(k,j);
				}
			}
		}
		Matriz resultado=new Matriz(c);
		return resultado;
	}
	
	/**
	 * M�todo que da valores aleatorios entre 1 y 10 a las posiciones de la matriz
	 */
	
	public void inicializar() {
		Random r = new Random();
		int valor;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {
				valor=r.nextInt(10)+1;
				matriz[i][j]=valor;
			}
		}
	}
	
	public int getFila() {
		return matriz.length;
	}
	
	public int getColumna() {
		return matriz[0].length;
	}
	
	public boolean coincidenDimensiones(Matriz matrizA, Matriz matrizB) {
		if(matrizA.getColumna()!=matrizB.getColumna() || matrizA.getFila()!=matrizB.getFila())
			return false;
		else
			return true;
	}
	
	public boolean coincidenDimensionesMultiplicar(Matriz matrizA, Matriz matrizB) {
		if(matrizA.getColumna()!=matrizB.getFila())
			return false;
		else
			return true;
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<getFila();i++) {
			for(int j=0;j<getColumna();j++) {
				resultado+=matriz[i][j]+" ";
			} resultado+="\n";
		}
		return resultado;
	}
	
}
