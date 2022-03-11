package ajedrez.board;

import ajedrez.figures.*;

public class Tablero {

	private Figuras[][] tablero;
	
	public Tablero() {
		tablero = new Figuras[8][8];
	}
	
	public boolean haceJaque(Figuras t, Figuras r) {
		boolean jaque=false;
		if(t.getPosX()==r.getPosX() || t.getPosY()==r.getPosY()) {
			jaque=true;
		}
		return jaque;
	}
	
	public Figuras getPieza(int x, int y) {
		return tablero[x][y];
	}
	
	public void setPieza(int x, int y, Figuras f) {
		tablero[x][y]=f;
	}
	
	public void representar() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(" ");
			}
		}
	}
}
