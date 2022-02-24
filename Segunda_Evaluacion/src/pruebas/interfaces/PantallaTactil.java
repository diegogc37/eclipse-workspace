package pruebas.interfaces;

public class PantallaTactil extends Pantalla implements Periferico  {

	private int posicionX, posicionY;
	
	public PantallaTactil(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	
	public int getPosicionX() {
		return posicionX;
	}
	
	public int getPosicionY() {
		return posicionY;
	}
	
	public void setPosicionX(int posicionX) {
		this.posicionX=posicionX;
	}
	
	public void setPosicionY(int posicionY) {
		this.posicionY=posicionY;
	}
}
