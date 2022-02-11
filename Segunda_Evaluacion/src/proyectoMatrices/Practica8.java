package proyectoMatrices;

import java.util.*;

public class Practica8 {

	private Scanner t = new Scanner(System.in); 
	private String[][] nombresGolosinas = {
			 
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
 
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
 
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
 
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"} };
	private double[][] precio = {
 
			{1.1, 0.8, 1.5, 0.9},
 
			{1.8, 1, 1.2, 1},
 
			{1.8, 1.3, 1.2, 0.8},
 
			{1.5, 1.1, 1.1, 1.1}
 
		};
	private int[][] numeroExistencias = {
			 
            {5, 5, 5, 5},
 
            {5, 5, 5, 5},
 
            {5, 5, 5, 5},
 
            {5, 5, 5, 5} };
	
	public boolean ApagarMaquina= false;
	
	public Practica8() {
		do {
			System.out.println("> Elige una opcion: ");
			System.out.println("	> (A) Pedir Golosina");
			System.out.println("	> (B) Mostrar Golosinas");
			System.out.println("	> (C) Rellenar Golosina");
			System.out.println("	> (D) Apagar maquina");
			System.out.print("> ");
			String opcion = t.nextLine();
			System.out.println("");
			switch(opcion) {
			case "A":
				System.out.println("> Introduce la posicion del producto: ");
				System.out.print("> ");
				String numProd = t.nextLine();
				System.out.println("");
				int fila = Character.getNumericValue(numProd.charAt(0));
				int columna = Character.getNumericValue(numProd.charAt(1));
				pedirGolosina(fila, columna);
				System.out.println("");
				break;
			case "B":
				mostrarGolosina();
				System.out.println("");
				break;
			case "C":
				System.out.println("> Introduce la contraseña de técnico: ");
				System.out.print("> ");
				String contraseña = t.nextLine();
				System.out.println("");
				if(contraseña.equals("MaquinaExpendedora2017")) {
					System.out.println("> Introduce la posicion de la golosina: ");
					System.out.print("> ");
					String posicion = t.nextLine();
					System.out.println("");
					System.out.println("> Introduce la cantidad a añadir: ");
					System.out.print("> ");
					int cantidad = t.nextInt();
					System.out.println("");
					int f = Character.getNumericValue(posicion.charAt(0));
					int c = Character.getNumericValue(posicion.charAt(1));
					int cantidadActual = numeroExistencias[f][c];
					int cantidadFinal = cantidadActual+cantidad;
					numeroExistencias[f][c] = cantidadFinal;
				}
				System.out.println("");
				break;
			case "D":
				System.out.println("Desconcectando la maquina............");
				setApagarMaquina(true);
				break;
			default:
				System.out.println("Lo siento, no te he entiendo");
				break;
			}
		}while(!ApagarMaquina);
	}
	
	
	
	public void setApagarMaquina(boolean apagarMaquina) {
		ApagarMaquina = apagarMaquina;
	}

	public String getGolosina(int fila, int columna) {
		System.out.println(nombresGolosinas[fila][columna]);
		return nombresGolosinas[fila][columna];
	}
	
	public String pedirGolosina(int fila, int columna) {
		return getGolosina(fila, columna);
	}
	
	public void mostrarGolosina() {
		for (int i = 0; i < nombresGolosinas.length; i++) {
			for (int j = 0; j < nombresGolosinas.length; j++) {
				System.out.println("> Codigo de producto : ["+i+"]["+j+"], Nombre producto: "+nombresGolosinas[i][j]+", Precio producto: "+ precio[i][j]);
			}
		}
	}
	
	public void restarProducto(int fila, int columna) {
		if (numeroExistencias[fila][columna]>0) {
			int vvalor = numeroExistencias[fila][columna];
			numeroExistencias[fila][columna]= vvalor-1;
		}else {
			System.out.println("El numero de existencias es igual a 0");
		}
	}
	
	public void inicializar() {
		for (int i = 0; i < numeroExistencias.length; i++) {
			for (int j = 0; j < numeroExistencias[0].length; j++) {
				numeroExistencias[i][j]=5;	
			}
		}
	}
	
}
