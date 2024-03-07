package estudiar.SimulacroExamenAltaUsuario.Entidades;

public class Acuerdo {
	int id, idIdioma;
	String descripcion;
	
	@Override
	public String toString() {
		return descripcion;
	}
	public Acuerdo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acuerdo(int id, int idIdioma, String descripcion) {
		super();
		this.id = id;
		this.idIdioma = idIdioma;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdIdioma() {
		return idIdioma;
	}
	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}


