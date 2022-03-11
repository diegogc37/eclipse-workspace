
public class Gestor extends Trabajador implements Empleados{

	public Gestor(String nombre, String apellido) {
		super(nombre, apellido);
		setSalario();
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
		this.salario=SALARIO_BASE*1.3;
	}
	
	public void revisarCuentas() {
		System.out.println("Revisando cuentas...");
	}
	
	public double getSalario() {
		return salario;
	}
}
