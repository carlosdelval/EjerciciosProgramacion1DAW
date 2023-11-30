package capitulo05.arkanoid;

public class Pelota {
	private int x, y;
	
	public Pelota() {
		
	}
	
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
	 */
	
	public String toString() {
		return x + "-" + y;
	}
	
	/**
	 * 
	 */
	
	public boolean golpeaLadrillo(ladrillo ladrillo) {
		if(x > ladrillo.getX() && x < (ladrillo.getX() + ladrillo.getAncho()) && y > ladrillo.getY() && y < ladrillo.getY() + ladrillo.getAlto()) return true;
		else return false;
	}
	
}
