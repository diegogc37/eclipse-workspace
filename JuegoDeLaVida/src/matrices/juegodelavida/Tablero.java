package matrices.juegodelavida;

import java.util.Random;

public class Tablero {

	private Celda[][] tableroActual;
	private Celda[][] tableroSiguiente;
	
	public Tablero(int dimension) {
		tableroActual = new Celda[dimension][dimension];
		tableroSiguiente = new Celda[dimension][dimension];
		rellenar(70);
	}
	
	public void evolucionar(){
		
	}
	
	public void rellenar(int porcentaje) {
		Random r= new Random();
		for (int i = 0; i < tableroActual.length; i++) {
			for (int j = 0; j < tableroActual[0].length; j++) {
				int probabilidades=r.nextInt()%100;
				if(probabilidades<porcentaje) {
					tableroActual[i][j]=new Celda(true);
				}
				else
					tableroActual[i][j]=new Celda(false);
			}
		}
		
	}
	
	public String toString() {
		String resultado="";
		for (int i = 0; i < tableroActual.length; i++) {
			for (int j = 0; j < tableroActual[0].length; j++) {
				resultado+=tableroActual[i][j].toString();
			} resultado+="\n";
		}
		return resultado;
	}
}
