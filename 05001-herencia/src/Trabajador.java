
public abstract class Trabajador{
	
	private static int CODIGO_EMPLEADO=0;
	public static final int SALARIO_BASE=900;
	private String nombre, apellido;
	private int codigoDeEmpleado;
	protected double salario;
	protected boolean estaTrabajando=false;
	
	
	public Trabajador(String nombre, String apellido) {
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		codigoDeEmpleado=CODIGO_EMPLEADO;
		CODIGO_EMPLEADO++;
	}
}
