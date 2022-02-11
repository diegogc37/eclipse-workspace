import java.util.*;

public class EjerciciosVariopintos {

	public EjerciciosVariopintos(){
		Scanner t = new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("[Selleccione una opción]");
			System.out.println("\t1 1)\t1 Ejercicio 1: moda");
			System.out.println("\t2 2)\t2 Ejercicio 2: máximo");
			System.out.println("\t3 3)\t3 Ejercicio 3: tabla de multiplicar");
			System.out.println("\t4 4)\t4 Ejercicio 4: cadena de mayúsculas");
			System.out.println("\t5 5)\t5 Ejercicio 5: cambiar filas");
			System.out.println("***");
			System.out.println("\t0 0)\t0 Salir");
			opcion = t.nextInt();
			switch (opcion) {
			case 1:
				int[] arrayej1 = {3,4,4,5,5,5,6,7,1,4,9,0};
				ejercicio1(arrayej1);
				break;
			case 2:
				System.out.println(ejercicio2());
				break;
			case 3:
				ejercicio3(2);
				break;
			case 4:
				System.out.print("“");
				System.out.print(ejercicio4("Esto hay que convertirlo"));
				System.out.println("”");
				break;
			case 5:
				int[][] arrayej5 = {{1,3,5}, {2,4}, {0,9,8}};
				ejercicio5(arrayej5);
				break;
			default:
				break;
			}
		}while(opcion!=0);
	}
	
	public void ejercicio1(int[] array) {
		int numeroModa=0;
		int repeticionesM=0;
		int repeticiones=0;
			for (int i = 0; i < array.length; i++) {
				repeticiones=0;
				for (int j = 1; j < array.length; j++) {
					if(array[i]==array[j] && repeticiones>=repeticionesM) {
						repeticiones++;
						repeticionesM=repeticiones;
						numeroModa=array[i];
					}
				}
			}
		System.out.println("La moda es "+numeroModa+", que aparece "+repeticionesM+" veces.");
	}
	
	public String ejercicio2() {
		int[][] array = { {1,3,5}, {2,4}, {0,9,8} };
		String resultado="El mayor número es ";
		int maxValor=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j]>maxValor) {
					maxValor=array[i][j];
				}
			}
		}
		resultado+=maxValor;
		return resultado;
	}
	
	public int[][] ejercicio3(int numero) {
		int[][] matrizResultado= new int[10][3];
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				if(j==0) {
					matrizResultado[i][0]=numero;
					System.out.print("["+matrizResultado[i][0]+"]");
				}else if (j==1) {
					matrizResultado[i][1]=i+1;
					System.out.print("["+matrizResultado[i][1]+"]");
				}else {
					matrizResultado[i][2]=numero*(i+1);
					System.out.print("["+matrizResultado[i][2]+"]");
				}
			}System.out.println("");
		}
		return matrizResultado;
	}
	
	public char[] ejercicio4(String parametro) {
		char[] cadenaDevuelta = new char[parametro.length()]; 
		for (int i = 0; i < parametro.length(); i++) {
			cadenaDevuelta[i] = Character.toUpperCase(parametro.charAt(i));
		}
		return cadenaDevuelta;
	}
	
	public void ejercicio5(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(i==0) {
					int aux = array[i][j];
					array[i][j]=array[array.length-1][j];
					array[array.length-1][j]=aux;
				}
			}
		}
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print("{");
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.print(array[i][j]+",");
			}
			System.out.print(array[i][array[i].length-1]+"}");
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		EjerciciosVariopintos ejVp = new EjerciciosVariopintos();
	}

}
