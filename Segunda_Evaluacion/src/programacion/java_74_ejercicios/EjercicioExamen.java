package programacion.java_74_ejercicios;

public class EjercicioExamen {

	private int[] array = {1,4,4,3,0,4,0,7,2,1};
	
	public EjercicioExamen() {
		moda(array);
	}
	
	public void moda(int[] array) {
		int valorRepetido=0;
		int repetido1Valor=0;
		for (int i = 0; i < array.length; i++) {
			int repetidos=0;
			for (int j = 0; j < array.length; j++) {
				if(array[i]==array[j] && array[i]==1) {
					repetido1Valor++;
					repetidos++;
				}else if(array[i]==array[j] && array[i]!=1) {
					repetidos++;
				}
			}if(repetidos>repetido1Valor) {
				valorRepetido=array[i];
			}
		}System.out.println(valorRepetido);
	}
}
