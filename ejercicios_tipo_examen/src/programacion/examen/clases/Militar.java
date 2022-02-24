package programacion.examen.clases;

public abstract class Militar extends Construccion{

	protected int capacidadDeAtaque;
	protected int capacidadDeDefensa;
	
	public Militar(int numeroPlantas, int numeroAforo, int capacidadDeAtaque, int capacidadDeDefensa) {
		super(numeroPlantas, numeroAforo);
		this.capacidadDeAtaque=capacidadDeAtaque;
		this.capacidadDeDefensa=capacidadDeDefensa;
	}
	
	public abstract int getCapacidadDeAtaque();
	public abstract int getCapacidadDeDefensa();
	
}
