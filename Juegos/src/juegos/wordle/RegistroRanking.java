package juegos.wordle;

public class RegistroRanking {

	private String nombre;
	private int partidasGanadas;
	
	public RegistroRanking(String nombre, int partidasGanadas) {
		this.nombre=nombre;
		this.partidasGanadas=partidasGanadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPartidasGanadas() {
		return partidasGanadas;
	}
}
