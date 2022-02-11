package herencia.Zoo;

import java.util.ArrayList;
import herencia.mamiferos.Elefante;
import herencia.mamiferos.Gato;
import herencia.mamiferos.Ornitorrinco;
import programacion_classes_abstract.Mamifero;
import programacion_main_class.Vertebrado;

public class Zoo {

	private Vertebrado[] arrayVertebrados;
	private ArrayList<Vertebrado> listaVertebrados;
	
	
	public Zoo() {
		ejemploListaVertebrado();
	}
	
	public void ejemploListaVertebrado() {
		listaVertebrados = new ArrayList<Vertebrado>();
		Gato g = new Gato("Pepe",10,20);
		Vertebrado unOrnitorrinco = new Ornitorrinco(15,30);
		Vertebrado unElefante = new Elefante(100,200);	
		listaVertebrados.add(g);
		listaVertebrados.add(unElefante);
		listaVertebrados.add(1, unOrnitorrinco);
		listaVertebrados.remove(0);
		//listaVertebrados.clear();
		listaVertebrados.toArray();
		System.out.println(listaVertebrados);
	}
	
	public void ejemploArrayVertebnrado() {
		arrayVertebrados = new Vertebrado[10];
		
		Vertebrado unElefante = new Elefante(100,200);
		arrayVertebrados[3]=unElefante;
		
		Vertebrado unOrnitorrinco = new Ornitorrinco(15,30);
		arrayVertebrados[2]=unOrnitorrinco;
		
		Gato g = new Gato("Pepe",10,20);
		arrayVertebrados[1]=g;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z = new Zoo();
	}

}
