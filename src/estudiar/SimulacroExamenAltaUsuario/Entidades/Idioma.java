package estudiar.SimulacroExamenAltaUsuario.Entidades;

public class Idioma {
	@Override
	public String toString() {
		return descripcion;
	}
	int id, idPais;
	String descripcion;
	public Idioma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Idioma(int id, int idPais, String descripcion) {
		super();
		this.id = id;
		this.idPais = idPais;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
