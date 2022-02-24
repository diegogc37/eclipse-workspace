package programacion.examen.clases;

import programacion.examen.interfaz.CreadorEnergia;

public class Estadio extends Civil implements CreadorEnergia{

	private char[][] representacion;
	
	public Estadio(int numeroPlantas, int numAforo) {
		super(numeroPlantas,numAforo);
		representacion = new char[4][8];
		inicializarDibujo(representacion);
	}

	public int generarEnergia() {
		int energia=0;
		for (int i = 0; i < representacion.length; i++) {
			for (int j = 0; j < representacion[i].length; j++) {
				if(representacion[i][j]=='X') {
					energia++;
				}
			}
		}
		return energia;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public int getAforo() {
		return numeroAforo;
	}

	public void inicializarDibujo(char[][] m) {
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[0].length;j++) {
				if(i!=0 && i!=1) {
					m[i][j]='X';
				}System.out.print(m[i][j]);
			}System.out.println("");
		}
	}
}
