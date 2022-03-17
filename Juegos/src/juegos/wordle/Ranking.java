package juegos.wordle;

import java.util.ArrayList;

import io.juegos.Lector;

public class Ranking {
	
	private ArrayList<RegistroRanking> ranking;
	
	public void leerRanking(String nombreFichero) {
		Lector lector = new Lector(nombreFichero);
		ArrayList<String> cadenas=lector.leer();
	}
	
	public String toString() {
		String resultado="";
		for (int i = 0; i < ranking.size(); i++) {
			resultado+=ranking.get(i).getNombre()+" "+ranking.get(i).getPartidasGanadas()+"\n";
		}
		return resultado;
	}
}
