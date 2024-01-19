package capitulo07.listener;

public class IncidenciaMatematicaEvent {

	private int operacion;
	
	public IncidenciaMatematicaEvent(int operacionIntroducida) {
		super();
		operacion = operacionIntroducida;
	}

	public int getOperacion() {
		return operacion;
	}

	public void setOperacion(int operacion) {
		this.operacion = operacion;
	}
}
