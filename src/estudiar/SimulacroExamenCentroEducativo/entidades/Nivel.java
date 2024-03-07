package estudiar.SimulacroExamenCentroEducativo.entidades;

public class Nivel {
	private int id;
	private String descripcion;
	private int idCentro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIdCentro() {
		return idCentro;
	}
	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}
	@Override
	public String toString() {
		return descripcion;
	}
}
