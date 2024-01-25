package arkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 * Clase que representa un player en el juego
 *
 */
public class Player extends Actor {
	// Propiedades estáticas de esta clase
	public static String IMAGEN_PLAYER = "nave.gif";
	// Propiedades que indican si se está produciendo un movimiento en una dirección
	private boolean izquierda = false, derecha = false;
	// Velocidad de la nave, expresada en píxeles por cada frame
	public static int VELOCIDAD = 8;

	/**
	 * Constructor por defecto "default constructor"
	 */
	public Player() {
		super();
	}
	
	

	/**
	 * Constructor que inicializa las propiedades del objeto
	 * 
	 * @param x
	 * @param y
	 * @param img
	 */
	public Player(int x, int y) {
		super(x, y, ImagesCache.getInstance().getImagen(ImagesCache.IMAGEN_PLAYER));
		this.velocidadX = 0;
		ancho = 100;
		alto = 20;
	}
	
	

	/**
	 * Obtención de un String con todos los datos de un objeto Player
	 */
	public String toString() {
		return "Player [getX()=" + getX() + ", getY()=" + getY() + ", getImg()=" + getImg() + "]";
	}

	/**
	 * Utilizado para pintar un player, según sus coordenadas de x e y
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(this.img, this.x, 700, null);
	}

	@Override
	public void actua() {
		// Compruebo las variables booleanas que determinan el movimiento
		if (izquierda) this.x -= VELOCIDAD;
		if (derecha) this.x += VELOCIDAD;
		
		// Compruebo si el player sale del canvas por cualquiera de los cuatro márgenes
		mover(this.x);
	}

	/**
	 * Mediante la llamada a este método, podemos cambiar la posición del jugador a
	 * unas nuevas coordenadas
	 * 
	 * @param x
	 * @param y
	 */
	public void mover(int x) {
		this.x = x;
		// Controlo los casos en los que el jugador pueda salir del Canvas
		MiCanvas canvas = Arkanoid.getInstance().getCanvas(); // Referencia al objeto Canvas usado
		
		// Compruebo si el jugador sale por la derecha
		if (this.x > (canvas.getWidth() - ancho)) {
			this.x = canvas.getWidth() - ancho;
		}

		// Compruebo si el jugador sale por la izquierda
		if (this.x < 0) {
			this.x = 0;
		}
	}

	/**
	 * Se ejecuta al recibir un evento del teclado: tecla presionada
	 * @param e
	 */
	public void keyPressed (KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			izquierda = true; break;
		case KeyEvent.VK_RIGHT:
			derecha = true; break;
		}
	}
	
	/**
	 * Se ejecuta al recibir un evento del teclado: tecla liberada
	 * @param e
	 */
	public void keyReleased (KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			izquierda = false; break;
		case KeyEvent.VK_RIGHT:
			derecha = false; break;
		}
	}
}
