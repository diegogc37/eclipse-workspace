package ajedrez.game;

import ajedrez.figures.*;
import java.util.*;
import ajedrez.board.*;

public class Ajedrez {

	private static final boolean PIEZA_BLANCA=true;
	private static final boolean PIEZA_NEGRA=false;

	public Ajedrez() {
		Tablero t=new Tablero();
		t.setPieza(0, 0, new Rey(PIEZA_BLANCA));
		t.setPieza(1, 7, new Torre(PIEZA_NEGRA));
		System.out.println(t.haceJaque(t.getPieza(0, 0), t.getPieza(1, 7)));
	}
	
	public static void main(String[] args) {
		Ajedrez g = new Ajedrez(); 
	}

}
