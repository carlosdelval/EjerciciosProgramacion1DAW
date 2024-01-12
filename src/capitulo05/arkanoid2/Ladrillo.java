package capitulo05.arkanoid2;

import tutorialJava.Utils;

public class Ladrillo {
	private String color;
	private int x, y, ancho, alto, puntosVida;
	private String colores[] = {"rojo", "verde", "azul"};
	
	public Ladrillo(){
		x = Utils.obtenerNumeroAzar(0, 800);
		y = Utils.obtenerNumeroAzar(0, 500);
		ancho = 100;
		alto = 50;
		puntosVida = Utils.obtenerNumeroAzar(1, 3);
		if(puntosVida == 1) color = colores[Utils.obtenerNumeroAzar(0, 2)];
		if(puntosVida == 2) color = "plateado";
		if(puntosVida == 3) color = "dorado";
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	public void chocaPelota() {
		puntosVida --;
		if(puntosVida < 0) puntosVida = 0;
	}
	
	public String toString() {
		return color + ": " + puntosVida + "puntos de vida.";
	}
}
