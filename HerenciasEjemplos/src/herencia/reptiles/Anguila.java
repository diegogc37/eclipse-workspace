package herencia.reptiles;

import programacion_classes_abstract.Reptiles;

public class Anguila extends Reptiles{

	public Anguila(int peso, int numeroPatas, int altura) {
		super(false,peso, numeroPatas, altura);
		
	}

	@Override
	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("Me desplazo "+metros+" agitando mi cuerpo");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Repiro bajo el rio");
	}

	@Override
	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("�Que ruido hace una anguila?");
	}
	
	
	
}
