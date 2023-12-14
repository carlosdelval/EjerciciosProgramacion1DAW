package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Joya extends Antiguedad{
	private String material;
	
	public Joya() {
		super();
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Joya [material=" + material + "]: " + super.toString();
	}
	
}
