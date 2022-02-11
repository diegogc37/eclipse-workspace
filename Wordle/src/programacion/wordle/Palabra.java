package programacion.wordle;

public class Palabra {

	private Letra[] palabra;
	
	public Palabra(String p, int num) {
		palabra = new Letra[num];
		for (int i = 0; i < p.length(); i++) {
			palabra[i]=new Letra(Character.toUpperCase(p.charAt(i)));				
			}
	}
	
	public int length() {
		return palabra.length;
	}

	public char charAt(int i) {
		return palabra[i].getChar();
	}
	
	public void setExiste(int i) {
		palabra[i].setExiste(true);
	}
	public void setEstaEnSuSitio(int i) {
		palabra[i].setEstaEnSuSitio(true);
	}
	
	public boolean existe(int i) {
		return palabra[i].existe();
	}
}
