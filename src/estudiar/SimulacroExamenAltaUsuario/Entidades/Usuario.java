package estudiar.SimulacroExamenAltaUsuario.Entidades;

public class Usuario {
	int id, idIdioma;
	String password,email,usuario;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int id, int idIdioma, String password, String email, String usuario) {
		super();
		this.id = id;
		this.idIdioma = idIdioma;
		this.password = password;
		this.email = email;
		this.usuario = usuario;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
