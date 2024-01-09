package capitulo06.hashMaps;

public class Articulo {
	private String codigoBarras;
	private int numEstante;
	private int stock;
	
	public Articulo(int NumEstante, int Stock) {
		super();
		numEstante = NumEstante;
		stock = Stock;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public int getNumEstante() {
		return numEstante;
	}
	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "numEstante = " + numEstante + ", stock = " + stock + ".";
	}
	
	
}
