
public class Financiero extends Trabajador implements Empleados{

	public Financiero(String nombre, String apellido) {
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
		this.salario=SALARIO_BASE*1.4;
	}
	
	public void aprobarPresupuestoAnual() {
		System.out.println("Aprobando presupuestos...");
	}
	
	public double getSalario() {
		return salario;
	}
}
