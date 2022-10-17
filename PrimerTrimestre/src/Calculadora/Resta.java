package Calculadora;

public class Resta {
	
	private int operando1, operando2;
	
	public Resta(int operando1, int operando2) {
		this.operando1=operando1;
		this.operando2=operando2;
	}
	
	
	public int resta() {
		int resultado = operando1-operando2;
		return resultado;
	}
}
