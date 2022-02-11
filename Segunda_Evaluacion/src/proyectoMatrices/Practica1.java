package proyectoMatrices;

public class Practica1 {

	private int[][] c= new int[3][3];
	
	public Practica1() {
		int numero=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=numero;
				numero++;
			}
		}
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<3;i++) {
			for (int j = 0; j < 3; j++) {
				resultado+=c[i][j]+" ";
			}
		resultado+="\n";
		}
		return resultado;
	}
}
