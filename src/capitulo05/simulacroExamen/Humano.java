package capitulo05.simulacroExamen;

import tutorialJava.Utils;

public class Humano {
	private String nombre;
	private int puntosVida;
	private boolean vivo;
	
	public Humano() {
		puntosVida = Utils.obtenerNumeroAzar(50, 100);
		vivo = true;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String newNombre) {
		nombre = newNombre;
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
