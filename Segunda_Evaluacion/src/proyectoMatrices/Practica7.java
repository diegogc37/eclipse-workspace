package proyectoMatrices;

import java.util.Random;

public class Practica7 {
	private int[][] m= new int[3][3];
	private Random r= new Random();
	
	public Practica7() {
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
	
	public int randomSumaFilaColumna() {
		int resultado=0;
		int opcion = r.nextInt(2)+1;
		System.out.println("> Para elegir si sumar una fila o un columna /nla elegiremos de manera aleatoria");
		System.out.println("> La opcion elegida es: "+opcion);
		switch(opcion) {
			case 1:
				int fila = r.nextInt(m.length);
				System.out.println("> La fila elegida es: "+fila);
				switch(fila) {
				case 0:
					for (int i = 0; i < m.length; i++)
						resultado+=m[fila][i];
					break;
				case 1:
					for (int i = 0; i < m.length; i++)
						resultado+=m[fila][i];
					break;
				case 2: 
					for (int i = 0; i < m.length; i++)
						resultado+=m[fila][i];
					break;
				}
			case 2:
				int columna = r.nextInt(m[0].length);
				System.out.println("> La columna elegida es: "+columna);
				switch(columna) {
				case 0:
					for (int i = 0; i < m.length; i++)
						resultado+=m[i][columna];
					break;
				case 1:
					for (int i = 0; i < m.length; i++)
						resultado+=m[i][columna];
					break;
				case 2: 
					for (int i = 0; i < m.length; i++)
						resultado+=m[i][columna];
					break;
				default:
					break;
				}
		}
		System.out.println(resultado);
		return resultado;
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
