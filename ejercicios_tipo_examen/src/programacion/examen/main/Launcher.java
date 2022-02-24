package programacion.examen.main;

import java.util.ArrayList;

import programacion.examen.clases.*;

public class Launcher {

	ArrayList<Construccion> array1= new ArrayList<Construccion>();
	
	public Launcher() {		
		Edificio e1 = new Edificio(8,56);
		array1.add(e1);
		Estadio es1 = new Estadio(4,190);
		array1.add(es1);
		Piramide p1 = new Piramide(6,100,8,8);
		array1.add(p1);
		Castillo c1 = new Castillo(3,95,9,7);
		array1.add(c1);
		Edificio e2 = new Edificio(8,56);
		array1.add(e2);
		Estadio es2 = new Estadio(4,190);
		array1.add(es2);
		Piramide p2 = new Piramide(6,100,8,8);
		array1.add(p2);
		Castillo c2 = new Castillo(3,95,9,7);
		array1.add(c2);
		Edificio e3 = new Edificio(8,56);
		array1.add(e3);
		Estadio es3 = new Estadio(4,190);
		array1.add(es3);
		Piramide p3 = new Piramide(6,100,8,8);
		array1.add(p3);
		Castillo c3 = new Castillo(3,95,9,7);
		array1.add(c3);
		Edificio e4 = new Edificio(8,56);
		array1.add(e4);
		Estadio es4 = new Estadio(4,190);
		array1.add(es4);
		Piramide p4 = new Piramide(6,100,8,8);
		array1.add(p4);
		Castillo c4 = new Castillo(3,95,9,7);
		array1.add(c4);
		
	}
	
	public static void main(String[] args) {
		Launcher l = new Launcher();
	}

}
