package io.genericas;

public class Matriz extends Datos{

	private int[][] matriz;
	
	public Matriz() {
		super();
		matriz= new int[2][2];
		int numero = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=numero;
				numero++;
			}
		}
	}
	
	public String toString() {
		String resultado="{";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(j==matriz.length-1)
					resultado+=matriz[i][j];
				else
					resultado+=matriz[i][j]+",";
			}
			if(i==matriz.length-1) 
				resultado+="}";
			else
				resultado+="},{";
		}
		return resultado;
	}

}
