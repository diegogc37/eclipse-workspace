package juegos.batallas;

import java.util.*;

public abstract class Clases {

	private static final int MAX_VIDA_MAGO=60;
	private static final int MIN_VIDA_MAGO=30;
	private static final int MAX_VIDA_TROLL=70;
	private static final int MIN_VIDA_TROLL=40;
	private static final int MAX_VIDA_GUERRERO=100;
	private static final int MIN_VIDA_GUERRERO=80;
	
	protected final int MAX_DAÑO_MAGO=8;
	protected final int MIN_DAÑO_MAGO=6;
	protected final int MAX_DAÑO_GUERRERO=10;
	protected final int MIN_DAÑO_GUERRERO=8;
	protected final int MAX_DAÑO_TROLL=3;
	protected final int MIN_DAÑO_TROLL=1;
	
	protected int puntosVida, puntosAtaque;
	protected String tipoPJ;
	private Random r = new Random();
	
	public Clases(String tipoPJ) {
		this.tipoPJ=tipoPJ;
		if(tipoPJ.toUpperCase().equals("MAGO")) {
			puntosVida=r.nextInt(MAX_VIDA_MAGO)+MIN_VIDA_MAGO;
			puntosAtaque=r.nextInt(MAX_DAÑO_MAGO)+MIN_DAÑO_MAGO;
		}else if(tipoPJ.toUpperCase().equals("GUERRERO")) {
			puntosVida=r.nextInt(MAX_VIDA_GUERRERO)+MIN_VIDA_GUERRERO;
			puntosAtaque=r.nextInt(MAX_DAÑO_GUERRERO)+MIN_DAÑO_GUERRERO;
		}else {
			puntosVida=r.nextInt(MAX_VIDA_TROLL)+MIN_VIDA_TROLL;
			puntosAtaque=r.nextInt(MAX_DAÑO_TROLL)+MIN_DAÑO_TROLL;
		}
	} 
	
	public abstract void atacar(String tipoAtaque, Clases enemigo);
	public abstract String getClase();
	public abstract void setVida(int vida);
	public abstract int getVida();
	public abstract int getAtaque();
	public abstract int getMaxAtaque();
	public abstract int getMinAtaque();
	public abstract String getNombrePJ();
}
