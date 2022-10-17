package Calculadora;

public class Suma{
	
	private int operando1, operando2;
	
	public Suma(int operando1, int operando2) {
		this.operando1=operando1;
		this.operando2=operando2;
	}
	
	
	public int suma() {
		int resultado = operando1+operando2;
		return resultado;
	}
}
