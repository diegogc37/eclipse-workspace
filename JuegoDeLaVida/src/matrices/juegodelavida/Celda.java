package matrices.juegodelavida;

public class Celda {

	private boolean tieneVida;
	private int numeroVecinos;
	
	public Celda(boolean tieneVida) {
		numeroVecinos=0;
		this.tieneVida=tieneVida;
	}
	
	public boolean getEstado() {
		return tieneVida;
	}
	
	public boolean tieneVecinoSuperiorIzquierda() {
		if(tieneVecinoSuperiorIzquierda()) numeroVecinos++;
		return true;
	}
	
	public boolean tieneVecinoSuperiorCentral() {
		if(tieneVecinoSuperiorCentral()) numeroVecinos++;
		return true;
	}
	
	public boolean tieneVecinoSuperiorDerecha() {
		if(tieneVecinoSuperiorDerecha()) numeroVecinos++;
		return true;
	}
	
	public boolean tieneVecinoCentralIzquierda() {
		if(tieneVecinoSuperiorIzquierda()) numeroVecinos++;
		return true;
	}
	
	public boolean tieneVecinoCentralDerecha() {
		if(tieneVecinoCentralIzquierda()) numeroVecinos++;
		return true;
	}
	
	public boolean tieneVecinoInferiorIzquierda() {
		if(tieneVecinoInferiorIzquierda()) numeroVecinos++;
		return true;
	}
	
	public boolean tieneVecinoInferiorCentral() {
		if(tieneVecinoInferiorCentral()) numeroVecinos++;
		return true;
	}
	
	public boolean tieneVecinoInferiorDerecha() {
		if(tieneVecinoInferiorDerecha()) numeroVecinos++;
		return true;
	}
	
	public int getNumeroVecinos() {
		return numeroVecinos;
	}
	
	public String toString() {
		if (tieneVida)return "o";
		return " ";
	}
}
