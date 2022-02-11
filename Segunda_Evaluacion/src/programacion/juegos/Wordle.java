package programacion.juegos;

import java.util.Scanner;

public class Wordle {

	private String secreto;
	
	
	public Wordle(String secreto) {
		this.secreto=secreto;
		int copntraseña=0;
		//while() {
			
		//}
	}
	
	public String pedirConjetura() {
		System.out.println("Intrduce uan palabra de cinco letras: ");
		String palabra;
		Scanner t = new Scanner(System.in);
		palabra = t.nextLine();
		t.close();
		return palabra;
	}
	
	public void compararPalabras(String secreto, String conjetura) {
		
	}
	
}
