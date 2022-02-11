package herencia.peces;

import programacion_classes_abstract.Pez;

public class Tiburon extends Pez{

	public Tiburon(int peso, int altura) {
		super(peso, altura, 10);
	}

	@Override
	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("Me desplazo "+metros+" a huevo");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Frase de Dory(Buscando a Nemo)");
	}

	@Override
	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("GLUGLUGLU");
	}
}
