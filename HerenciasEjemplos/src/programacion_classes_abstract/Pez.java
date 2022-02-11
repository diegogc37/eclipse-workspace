package programacion_classes_abstract;

import programacion_main_class.Vertebrado;

public abstract class Pez extends Vertebrado{

	private int numeroAletas; 
	
	public Pez(int peso, int alturas, int numeroAletas) {
		super(peso,0,alturas);
		this.setNumeroAletas(numeroAletas);
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}
	
}
