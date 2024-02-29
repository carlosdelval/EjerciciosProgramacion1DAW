package capitulo09.Ejercicios.entidades;

public class ValoracionMateria {
	int id, idProfesor, intEstudiante, idMateria, valoracion;

	public ValoracionMateria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValoracionMateria(int id, int idProfesor, int intEstudiante, int idMateria, int valoracion) {
		super();
		this.id = id;
		this.idProfesor = idProfesor;
		this.intEstudiante = intEstudiante;
		this.idMateria = idMateria;
		this.valoracion = valoracion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public int getIntEstudiante() {
		return intEstudiante;
	}

	public void setIntEstudiante(int intEstudiante) {
		this.intEstudiante = intEstudiante;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
}
