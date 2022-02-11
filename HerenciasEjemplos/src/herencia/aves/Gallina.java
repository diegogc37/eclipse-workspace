package herencia.aves;

import programacion_classes_abstract.NoVaFlying;

public class Gallina extends NoVaFlying{

	public Gallina(int peso, int altura) {
		super(peso, altura);
	}

	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("YUPI he saltado "+metros+" metros.");
	}

	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Se me hincha el pecho pa");
	}

	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("No toques a los cucos");
	}

}