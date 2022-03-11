package ajedrez.figures;

public abstract class Figuras {
	
	private final boolean PIEZA_BLANCA=true;
	private final boolean PIEZA_NEGRA=false;
	protected int posX, posY;
	
	public Figuras(boolean color) {
		
	}
	
	public abstract int getPosX();
	
	public abstract int getPosY();
}
