package Calculadora;

import io.*;
import java.util.Scanner;

public class Main {

	private static Suma suma;
	private static Resta resta;
	private static Multiplicacion multi;
	private static Division divi;
	private static Escritor e = new Escritor("resultados.txt");
	private static Scanner t = new Scanner(System.in);
	private static boolean esNumeroValido = true;
	
	public static void main(String[] args) throws Exception {
		e.resetearFichero();
		int numeroIntentos = 0;
		do {
			System.out.println("¿Cuantas operaciones deseas realizar(1-5)?");
			System.out.println("--------------------------------------------------------------------");
			numeroIntentos =  t.nextInt();
			if(numeroIntentos<1 || numeroIntentos>5) {
				esNumeroValido=false;
				System.err.println("Opcion invalida.");
				System.out.println("Introduce un numero entre 1 y 5.");
				System.out.println("--------------------------------------------------------------------");
			}else {
				menu(numeroIntentos);
				break;
			}
		}while(!esNumeroValido);
		
	}
	
	private static void menu(int numeroIntentos) {
		int contador=0;
		int[] resultados= new int[numeroIntentos];
		do {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Selecciones una opcion: ");
			System.out.println("1.\t Suma");
			System.out.println("2.\t Resta");
			System.out.println("3.\t Multiplicacion");
			System.out.println("4.\t Division");
			System.out.println("--------------------------------------------------------------------");
			int opcion = t.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Sumando1:");
				int sumando1 = t.nextInt();
				System.out.println("Sumando2:");
				int sumando2 = t.nextInt();
				suma = new Suma(sumando1, sumando2);
				int resultadoSuma = suma.suma();
				System.out.println("Resultado:");
				System.out.println(resultadoSuma);
				resultados[contador] = resultadoSuma;
				break;
			case 2:
				System.out.println("Operando1:");
				int operando1 = t.nextInt();
				System.out.println("Operando2:");
				int operando2 = t.nextInt();
				resta = new Resta(operando1, operando2);
				int resultadoResta = resta.resta();
				System.out.println("Resultado:");
				System.out.println(resultadoResta);
				resultados[contador] = resultadoResta;
				break;
			case 3:
				System.out.println("Multiplo1:");
				int multiplo1 = t.nextInt();
				System.out.println("Multiplo2:");
				int multiplo2 = t.nextInt();
				multi = new Multiplicacion(multiplo1, multiplo2);
				int resultadoMulti = multi.multiplicacion();
				System.out.println("Resultado:");
				System.out.println(resultadoMulti);
				resultados[contador] = resultadoMulti;
				break;
			case 4:
				do {
					System.out.println("Dividendo:");
					int dividendo = t.nextInt();
					System.out.println("Divisor:");
					int divisor = t.nextInt();
					if(divisor>=0) {
						System.err.println("No se puede dividir entre 0 o un numero negativo");
						System.out.println("");
						esNumeroValido=false;
					}else {
						divi = new Division(dividendo, divisor);
						int resultadoDivi = (int) divi.division();
						System.out.println("Resultado:");
						System.out.println(resultadoDivi);
						resultados[contador] = resultadoDivi;
						break;
					}
				}while(!esNumeroValido);
				break;
			default:
				break;
			}
			contador++;
		}while(contador<numeroIntentos);
		media(numeroIntentos, resultados);
		for (int i = 0; i < resultados.length; i++) {
			e.escribirLinea(Integer.toString(resultados[i]));
		}
	}

	private static void media(int numeroIntentos, int[] resultados) {
		float media=0;
		for(int i  = 0; i< resultados.length;i++) {
			media=media+resultados[i];
		}
		media=media/numeroIntentos;
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Media aritmetica resultado:");
		System.out.println(media);
		System.out.println("--------------------------------------------------------------------");
	}
}
