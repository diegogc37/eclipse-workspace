package arrays;

import java.util.*;

public class ArraysCadenas {

private String[] array;
	
	public ArraysCadenas(int tamanio) {
		array=new String[tamanio];
	}
	
	public void ordenar() {
		boolean estaOrdenado=false;
		while(!estaOrdenado) {
			estaOrdenado=true;
			for(int i=0;i<array.length-1;i++) {
				if(array[i].compareTo(array[i+1])>0) {
					String aux=array[i+1];
					array[i+1]=array[i];
					array[i]=aux;
					estaOrdenado=false;
				}
			}		
		}
	}
	
	public void inicializar() {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("Introduzca un valor para la posición "+i);
			array[i]=s.nextLine();
		}			
	}
	
	public void incrementar(int posiciones) {
		String[] nuevoArray=new String[array.length+posiciones];
		for(int i=0;i<array.length;i++)
			nuevoArray[i]=array[i];
		array=nuevoArray;
	}
	
	public String toString() {
		String resultado="{ ";
		for(int i=0;i<array.length;i++)
			resultado+=array[i]+" ";
		resultado+="}";
		return resultado;
	}
	
	/**
	 * Da la vuelat a a los valores del array
	 * Ej.: {3,4,5,7} -----> {7,5,4,3} 
	 */
	
	public void invertir() {
		for(int i=0; i < array.length/2;i++) {
			String aux = array[(array.length-1)-i];
			array[(array.length-1)-i] = array[i];
			array[i]=aux;
		}
	} 
	
	/**
	 * Ordena los valores del array en sentido inverso
	 * 
	 */
	
	public void ordenarInverso() {
		boolean estaOrdenado=false;
		while(!estaOrdenado) {
			estaOrdenado=true;
			for(int i=0;i<array.length-1;i++) {
				if(array[i].compareTo(array[i+1])>0) {
					String aux=array[i+1];
					array[i+1]=array[i];
					array[i]=aux;
					estaOrdenado=false;
				}
			}		
		}
		invertir();
	}
	
}
