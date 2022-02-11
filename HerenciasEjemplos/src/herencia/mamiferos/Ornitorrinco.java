package herencia.mamiferos;

import programacion_classes_abstract.Mamifero;

public class Ornitorrinco extends Mamifero{

	public Ornitorrinco(int peso, int altura) {
		super(true, peso, 4
				, altura);
	}
	
	public void emitirRuido() {
		System.out.println("�Que ruido hace un ornitorrinco?");
	}
	public void desplazarse(int metros) {
		System.out.println("Voy con un contoneso sexy a lo largo de una distancia de "+metros);
	}
	
	public void respirar() {
		System.out.println("Respiro con mis mini pulmones");
	}
}
