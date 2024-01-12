package arkanoid;

import java.awt.Color;
import java.awt.Graphics;


public class Pelota extends Actor {
	
	//Propiedades estáticas de esta clase
	public static String IMAGEN_BOLA = "bola.jpg";
	public static int ancho = 20;
	public static int alto = 20;
	
	/**
	 * Constructor sin argumentos de entrada
	 */
	public Pelota() {
		super();
	}

	/**
	 * Constructor más completo, con todas las propiedades del objeto
	 * @param x
	 * @param y
	 */
	public Pelota(int x, int y, String img) {
		super(x, y, img);
		this.velocidadX = 5;
		this.velocidadY = 5;
	}
	
	// Getters y Setters 

	/**
	 * Utilizado para pintar un monstruo, según sus coordenadas de x e y
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(this.x, this.y, ancho, alto);
	}

	@Override
	public void actua() {
		// El monstruo se mueve de manera horizontal, en cada FPS
		this.x += this.velocidadX;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.x < 0 || (this.x + ancho) > Arkanoid.getInstance().getCanvas().getWidth()) {
			this.velocidadX = -this.velocidadX;
		}
		
		// Copiamos el esquema anterior para el movimiento vertical
		this.y += this.velocidadY;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.y < 0 || (this.y + alto) > Arkanoid.getInstance().getCanvas().getHeight()) {
			this.velocidadY = -this.velocidadY;
		}
	}
	
	public void colisionaCon(Actor a) {
		super.colisionaCon(a);
		
		this.velocidadY = -this.velocidadY;
	}

}
