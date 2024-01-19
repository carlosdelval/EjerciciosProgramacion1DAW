package capitulo07.listener;

public class Perro implements IncidenciaMatematicaListener {
	
	public Perro() {
		IntroduccionNumeros.listIncidenciaMatematicaListeners.add(this);
	}
	
	
	public void restaNegativa(IncidenciaMatematicaEvent e) {
		System.out.println("Soy un perro y me han notificado que el usuario ha introducido "
				+ "una resta negativa.");
	}
	
	public void sumaOMultiMayorA1000(IncidenciaMatematicaEvent e) {
		System.out.println("Soy un perro y me han notificado que el usuario ha introducido "
				+ "una suma o multiplicación mayor a 1000");
	}
	
	public void divisorCero(IncidenciaMatematicaEvent e) {
		System.out.println("Soy un perro y me han notificado que el usuario ha introducido "
				+ "un divisor igual a 0.");
	}
	
	public void raizCuadradaNegativa(IncidenciaMatematicaEvent e) {
		System.out.println("Soy un perro y me han notificado que el usuario ha introducido "
				+ "una raíz cuadrada de un num negativo");
	}
}
