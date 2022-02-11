package herencia.peces;

import programacion_classes_abstract.Pez;

public class Atun extends Pez{

	public Atun(int peso, int altura) {
		super(peso,altura,7);
	}

	@Override
	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("Nado "+metros+" bajo el mar");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("NO me ahogo XD XD");
	}

	@Override
	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("GLU GLU GLU");
	}
}
