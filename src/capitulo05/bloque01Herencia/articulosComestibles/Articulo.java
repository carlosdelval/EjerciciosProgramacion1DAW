package capitulo05.bloque01Herencia.articulosComestibles;

public class Articulo {
	protected int codigo;
	protected String nombre;
	protected int precio;
	
	public Articulo() {
	}
	
	public int getCodigo() {
		return codigo;
	}
	public int getPrecio() {
		return precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCodigo(int newCodigo) {
		codigo = newCodigo;
	}
	public void setPrecio(int newPrecio) {
		precio = newPrecio;
	}
	public void setNombre(String newNombre) {
		nombre = newNombre;
	}
	public String toString() {
		return "Artículo nº" + codigo + " : Nombre --> " + nombre + " : Precio --> " + precio;
	}
}
