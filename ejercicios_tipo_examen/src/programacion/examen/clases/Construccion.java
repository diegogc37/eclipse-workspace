package programacion.examen.clases;

public abstract class Construccion {

	protected int numeroPlantas ,numeroAforo;
	
	public Construccion(int numeroPlantas, int numeroAforo) {
		this.numeroPlantas=numeroPlantas;
		this.numeroAforo=numeroAforo;
	}
	public abstract void inicializarDibujo(char[][] m);
	public abstract int getNumeroPlantas();
	public abstract int getAforo();
}
