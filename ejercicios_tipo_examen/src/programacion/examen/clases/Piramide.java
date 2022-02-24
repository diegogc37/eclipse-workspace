package programacion.examen.clases;

import programacion.examen.interfaz.CreadorEnergia;

public class Piramide extends Militar implements CreadorEnergia{

	private char[][] representacion;
	
	public Piramide(int numeroPlantas, int numAforo,int capacidadDeAtaque, int capacidadDeDefensa) {
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
				switch (i) {
				case 0:	
					if(j==3 || j ==4) {
						m[0][j]='X';
					}
					break;
				case 1:
					if(j==2 || j==3 || j ==4 || j==5) {
						m[1][j]='X';
					}
					break;
				case 2:
					if(j!=0 && j !=7) {
						m[2][j]='X';
					}
					break;
				case 3:
						m[3][j]='X';
					break;
				default:
					break;
				}
				System.out.print(m[i][j]);
			}System.out.println("");
		}
	}

}
