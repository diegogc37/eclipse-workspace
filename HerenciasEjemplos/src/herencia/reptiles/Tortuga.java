package herencia.reptiles;

import programacion_classes_abstract.Reptiles;

public class Tortuga extends Reptiles{

	public Tortuga(boolean esOviparo, int peso, int altura) {
		super(true, peso, 4, altura);
		
	}

	@Override
	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("Me arrastro "+metros+" metros.");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Respiro donde quiero");
	}

	@Override
	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("Me ahogo please send help");
	}

}
