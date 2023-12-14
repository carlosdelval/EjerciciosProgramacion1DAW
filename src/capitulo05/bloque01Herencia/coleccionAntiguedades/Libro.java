package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Libro extends Antiguedad{
	private String autor;
	private int numPag;
	
	public Libro() {
		super();
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", numPag=" + numPag + "]: " + super.toString();
	}
	
	
}
