package programacion.examen.clases;

import programacion.examen.interfaz.CreadorEnergia;

public class Castillo extends Militar implements CreadorEnergia{

private char[][] representacion;
	
	public Castillo(int numeroPlantas, int numAforo,int capacidadDeAtaque, int capacidadDeDefensa) {
		super(numeroPlantas, numAforo, capacidadDeAtaque, capacidadDeDefensa);
		representacion = new char[4][8];
		inicializarDibujo(representacion);
	}

	@Override
	public int getCapacidadDeAtaque() {
		return capacidadDeAtaque;
	}

	@Override
	public int getCapacidadDeDefensa() {
		return capacidadDeDefensa;
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
					if(j%2==0) {
						m[i][j]='X';
					}else if(i>=2) {
						m[i][j]='X';						
					}
				System.out.print(m[i][j]);
			}System.out.println("");
		}
	}

}
