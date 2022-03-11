package io.juegos;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lector<T> {
	
	private T unObjeto;
	private String nombreFichero;
	
	public Lector(String nombreFichero){
		this.nombreFichero=nombreFichero;
	}
	
	
	public ArrayList<T> leer() {
		ArrayList<T> lista=new ArrayList<T>();
		String rutaActual=System.getProperty("user.dir");
		String rutaLectura=rutaActual+"/data/"+nombreFichero;
		Path ruta = Paths.get(rutaLectura);		
		T unObjeto;		
		try {
			
			BufferedReader entrada=Files.newBufferedReader(ruta, Charset.forName("ISO-8859-1"));
			unObjeto = (T) entrada.readLine();
			while(unObjeto!=null) {
				lista.add(unObjeto);
				unObjeto=(T)entrada.readLine();
			}
			entrada.close();
		} catch(FileNotFoundException e) { 
			System.err.println("Fichero no encontrado");
		} catch(EOFException eofe) {
			System.out.println("Fichero finalizado");
		} catch(IOException ioe) { 
			System.out.println("Error leyendo el fichero");
		}
		return lista;
	}

}