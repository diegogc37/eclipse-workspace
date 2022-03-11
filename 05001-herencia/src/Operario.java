
public abstract class Operario extends Trabajador{

	public Operario(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public abstract void mantenerVehiculos();
}
