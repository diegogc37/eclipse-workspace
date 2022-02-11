package herencia.aves;

import programacion_classes_abstract.NoVaFlying;

public class Avestruz extends NoVaFlying{

	public Avestruz(int peso, int altura) {
		super(peso, altura);
	}

	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("YUPI he corrido "+metros+" metros.");
	}

	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Se me hincha el pecho pa y te pico un ojo");
	}

	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("No se que hago asi que pico el suelo");
	}

}
