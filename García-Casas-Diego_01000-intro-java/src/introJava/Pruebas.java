package introJava;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contenidoImprimir;
		/*Primer ejercicio*/
		String texto="Hola";
		/*Segundo ejercicio*/
		int numero1= 5;
		int numero2=numero1+1;
		/*Tercer ejercicio*/
		int media1=10;
		int media2=15;
		int sumMedia=media1+media2;
		int mediaA= sumMedia/2;
		/*Cuarto ejercicio*/
		double media40=100;
		double media60=200;
		double sumMedia2 = (media40*0.4)+(media60*0.6);
		double mediaA2=sumMedia2/2;
		/*Quinto ejercicio*/
		int radio = 12;
		double area=Math.PI*(radio*radio);
		double perimetro=2*Math.PI*radio;
		/*Sexto ejercicio parte 1 variables*/
		int edad=17;
		/*Septimo ejercicio parte 1 variable*/
		int parImpar = 35;
		/*Parte final impresion*/
		contenidoImprimir = texto+'\n'+"El numero entero es: "+numero1+" Elnumero incrementado es: "+numero2+
				'\n'+mediaA+'\n'+sumMedia2+'\n'+"El area de la circunferencia es: "+area+" El perimetro es: "+perimetro+'\n';
		System.out.println(contenidoImprimir);
		/*Sexto ejercicio parte 2*/
		if (edad > 17) {
			String texto2="Eres mayor de edad";
			System.out.println(texto2+'\n');
		}
		else {
			String texto3="Eres menor de edad";
			System.out.println(texto3+'\n');
		}
		/*Seprimo ejercicio parte 2*/
		if (parImpar%2==0) {
			String texto4="El numero es par";
			System.out.println(texto4+'\n');
		}
		else {
			String texto5="El numero es impar";
			System.out.println(texto5+'\n');
		}
	}

}
