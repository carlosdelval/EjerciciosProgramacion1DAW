package capitulo05.arkanoid;

import tutorialJava.Utils;

public class ladrillo {
	private String color;
	private int x, y, ancho, alto, puntosVida;
	private String colores[] = {"rojo", "verde", "azul"};
	
	/**
	 * 
	 */
	
	public ladrillo() {
		puntosVida = Utils.obtenerNumeroAzar(1, 3);
		if(puntosVida == 1) color = colores[Utils.obtenerNumeroAzar(0, 2)];
		if(puntosVida == 2) color = "plateado";
		if(puntosVida == 3) color = "dorado";
		x = Utils.obtenerNumeroAzar(0, 800);
		y = Utils.obtenerNumeroAzar(0, 500);
		ancho = 100;
		alto = 50;
	}
	
	/**
	 * 
	 * @param newX
	 */
	
	public void setX(int newX) {
		x = newX;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public void setY(int newY) {
		y = newY;
	}
	
	/**
	 * 
	 * @param newPuntosVida
	 */
	
	public void setPuntosVida(int newPuntosVida) {
		puntosVida = newPuntosVida;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String getColor() {
		return color;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getX() {
		return x;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getY() {
		return y;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getAncho() {
		return ancho;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getAlto() {
		return alto;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getPuntosVida() {
		return puntosVida;
	}
	
	/**
	 * 
	 */
	
	public String toString(int i) {
		return color + (i + 1) + " : " + puntosVida;
	}
	
	public void recibirGolpe() {
		puntosVida -= 1;
		if(puntosVida <= 0) puntosVida = 0;
	}
}