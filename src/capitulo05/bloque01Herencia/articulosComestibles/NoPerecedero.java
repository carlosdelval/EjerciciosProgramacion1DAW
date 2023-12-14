package capitulo05.bloque01Herencia.articulosComestibles;

public class NoPerecedero extends Articulo{
	
	public NoPerecedero() {
		super();
	}

	@Override
	public String toString() {
		return "Perecedero: " + super.toString();
	}
}
