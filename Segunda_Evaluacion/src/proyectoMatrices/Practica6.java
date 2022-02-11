package proyectoMatrices;

import java.util.Random;

public class Practica6 {
	
	private int[][] m= new int[3][3];
	private Random r= new Random();
	
	public Practica6() {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				do{
					int num = r.nextInt(9)+1;
				if(!comprobarDuplicado(num)) {
					m[i][j]=num;
				}
				}while(m[i][j]==0);
			}
		}
	}
	
	public boolean comprobarDuplicado(int num) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if(m[i][j] == num) 
					return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<m.length;i++) {
			for (int j = 0; j < m[0].length; j++) {
				resultado+=m[i][j]+" ";
			}
		resultado+="\n";
		}
		return resultado;
	}
}
