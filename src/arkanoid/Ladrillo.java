package arkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Ladrillo extends Actor{
	private String color;
	private int ancho;
	private int alto;
	private int x;
	private int y;
	private int pvida;
	BufferedImage img;
	
	
	//Propiedades estáticas de esta clase
	public static String IMAGEN_LADRILLO = "ladrillo.jpg";

	/**
	 * Constructor más completo, con todas las propiedades del objeto
	 * @param x
	 * @param y
	 * @param img
	 * @param Color
	 */
	public Ladrillo(int X, int Y, String Color, BufferedImage ladrilloColor) {
		color = Color;
		img = ladrilloColor;
		x = X;
		y = Y;
		ancho = this.img.getWidth();
		alto = this.img.getHeight();
		if(color == "GREEN") pvida = 1;
		if(color == "RED") pvida = 2;
		if(color == "BLUE") pvida = 2;
		if(color == "YELLOW") pvida = 3;
		if(color == "MAGENTA") pvida = 4;
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
		g.drawImage(this.img, this.x, this.y, null);
	}

	@Override
	public void actua() {
		// TODO Auto-generated method stub
		
	}
	
	public void colisionaCon(Actor a) {
		super.colisionaCon(a);
		
		if(a instanceof Pelota) {
			if(pvida == 0) {
			Arkanoid.getInstance().eliminaActor(this);
			Arkanoid.getInstance().incorporaNuevoActor(new Explosion(this.x + (this.ancho/2), this.y));
			}else {
				pvida = pvida - 1;
			}
		}
	}

}
