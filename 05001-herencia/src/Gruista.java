
public class Gruista extends Operario implements Empleados{

	public Gruista(String nombre, String apellido) {
		super(nombre, apellido);
		setSalario();
	}

	@Override
	public void mantenerVehiculos() {
		System.out.println("Mantenimiento de los vehiculos.");
	}
	
	public void conducirGruas() {
		System.out.println("Conducion feliz mi grua.");
	}

	public void fichar() {
		if(estaTrabajando==true) {
			System.out.println("Estoy saliendo del trabajo.");
			estaTrabajando=false;
		}else {
			System.out.println("Estoy entrando al trabajo.");
			estaTrabajando=true;
		}
	}
	
	public void setSalario() {
		this.salario=SALARIO_BASE*1.1;
	}
	
	public double getSalario() {
		return salario;
	}
}
