package pruebas.interfaces;

public interface Periferico {

	public void setNombre(String nombre);
	
	public void setTipo(String tipo);
	
	public String getNombre();
	
	public String getTipo();
	
	public void transmitirInformacion(String informacion, Periferico p);

	//public void recibirInformacion(String informacion);
	
}
