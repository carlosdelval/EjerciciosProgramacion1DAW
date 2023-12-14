package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Escultura extends Antiguedad{
	private String artista;
	private String material;
	
	public Escultura() {
		super();
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Escultura [artista=" + artista + ", material=" + material + "]: " + super.toString();
	}
	
}
