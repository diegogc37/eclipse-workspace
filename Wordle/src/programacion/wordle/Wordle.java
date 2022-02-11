package programacion.wordle;
import java.util.Scanner;

public class Wordle {

	private Scanner t = new Scanner(System.in);
	
	public Wordle(String palabraAdivinar) {
		int intentos = palabraAdivinar.length();
		int contadorIntentos = 0;
		String palabra = "";
		do {
			System.out.println("Intento "+contadorIntentos+" de "+intentos+": ");
			palabra = t.nextLine();	
			if(palabra.length()<intentos && palabra.length()>intentos) {
				System.out.println("Se espera una palabra de "+intentos+" letras.");
				break;
			}else {
				Palabra p = new Palabra(palabra, palabraAdivinar.length());
				Palabra pA = new Palabra(palabraAdivinar, palabraAdivinar.length());
				comparar(p, pA);
				if(completado(p)) {
					System.out.println("Enhorabuena has acertado la palabra.");
					contadorIntentos=intentos+1;
					break;
				}
			}
		}while(contadorIntentos<=intentos);	
		t.close();
	}
	
	public void comparar(Palabra p, Palabra pa) {
		for (int i = 0; i < p.length(); i++) {
			for (int j = 0; j < pa.length(); j++) {
				if(p.charAt(i)==pa.charAt(i)) {
					System.out.print("*");
					p.setExiste(i);
					p.setEstaEnSuSitio(i);
				}else if(p.charAt(i)==pa.charAt(i)) {
					System.out.print("!");
					p.setExiste(i);
				}
			}
		}
	}
	
	public boolean completado(Palabra p) {
		boolean completo=false;
		int palabraCorrecta=p.length();
		int correctas = 0;
		for (int i = 0; i < p.length(); i++) {
			if(p.existe(i)) {
				correctas++;
			}
		}
		if(correctas==palabraCorrecta) {
			completo = true;
		}
		return completo;
	}
	
}
