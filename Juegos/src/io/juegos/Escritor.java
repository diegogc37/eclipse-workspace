package io.juegos;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Escritor<T> {
	
	private String nombreFichero;
	
	public Escritor(String nombreFichero) {
		this.nombreFichero=nombreFichero;
	}
	
	public void escribir(T unObjeto) {
		//Esta línea contiene la ruta en la que se está ejecutando java
		String rutaActual=System.getProperty("user.dir");
		//Y esta el subdirectorio en el que se encuentra el fichero de datos
		String rutaEscritura=rutaActual+"/data/"+nombreFichero;
		//El objeto "ruta" referencia a la ruta completa del fichero
		Path ruta = Paths.get(rutaEscritura);
		try {
			BufferedWriter bw=Files.newBufferedWriter(ruta,
					Charset.forName("ISO-8859-1"),
					StandardOpenOption.APPEND, StandardOpenOption.WRITE);
			bw.write(unObjeto.toString());
			bw.newLine();
			bw.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}

}