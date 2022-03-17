package juegos.batallas;

import java.util.*;

public class Mago extends Clases{

	private String nombrePJ;
	private Random r = new Random();
	public Mago(String nombrePJ) {
		super("Mago");
		this.nombrePJ=nombrePJ;
	}

	@Override
	public void atacar(String tipoAtaque, Clases enemigo) {
		int da�o = getAtaque();	
		if(tipoAtaque.equals("S")) {
			System.out.println("El mago de "+nombrePJ+" hace "+da�o+" al "+enemigo.getClass()+" de "+enemigo.getNombrePJ()+".");
		}else if(tipoAtaque.equals("C")){
			int objetivo=r.nextInt(2);
			switch(objetivo) {
			case 1:
				System.out.println("El mago de "+nombrePJ+" hace "+da�o+" al "+enemigo.getClass()+" de "+enemigo.getNombrePJ()+".");
				break;
			case 0:
				System.out.println("El mago de "+nombrePJ+" se inflinge un da�o de "+da�o+".");
				break;
			default:
				break;
			}
		}
	}

	@Override
	public void setVida(int da�o) {
			this.puntosVida=this.puntosVida-da�o;	
	}

	@Override
	public int getVida() {
		return puntosVida;
	}

	@Override
	public int getAtaque() {
		return r.nextInt(getMaxAtaque())+getMinAtaque();
	}

	@Override
	public int getMaxAtaque() {
		return MAX_DA�O_MAGO;
	}

	@Override
	public int getMinAtaque() {
		return MIN_DA�O_MAGO;
	}

	@Override
	public String getClase() {
		return tipoPJ;
	}

	@Override
	public String getNombrePJ() {
		return nombrePJ;
	}
}
