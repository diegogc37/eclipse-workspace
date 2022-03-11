package juegos.wordle;

import java.util.*;
import io.juegos.*;

/**
 * 
 * @author guillermogb
 *
 */
public class Wordle {
	
	private String secreto;
	
	/*
	 * Al comenzar la partida pedirá por teclado un nombre
	 * de jugador.
	 * 
	 * Cuando termine la partida, escribirá en un fichero de texto
	 * llamado resultados.dat el resultado con el siguiente formato:
	 * 
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 */
	public Wordle(String secreto) {
		/*
		 * Haremos que la palabra "secreto" sea leída
		 * del fichero palabras5letras.dat
		 * 
		 * Crearemos una clase que herede de LectorLineas
		 * y que compruebe que cada palabra que incluya en el
		 * ArrayList de las líneas creadas solo las palabras
		 * de longitud=5.
		 */
		System.out.println("Introduzca el nombre del jugador: ");
		System.out.print("\t > ");
		Scanner t = new Scanner(System.in);
		String nombreJugador=t.nextLine();
		String resultado="";
		this.secreto=secreto.toUpperCase();
		int contador=1;
		boolean victoria=false;
		while(contador<secreto.length()+1) {
			try {
				System.out.println("** Intento "+contador+" de "+secreto.length());
				Palabra conjetura=null;
				conjetura=pedirConjetura();
				comprobarConjetura(conjetura);
				System.out.println(conjetura);
				if(esCorrecta(conjetura)) {
					System.out.println("Has ganado la partida en el intento "+contador+" de "+secreto.length());
					victoria=true;
					break;
				}
				if(!esCorrecta(conjetura)&&contador>=secreto.length()) {
					System.out.println("Has perdido la partida.");
					victoria=false;
				}
					
				contador++;
				} 
			catch (Exception e) {
				System.err.println(e.getLocalizedMessage());
			}			
		}
		System.out.println("La palabra secreta era "+secreto+".");
		if(victoria)
			resultado=nombreJugador+"#"+secreto+"#"+contador+"#VICTORIA";
		else
			resultado=nombreJugador+"#"+secreto+"#"+contador+"#DERROTA";
		Escritor<String> e = new Escritor<>("wordleEscritura/resultados.dat");
		Lector<String> l = new Lector<>("wordleEscritura/resultados.dat");
		e.escribir(resultado);
		ArrayList<String> arrayJugadores=l.leer();
		System.out.println();
		for (int i = 0; i < arrayJugadores.size(); i++) {
			System.out.println(arrayJugadores.get(i));
		}System.out.println("");
	}
	
	public Palabra pedirConjetura() throws Exception {
		String palabra;
		Palabra p;
		System.out.println("Introduce una palabra de "+secreto.length()+" letras:");
		Scanner s=new Scanner(System.in);
		palabra=s.nextLine().toUpperCase();
			if(palabra.length()!=secreto.length())
				throw new Exception ("Ambas palabras deben tener la misma longitud (se obtuvo "+palabra.length()+" y se esperaba "+secreto.length()+")");
		p=new Palabra(palabra);		
		return p;
	}
	public void comprobarConjetura(Palabra conjetura) {
		for(int i=0;i<secreto.length();i++) {
			estaEnPosicion(conjetura, i);
			contiene(conjetura, secreto.charAt(i));
		}
	}
	
	public void estaEnPosicion(Palabra conjetura, int posicion) {
		if(conjetura.getLetraAt(posicion).getCaracter()==secreto.charAt(posicion))
			conjetura.getLetraAt(posicion).setPosicionCorrecta(true);
		else
			conjetura.getLetraAt(posicion).setPosicionCorrecta(false);
	}
	
	public void contiene(Palabra conjetura, char c) {
		for(int i=0;i<conjetura.length();i++)
			if(conjetura.getLetraAt(i).getCaracter()==c)
				conjetura.getLetraAt(i).setExiste(true);
			else
				conjetura.getLetraAt(i).setExiste(false);
	}
	
	public boolean esCorrecta(Palabra conjetura) {
		for(int i=0;i<conjetura.length();i++)
			if(conjetura.getLetraAt(i).getCaracter()!=secreto.charAt(i))
				return false;
		return true;
	}
	
}