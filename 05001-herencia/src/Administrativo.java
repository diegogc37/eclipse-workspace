
public class Administrativo extends Trabajador implements Empleados{

	public Administrativo(String nombre, String apellido) {
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
		this.salario=SALARIO_BASE*1.2;
	}
	
	public void procesarPedidos() {
		System.out.println("Procesando pedidos...");
	}
	
	public void emitirFacturas() {
		System.out.println("Emitiendo factura...");
	}
	
	public void generarNominasEmpleados() {
		System.out.println("Generando nomina...");
	}

	@Override
	public double getSalario() {
		return salario;
	}
}
