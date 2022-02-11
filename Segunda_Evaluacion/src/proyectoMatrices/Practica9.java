package proyectoMatrices;

import java.util.*;

public class Practica9 {
	
	private char[][] m = {{'-', '-', '-'},{'-', '-', '-'},{'-', '-', '-'}};
	private Scanner t = new Scanner(System.in);
	private boolean endGame = false;
	
	public Practica9() {
		char X = 'x';
		char O = 'o';
		toString();
		do {
			System.out.println("Introduce la fila jugador X: ");
			System.out.print("> ");
			int filaX = t.nextInt();
			System.out.println("");
			System.out.println("Introduce la columna jugador X: ");
			System.out.print("> ");
			int columnaX = t.nextInt();
			System.out.println("");
			comprobarX(filaX, columnaX);
			toString();
			if(comprobarJuego()==1)
				break;
			System.out.println("Introduce la fila jugador O: ");
			System.out.print("> ");
			int filaO = t.nextInt();
			System.out.println("");
			System.out.println("Introduce la columna jugador O: ");
			System.out.print("> ");
			int columnaO = t.nextInt();
			System.out.println("");
			comprobarO(filaO, columnaO);
			toString();
			if(comprobarJuego()==1)
				break;
		}while(!endGame);
	}
	
	public void setGame() {
		endGame=true;
	}
	
	public void comprobarX(int fila, int columna) {
		if (m[fila][columna] == '-') {
			m[fila][columna] = 'x';
		}
	}
	
	public void comprobarO(int fila, int columna) {
		if (m[fila][columna] == '-') {
			m[fila][columna] = 'O';
		}
	}
	
	public int comprobarJuego() {
		int j = 0;
		int i = 0;
		int opcion=0;
			if(m[i][i]==m[i][i+1] && m[i][j]==m[i][i+2]) {
				if(m[i][i]=='x') {
					opcion=1;
					System.out.println("Gandador jugador X");
					setGame();
				}else {
					opcion=1;
					System.out.println("Gandador jugador O");
					setGame();
				}
			}else if(m[i][j]==m[i][j+1]&&m[i][j]==m[i][j+2]) {
				if(m[i][i]=='x') {
					opcion=1;
					System.out.println("Gandador jugador X");
					setGame();
				}else {
					opcion=1;
					System.out.println("Gandador jugador O");
					setGame();
				}
			}else if(m[i][j]==m[i+1][j]&&m[i][j]==m[i+2][j]) {
				if(m[i][i]=='x') {
					opcion=1;
					System.out.println("Gandador jugador X");
					setGame();
				}else {
					opcion=1;
					System.out.println("Gandador jugador O");
					setGame();
				}
			}else if(m[1][j]==m[1][j+1]&&m[1][j]==m[1][j+2]) {
				if(m[i][i]=='x') {
					opcion=1;
					System.out.println("Gandador jugador X");
					setGame();
				}else {
					opcion=1;
					System.out.println("Gandador jugador O");
					setGame();
					}
			}else if(m[i][1]==m[i+1][j]&&m[i][1]==m[i+2][1]) {
				if(m[i][i]=='x') {
					opcion=1;
					System.out.println("Gandador jugador X");
					setGame();
				}else {
					opcion=1;
					System.out.println("Gandador jugador O");
					setGame();
				}
			}else if(m[2][j]==m[2][j+1]&&m[2][j]==m[2][j+2]) {
				if(m[i][i]=='x') {
					opcion=1;
					System.out.println("Gandador jugador X");
					setGame();
				}else {
					opcion=1;
					System.out.println("Gandador jugador O");
					setGame();
					}
			}else if(m[i][2]==m[i+1][2]&&m[i][2]==m[i+2][2]) {
				if(m[i][i]=='x') {
					opcion=1;
					System.out.println("Gandador jugador X");
					setGame();
				}else {
					opcion=1;
					System.out.println("Gandador jugador O");
					setGame();
					}
			}else {
				for (int k = 0; k < m.length; k++) {
					for (int k2 = 0; k2 < m.length; k2++) {
						if(m[k][k2]!='-'&&k==2&&k2==2) {
								System.out.println("El juego termina en empate.");
								opcion=1;
						}
					}
				}
			}
			return opcion;
	}
	
	public String toString() {
		String resultado="";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		return resultado;
	}
	
}
