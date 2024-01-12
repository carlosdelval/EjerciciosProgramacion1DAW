package arkanoid;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Esta clase representa las propiedades y acciones de un monstruo del videojuego SpaceInvaders
 */
public class Pelota extends Actor {
	// Propiedades privadas de cada monstruo
	private String nombre; // Nombre que recibe el monstruo
	private int probabilidadDisparo; // Probabilidad de que ser realice un disparo
	
	//Propiedades estáticas de esta clase
	public static String IMAGEN_BOLA = "bola.jpg";
	
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
	 * @param probabilidadDisparo
	 */
	public Pelota(int x, int y, String img) {
		super(x, y, img);
		this.velocidadX = 5;
		this.velocidadY = 5;
	}
	
	// Acciones de cada monstruo
	
	/**
	 * El monstruo dispara con una determinada probabilidad. El objeto Monster tendrá un valor determinado
	 * para su propiedad "probabilidadDisparo". Por ejemplo, si la probabilidad es "30" obtendremos un número
	 * al azar entre 0 y 100. Si el número al azar es menor o igual a 30, dictaminaremos que la probabilidad
	 * se ha cumplido, por lo que realizaremos un disparo.
	 */
	public void dispara() {
		if (puedoDisparar() == true) {
			System.out.println(nombre + " Dispara"); // Simulación de un disparo
		}
	}
	
	/**
	 * Método privado que comprueba si, según la probabilidad indicada, se va a producir un disparo
	 * @return
	 */
	private boolean puedoDisparar() {
		int numAzar = (int) Math.round(Math.random() * 100); // Obtengo un número al azar entre 0 y 100
		// Si el número es menor o igual a la probabilidadDisparo del objeto, decido disparar
		if (numAzar < probabilidadDisparo) {
			return true;
		}
		return false; // Si llego hasta aquí es porque la probabilidad no se ha cumplido
	}
	

	/**
	 * Metodo que devuelve un String con todos los valores de este objeto.
	 */
	public String toString() {
		return "Monster [nombre=" + nombre + ", probabilidadDisparo=" + probabilidadDisparo + ", getX()=" + getX()
				+ ", getY()=" + getY() + ", getImg()=" + getImg() + "]";
	}

	
	// Getters y Setters 
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the probabilidadDisparo
	 */
	public int getProbabilidadDisparo() {
		return probabilidadDisparo;
	}

	/**
	 * @param probabilidadDisparo the probabilidadDisparo to set
	 */
	public void setProbabilidadDisparo(int probabilidadDisparo) {
		this.probabilidadDisparo = probabilidadDisparo;
	}

	/**
	 * Utilizado para pintar un monstruo, según sus coordenadas de x e y
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(this.x, this.y, 25, 25);
	}

	@Override
	public void actua() {
		// El monstruo se mueve de manera horizontal, en cada FPS
		this.x += this.velocidadX;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.x < 0 || (this.x + this.ancho) > Arkanoid.getInstance().getCanvas().getWidth()) {
			this.velocidadX = -this.velocidadX;
		}
		
		// Copiamos el esquema anterior para el movimiento vertical
		this.y += this.velocidadY;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.y < 0 || (this.y + this.alto) > Arkanoid.getInstance().getCanvas().getHeight()) {
			this.velocidadY = -this.velocidadY;
		}
		
	}

}
