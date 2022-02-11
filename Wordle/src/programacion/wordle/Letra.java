package programacion.wordle;

public class Letra {

	private char c;
	boolean estaEnSuSitio;
	boolean existe;
	
	public Letra(char c) {
		this.c=c;
		estaEnSuSitio=false;
		existe = false;
	}
	
	public char getChar() {
		return c;
	}
	
	public boolean existe() {
		return existe;
	}
	
	public boolean estaEnSuSitio() {
		return estaEnSuSitio;
	}
	
	public void setExiste(boolean existe) {
		this.existe=existe;
	}
	public void setEstaEnSuSitio(boolean estaEnSuSitio) {
		this.estaEnSuSitio=estaEnSuSitio;
	}
}
