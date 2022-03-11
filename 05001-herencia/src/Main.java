import java.util.ArrayList;

public class Main {

	public Main() {
		ArrayList<Trabajador> arrayEmpleados = new ArrayList<Trabajador>();
		Administrativo administrativo1= new Administrativo("Pepe", "Rodriguez");
		arrayEmpleados.add(administrativo1);
		Administrativo administrativo2= new Administrativo("Pepa", "Lorenzo");
		arrayEmpleados.add(administrativo2);
		Administrativo administrativo3= new Administrativo("Pepito", "Suarez");
		arrayEmpleados.add(administrativo3);
		Gruista gruista1 = new Gruista("Pepe", "Sanchez");
		arrayEmpleados.add(gruista1);
		Gruista gruista2 = new Gruista("Pepa", "Gimenez");
		arrayEmpleados.add(gruista2);
		Gruista gruista3 = new Gruista("Pepe", "Rodriguez");
		arrayEmpleados.add(gruista3);
		Gruista gruista4 = new Gruista("Pepe", "Barcena");
		arrayEmpleados.add(gruista4);
		Gruista gruista5 = new Gruista("Pepe", "Martinez");
		arrayEmpleados.add(gruista5);
		Estribador estribador1 = new Estribador("Pepe", "Jousep");
		arrayEmpleados.add(estribador1);
		Estribador estribador2 = new Estribador("Pepe", "Jaime");
		arrayEmpleados.add(estribador2);
		Gestor gestor1 = new Gestor("Pepe", "Javier");
		arrayEmpleados.add(gestor1);
		Gestor gestor2 = new Gestor("Pepe", "Angel");
		arrayEmpleados.add(gestor2);
		Financiero financiero = new Financiero("Pepe","Roberto");
		arrayEmpleados.add(financiero);	
		System.out.println(arrayEmpleados);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}

}
