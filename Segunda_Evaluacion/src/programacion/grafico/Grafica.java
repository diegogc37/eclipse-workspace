package programacion.grafico;
/**
 * Matriz de caracteres 100*100 que dibuje la grafica
 * x=x^2 para x>=0 (cada punto se representara con un *)
 * @author diegogc
 *
 */
public class Grafica {

	private char[][] lienzo;
	
	public Grafica() {
		lienzo = new char[100][100];
		rellenarLienzo();
	}

	public void rellenarLienzo() {
		for (int i = 0; i < lienzo.length; i++) {
			for (int j = 0; j < lienzo[i].length; j++) {
				if(i==Math.pow(j, 2))//Equivale a j*j
					lienzo[lienzo.length-1-i][j]='*';
			}
		}
	}
	
	
	
}
