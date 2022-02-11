package matrice.listadoAlumnado;

import java.util.Scanner;

/**
 * Aplicacion que mantiene un listado de alumnos con el siguiente formato
 * {[nombre][apellidos][dni]}
 * 
 * La plicacion permite añadir alumnos y alumnas y borralos o borrarlas
 * 
 * @author diegogc
 *
 */
public class ListadoDeAlumnos {

	private Alumno[] listado;
	
	public ListadoDeAlumnos() {
		System.out.println("Ejecutando "+this.getClass());
		
		listado=new Alumno[10];
		
		System.out.println("Finalizando "+this.getClass());
	}
	
	/**
	 * Metodo que imprime un menu y ejecuta distintos metodos 
	 * en funcion de la opcion seleccionada
	 */
	public void mostrarMenu() {
		Scanner t = new Scanner(System.in);
		int opcion = 0;
		do {
		System.out.println("[Listado de alumnos]");
		System.out.println("\t1) Añadir alumno\\a");
		System.out.println("\t2) Borrar alumno\\a");
		System.out.println("\t3) Imprimir listado\\a");
		System.out.println("***");
		System.out.println("\t0) Salir");
		opcion =Integer.parseInt(t.nextLine());
		switch(opcion){
		case 1:
			System.out.println("Introduzca el nombre del alumno: ");
			String nombre= t.nextLine();
			System.out.println("Introduzca los apellidos del alumno: ");
			String apellidos= t.nextLine();
			System.out.println("Introduzca el nif del alumno: ");
			String nif= t.nextLine();
			addAlumno(nombre, apellidos, nif);
			/*
			 * Alumno a = new Alumno(nombre, apellidos, nif);
			 * addAlumno(a);
			 */
			break;
		case 2:
			System.out.println("Introduzca el nombre del alumno: ");
			int alumnoBorrar = Integer.parseInt(t.nextLine());
			borrarAlumno(alumnoBorrar);
			break;
		case 3:
			break;
		default:
			break;
		}
		}while(opcion!=0);
	}
	
	public void addAlumno(Alumno a) {
		int posicionInsertar=getNumeroAlumnos();
		listado[posicionInsertar]=a;
	}
	
	public void addAlumno(String nombre, String apellidos, String nif) {
		Alumno a = new Alumno(nombre, apellidos, nif);
		addAlumno(a);
	}
	
	public int getNumeroAlumnos() {
		int numeroAlumnos=0;
		for (int i = 0; i < listado.length; i++)
			if(listado[i]!=null)
				numeroAlumnos++;
		return numeroAlumnos;
	}
	
	public void recorrerListado() {
		
	}
	
	public String toString() {
		String resultado="";
		for (int i = 0; i < listado.length; i++) {
			if(listado[i]!= null)
				resultado+=Integer.toString(i)+"\t"+listado[i]+"\n";
		}
		return resultado;
	}
	
	public void borrarAlumno(int a) {
		listado[a]=null;
	}
}
