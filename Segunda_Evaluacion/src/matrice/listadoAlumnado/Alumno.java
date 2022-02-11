package matrice.listadoAlumnado;
/**
 * Clase que contiene alumno o alumna
 * @author diegogc
 *
 */
public class Alumno {

	private String nombre;
	private String apellidos;
	private final String nif;
	
	public Alumno(String nombre, String apellidos, String nif) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nif=nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}
	
	public String toString() {
		String resultado="";
		resultado+=nombre+"		"+apellidos+"		"+nif;
		return resultado;
	}
}
