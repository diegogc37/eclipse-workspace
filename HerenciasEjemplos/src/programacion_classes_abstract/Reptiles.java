package programacion_classes_abstract;

import programacion_main_class.Vertebrado;

public abstract class Reptiles extends Vertebrado{
	
	private boolean esOviparo;

	public Reptiles(boolean esOviparo, int peso, int numeroPatas, int altura) {
		super(peso, numeroPatas, altura);
	}
	
	public boolean esOviparo() {
		return esOviparo();
	}
}
