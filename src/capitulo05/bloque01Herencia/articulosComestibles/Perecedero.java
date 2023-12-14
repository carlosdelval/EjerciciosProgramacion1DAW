package capitulo05.bloque01Herencia.articulosComestibles;

public class Perecedero extends Articulo {
	
	private int dia, mes, anio;
	
	public Perecedero() {
		super();
	}

	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int año) {
		this.anio = año;
	}



	@Override
	public String toString() {
		return "Perecedero (fecha de caducidad: " + dia + "/" + mes + "/" + anio + "): " + super.toString();
	}
}
