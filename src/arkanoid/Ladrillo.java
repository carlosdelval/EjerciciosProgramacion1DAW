package arkanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Actor{
	private String color;
	private int ancho = 60;
	private int alto = 30;
	private int x;
	private int y;
	
	
	//Propiedades estáticas de esta clase
	public static String IMAGEN_LADRILLO = "ladrillo.jpg";

	/**
	 * Constructor más completo, con todas las propiedades del objeto
	 * @param x
	 * @param y
	 * @param img
	 * @param Color
	 */
	public Ladrillo(int X, int Y, String img, String Color) {
		color = Color;
		x = X;
		y = Y;
	}
	
	// Getters y Setters 
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public static String getIMAGEN_LADRILLO() {
		return IMAGEN_LADRILLO;
	}

	public static void setIMAGEN_LADRILLO(String iMAGEN_LADRILLO) {
		IMAGEN_LADRILLO = iMAGEN_LADRILLO;
	}


	@Override
	public void paint(Graphics g) {
		if(color == "GREEN")
			g.setColor(Color.GREEN);
		if(color == "RED")
			g.setColor(Color.RED);
		if(color == "BLUE")
			g.setColor(Color.BLUE);
		if(color == "YELLOW")
			g.setColor(Color.YELLOW);
		if(color == "MAGENTA")
			g.setColor(Color.MAGENTA);
		g.fillRect(x, y, ancho, alto);
	}

	@Override
	public void actua() {
		// TODO Auto-generated method stub
		
	}
	
	public void colisionaCon(Actor a) {
		super.colisionaCon(a);
		
		if(a instanceof Pelota) {
			Arkanoid.getInstance().eliminaActor(this);
		}
	}

}
