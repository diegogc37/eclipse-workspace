package herencia.aves;

import programacion_classes_abstract.VaFlying;

public class Loro extends VaFlying{

	public Loro(int peso, int altura) {
		super(peso, altura);
	}

	@Override
	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("YUPI he volado "+metros+" metros.");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Se me hincha el pecho pa");
	}

	@Override
	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("Te responde intensamente");
	}

}