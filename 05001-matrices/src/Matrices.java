
import java.util.*;

public class Matrices {
	
	private int[][] matrizEj1;
	private String[][] matrizEj2;
	private Random r = new Random();
	private Scanner t = new Scanner(System.in);
	
	public Matrices() {
		iniciarMenu();
		t.close();
	}
	
	private void iniciarMenu() {
		int opcion=0;
		do {
			System.out.println("------------------------------------------------");
			System.out.println("Elije una opcion: ");
			System.out.println("\t 1) Ejercicio 1.");
			System.out.println("\t 2) Ejercicio 2.");
			System.out.println("***");
			System.out.println("\t 0) Salir.");
			System.out.println("------------------------------------------------");
			opcion = t.nextInt();
			switch(opcion) {
			case 1:
				llamarEjercicio1();
				break;
			case 2:
				t.nextLine();
				llamarEjercicio2();
				break;
			case 0:
				System.out.println("Desconectando sistema.....");
				break;
			default:
				break;
			}
		}while(opcion!=0);
	}

	public void llamarEjercicio1() {
		matrizEj1 = new int[5][5];
		int suma = 0;
		for (int i = 0; i < matrizEj1.length; i++) {
			for (int j = 0; j < matrizEj1[i].length; j++) {
				int num=r.nextInt(11);
				if (num%2!=0)
					suma+=num;
				matrizEj1[i][j]=num;
				System.out.print(matrizEj1[i][j]+" ");
			}System.out.println("");
		}
		System.out.println(suma);
	}
	
	public void llamarEjercicio2() {
		matrizEj2= new String[4][4];
		rellenar(matrizEj2);
		String resultado = "";
		for (int i = 0; i < matrizEj2.length; i++) {
			for (int j = 0; j < matrizEj2[i].length; j++) {
				System.out.print(matrizEj2[i][j]+ " ");
				if(matrizEj2[i][j].length()>5) {
					resultado+=matrizEj2[i][j];
					if(i!=matrizEj2.length-1 && j!=matrizEj2.length-1)
						resultado+=", ";
				}
			}System.out.println("");
		}
		resultado+=".";
		System.out.println(resultado);
	}
	
	public void rellenar(String[][] m) {
		String linea="";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Introduce la cadena de la posicion "+i+" y "+j+": ");
				linea = t.nextLine();
				matrizEj2[i][j]=linea;
			}
		}
	}
	
	public static void main(String[] args) {
		Matrices m = new Matrices();
	}

}
