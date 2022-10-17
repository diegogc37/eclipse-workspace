package Calculadora;

public class Multiplicacion {
	
	private int operando1, operando2;
	
	public Multiplicacion(int operando1, int operando2) {
		this.operando1=operando1;
		this.operando2=operando2;
	}
	
	
	public int multiplicacion() {
		int resultado = operando1*operando2;
		return resultado;
	}
}
