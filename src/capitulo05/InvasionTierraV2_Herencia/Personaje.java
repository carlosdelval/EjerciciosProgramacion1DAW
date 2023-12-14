package capitulo05.InvasionTierraV2_Herencia;

import tutorialJava.Utils;

public class Personaje {
	protected String nombre;
	protected int puntosVida;
	protected boolean vivo;
	
	public Personaje() {
		puntosVida = Utils.obtenerNumeroAzar(50, 100);
		vivo = true;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String newNombre) {
		nombre = newNombre;
	}
	public void recibirDisparo() {
		puntosVida -= Utils.obtenerNumeroAzar(5, 25);
		if(puntosVida <= 0) {
			vivo = false;
			puntosVida = 0;
		}
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int newPVida) {
		puntosVida = newPVida;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean newVivo) {
		vivo = newVivo;
	}
	public String toString() {
		return nombre + ":" + puntosVida + ":" + vivo;
	}
}
