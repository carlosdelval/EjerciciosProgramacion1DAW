package capitulo07.listener;

public interface IncidenciaMatematicaListener {

	public void sumaOMultiMayorA1000(IncidenciaMatematicaEvent e);
	public void restaNegativa(IncidenciaMatematicaEvent e);
	public void divisorCero(IncidenciaMatematicaEvent e);
	public void raizCuadradaNegativa(IncidenciaMatematicaEvent e);
}
