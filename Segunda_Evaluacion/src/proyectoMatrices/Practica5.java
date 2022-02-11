package proyectoMatrices;

import java.util.*;

public class Practica5 {

	private Scanner t = new Scanner(System.in);
	
	 /*Tipos actuales de pokemon*/
    public static String[] tiposPokemon = {"ACERO", "AGUA", "BICHO", "DRAGÓN", "ELÉCTRICO", "FANTASMA", "FUEGO",
                                            "HADA","HIELO","LUCHA","NORMAL", "PLANTA", "PSÍQUICO",
                                            "ROCA","SINIESTRO", "TIERRA", "VENENO","VOLADOR"};
     
    /*Mensaje segun la eficacia*/
    public static String[] MENSAJES_EFICACIAS = {"NO ES MUY EFICAZ", "NEUTRO", "ES MUY EFICAZ", "NO AFECTA",
                                                 "DOBLEMENTE EFICAZ", "DOBLEMENTE NO MUY EFICAZ"};
    
    public static int[][] tablaTipos = {{5,5,1,1,5,1,5,2,2,1,1,1,1,2,1,1,1,1},
    									{1,5,1,5,1,1,2,1,1,1,1,5,1,2,1,2,1,1}, 
    									{5,1,1,1,1,5,5,5,1,5,1,2,2,1,2,1,5,5}, 
    									{5,1,1,2,1,1,1,0,1,1,1,1,1,1,1,1,1,1}, 
    									{1,2,1,5,5,1,1,1,1,1,1,5,1,1,1,0,1,2}, 
    									{1,1,1,1,1,2,1,1,1,1,0,1,2,1,5,1,1,1}, 
    									{2,5,2,5,1,1,5,1,2,1,1,2,1,5,1,1,1,1}, 
    									{5,1,1,2,1,1,5,1,1,2,1,1,1,1,2,1,5,1}, 
    									{5,5,1,2,1,1,5,1,5,1,1,2,1,1,1,2,1,2}, 
    									{2,1,5,1,1,0,1,5,2,1,2,1,5,2,2,1,5,5}, 
    									{5,1,1,1,1,0,1,1,1,1,1,1,1,5,1,1,1,1}, 
    									{5,2,5,5,1,1,5,1,1,1,1,5,1,2,1,2,5,5}, 
    									{5,1,1,1,1,1,1,1,1,2,1,1,5,1,0,1,2,1}, 
    									{5,1,2,1,1,1,2,1,2,5,1,1,1,1,1,5,1,2}, 
    									{1,1,1,1,1,2,1,5,1,5,1,1,2,1,5,1,1,1}, 
    									{2,1,5,1,2,1,2,1,1,1,1,5,1,2,1,1,2,0},
    									{0,1,1,1,1,5,1,2,1,1,1,2,1,5,1,5,5,1},
    									{5,1,2,1,5,1,1,1,1,2,1,2,1,5,1,1,1,1}
    									};
    
  	public void mostrarTipos() {
  		for (int i = 0; i < tiposPokemon.length; i++) {
			System.out.println(i+1+"."+tiposPokemon[i]);
		}
  	}
  	
  	public void mostrarDebilidades() {
  		System.out.println("Indique si el pokemon es monotipo o no: ");
  		System.out.println("(1 para monotipo o 2 para doble tipo)");
  		System.out.print("> ");
  		int opcion = t.nextInt(); 
  		System.out.println("");
  		switch (opcion) {
  		case 1:
  			System.out.println("Introduza el tipo de su pokemon: ");
  			System.out.print("> ");
  			String tipo = t.nextLine();
  			System.out.println("");
  			getDebilidades(tipo);
  			break;
  		case 2:
  			System.out.println("Introduza el tipo primario de su pokemon: ");
  			System.out.print("> ");
  			String tipo1 = t.nextLine();
  			System.out.println("");
  			System.out.println("Introduza el tipo secundario de su pokemon: ");
  			System.out.print("> ");
  			String tipo2 = t.nextLine();
  			System.out.println("");
  			getDebilidadesDual(tipo1, tipo2);
  			break;
  		default: 
  			break;
  		}
  	}
  	
  	public void getDebilidadesDual(String tipo1, String tipo2) {
  		ArrayList<String> debilidadesTipo1 = null;
  		ArrayList<String> debilidadesTipo2 = null;
  		int posicionDefensor1=0;
  		for (int i = 0; i < MENSAJES_EFICACIAS.length; i++) {
			if(tiposPokemon[i].equals(tipo1)) {
				posicionDefensor1=i;
			}
		}
  		for (int j = 0; j < MENSAJES_EFICACIAS.length; j++) {
			if(tablaTipos[j][posicionDefensor1]==2) {
				debilidadesTipo1.add(tiposPokemon[j]+"\n");
			}
		}
  		int posicionDefensor2=0;
  		for (int i = 0; i < MENSAJES_EFICACIAS.length; i++) {
			if(tiposPokemon[i].equals(tipo1)) {
				posicionDefensor2=i;
			}
		}
  		for (int j = 0; j < MENSAJES_EFICACIAS.length; j++) {
			if(tablaTipos[j][posicionDefensor2]==2) {
				debilidadesTipo2.add(tiposPokemon[j]+"\n");
			}
		}
	}

	public void getDebilidades(String tipo) {
		ArrayList<String> debilidades = null;
		int posicionDefensor=0;
  		for (int i = 0; i < MENSAJES_EFICACIAS.length; i++) {
			if(tiposPokemon[i].equals(tipo)) {
				posicionDefensor=i;
			}
		}
  		for (int j = 0; j < MENSAJES_EFICACIAS.length; j++) {
			if(tablaTipos[j][posicionDefensor]==2) {
				debilidades.add(tiposPokemon[j]+"\n");
			}
		}
  	}
}