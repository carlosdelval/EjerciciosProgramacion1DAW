package capitulo05.simulacroExamen;

import tutorialJava.Utils;

public class CampoBatalla {
	
	private String nombre;
	private Humano[] humanos = new Humano[20];
	private Malvado[] malvados = new Malvado[20];
	
	/**
	 * 
	 */
	
	public CampoBatalla () {
		// Inicializo el array de humanos y de malvados.
		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano();
			humanos[i].setNombre("Humano-" + i);
			malvados[i] = new Malvado();
			malvados[i].setNombre("Malvado-" + i);
		}
		
		// A los últimos de cada les doblo los puntos de vida.
		Humano ultimoHumano = humanos[humanos.length - 1];
		ultimoHumano.setPuntosVida(ultimoHumano.getPuntosVida() * 2);
		Malvado ultimoMalvado = malvados[malvados.length - 1];
		ultimoMalvado.setPuntosVida(ultimoMalvado.getPuntosVida() * 2);
		
		// Mezclo los arrays mediante su respectivo método.
		mezclaHumanos();
		mezclaMalvados();
	}
	
	/**
	 * 
	 *
	 */
	
	public void mezclaHumanos () {
		for (int i = 0; i < humanos.length; i++) {
			int azar1 = Utils.obtenerNumeroAzar(0, humanos.length - 1);
			int azar2 = Utils.obtenerNumeroAzar(0, humanos.length - 1);
			Humano aux = humanos[azar1];
			humanos[azar1] = humanos[azar2];
			humanos[azar2] = aux;
		}
	}
	
	/**
	 * 
	 *
	 */
	
	public void mezclaMalvados () {
		for (int i = 0; i < malvados.length; i++) {
			int azar1 = Utils.obtenerNumeroAzar(0, malvados.length - 1);
			int azar2 = Utils.obtenerNumeroAzar(0, malvados.length - 1);
			Malvado aux = malvados[azar1];
			malvados[azar1] = malvados[azar2];
			malvados[azar2] = aux;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	
	public Humano getPrimerHumanoVivo() {
		for (int i = 0; i < humanos.length; i++) {
			if(humanos[i].isVivo()) return humanos[i];
		}
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public Malvado getPrimerMalvadoVivo() {
		for (int i = 0; i < malvados.length; i++) {
			if(malvados[i].isVivo()) return malvados[i];
		}
		return null;
	}
	
	public void muestraEstadoActual() {
		for (int i = 0; i < humanos.length; i++) {
			System.out.print(humanos[i] + "-");
		}
		System.out.println();
		for (int i = 0; i < malvados.length; i++) {
			System.out.print(malvados[i] + "-");
		}
		System.out.println();
		System.out.println();
	}
}
