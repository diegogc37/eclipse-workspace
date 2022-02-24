package pruebas.interfaces;

public class Pantalla implements Periferico{

	public String nombre, tipo, informacion;
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public void setTipo(String tipo) {
		this.tipo=tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void transmitirInformacion(String informacion, Periferico p) {
		//p.recibirInformacion(informacion);		
		System.out.println("Se envia "+informacion+" al periferico "+p);
	}
	
/*
	public void recibirInformacion(String informacion) {
		this.informacion=informacion;
	}
*/
}
