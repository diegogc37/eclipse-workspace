package io.genericas;

public class Fila extends Datos{
	
	private int[] array= new int[4];
	
	public Fila() {
		super();
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
		}
	}
	
	public String toString() {
		String resultado="";
		for (int i = 0; i < array.length; i++) {
				resultado+=array[i]+" ";			
		}
		return resultado;
	}
}
