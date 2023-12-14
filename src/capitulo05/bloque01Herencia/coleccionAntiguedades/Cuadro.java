package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Cuadro extends Antiguedad{
	private String pintor;
	private String epoca;
	
	Cuadro(){
		super();
	}

	public String getPintor() {
		return pintor;
	}

	public void setPintor(String pintor) {
		this.pintor = pintor;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	@Override
	public String toString() {
		return "Cuadro [pintor=" + pintor + ", epoca=" + epoca + "]: " + super.toString();
	}
	
	
}
