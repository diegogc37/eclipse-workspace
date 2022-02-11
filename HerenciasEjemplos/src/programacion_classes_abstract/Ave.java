package programacion_classes_abstract;

import programacion_main_class.Vertebrado;

public abstract class Ave extends Vertebrado{

	private final int numeroAlas = 2;
	
	public Ave(int peso, int altura) {
		super(peso, 2, altura);
	}
	
	public int getNumeroAlas() {
		return numeroAlas;
	}
}
