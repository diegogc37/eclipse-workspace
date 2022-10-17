package Calculadora;

public class Division {
	
	private int operando1, operando2;
	
	public Division(int operando1, int operando2) {
		this.operando1=operando1;
		this.operando2=operando2;
	}
	
	
	public int division() {
		int resultado = operando1/operando2;
		return resultado;
	}
}
