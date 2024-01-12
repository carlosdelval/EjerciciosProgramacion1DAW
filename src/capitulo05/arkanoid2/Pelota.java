package capitulo05.arkanoid2;

public class Pelota {
	private int x, y;
	
	public Pelota(){
		
	}

	public String toString() {
		return "Pelota [x=" + x + ", y=" + y + "]";
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
	
	public boolean chocaLadrillo(Ladrillo L) {
		if(x > L.getX() && x < (L.getX() + L.getAncho()) && y > L.getY() && y < (L.getY() + L.getAlto())) {
			return true;
		}
		return false;
	}
}
