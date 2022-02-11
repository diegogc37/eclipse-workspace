package proyectoMatrices;

import java.util.*;

public class Practica11 {

	private int[][] m = new int[10][3] ;
	private Random r = new Random();
	
	public Practica11() {
		inicializar();
		toString();
		porcentajesMasculinoFemenino();
		porcentajeTrabajan();
		sueldoPromedio();
	}
	
	public void porcentajesMasculinoFemenino() {
		int numeroH=0;
		int numeroM=0;
		for (int i = 0; i < m.length; i++) {
			if(m[i][0]==1) {
				numeroH++;
			}else {
				numeroM++;
			}
		}
		System.out.println(numeroH);
		double porcentajeMasculino = ((double)numeroH/(m.length+1))*100;
		double porcentajeFemenino = ((double)numeroM/(m.length+1))*100;
		System.out.println("El porcentaje de hombres es: "+porcentajeMasculino+"%");
		System.out.println("El porcentaje de mujeres es: "+porcentajeFemenino+"%");
	}
	
	public void porcentajeTrabajan() {
		int numeroHTrabajan=0;
		int numeroFTrabajan=0;
		for (int i = 0; i < m.length; i++) {
			if(m[i][0]==1 && m[i][1]==1) {
				numeroHTrabajan++;
			}else if(m[i][0]==2 && m[i][1]==1) {
				numeroFTrabajan++;
			}
		}
		
		float porcentajeMasculino = ((float)numeroHTrabajan/(m.length+1))*100;
		float porcentajeFemenino = ((float)numeroFTrabajan/(m.length+1))*100;
		System.out.println("El porcentaje de hombres que trabaja es: "+porcentajeMasculino+"%");
		System.out.println("El porcentaje de mujeres que trabaja es: "+porcentajeFemenino+"%");
	}
	
	public void sueldoPromedio() {
		int numeroHTrabajan=0;
		int numeroFTrabajan=0;
		int sueldoH=0;
		int sueldoM=0;
		int sumaSueldoH=0;
		int sumaSueldoM=0;
		for (int i = 0; i < m.length; i++) {
			if(m[i][0]==1 && m[i][1]==1) {
				numeroHTrabajan++;
				sueldoH+=m[i][2];
			}else if(m[i][0]==2 && m[i][1]==1) {
				numeroFTrabajan++;
				sueldoM+=m[i][2];
			}
		}
		if(numeroHTrabajan!=0) {
			sumaSueldoH = sueldoH/numeroHTrabajan;
		}
		if(numeroFTrabajan!=0) {
			sumaSueldoM = sueldoM/numeroFTrabajan;
		}
		System.out.println("El sueldo promedio de  los hombres que trabaja es: "+sumaSueldoH);
		System.out.println("El sueldo promedio de las mujeres que trabaja es: "+sumaSueldoM);
	}
	
	public void inicializar() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				int num = r.nextInt(2)+1;
				int salario = r.nextInt(1401)+600;
				if(j!=2) {
					m[i][j]=num;
				}
				if(m[i][1]==2) {
					m[i][2]=0;
				}else {
					m[i][2]=salario;
				}
				
			}
		}
	}
	
	public String toString() {
		String resultado="";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		return resultado;
	}
	
}
