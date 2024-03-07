package estudiar.SimulacroExamenAltaUsuario.Entidades;

public class Pais {
	int id;
	String descripcion;
	@Override
	public String toString() {
		return descripcion;
	}
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pais(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
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
}
