package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Antiguedad {
	protected int anioFabricacion, precio;
	protected String origen;
	
	public Antiguedad() {
		
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String toString() {
		return "Año fabricación --> " + anioFabricacion + " Precio --> " + precio + " Origen --> " + origen;
	}
	
}
