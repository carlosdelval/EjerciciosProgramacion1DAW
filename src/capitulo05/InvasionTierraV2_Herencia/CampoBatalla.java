package capitulo05.InvasionTierraV2_Herencia;

import tutorialJava.Utils;

public class CampoBatalla {
	
	private Personaje[] humanos = new Humano[20];
	private Personaje[] malvados = new Malvado[20];
	
	/**
	 * 
	 */
	
	public CampoBatalla () {
		// Inicializo el array de humanos y de malvados.
		inicializaArrayPersonajes(humanos, "humano");
		inicializaArrayPersonajes(malvados, "malvado");
		
		// Mezclo los arrays mediante su respectivo método.
		mezclaHumanos();
		mezclaMalvados();
	}
	
	private void inicializaArrayPersonajes(Personaje[] p, String descripcion) {
		for (int i = 0; i < p.length; i++) {
			if(descripcion.equalsIgnoreCase("humano")) {
				p[i] = new Humano();
			}
			else {
				p[i] = new Malvado();
			}
			p[i].setNombre(descripcion + i);
		}
		Personaje ultimoP = p[p.length - 1];
		ultimoP.setPuntosVida(ultimoP.getPuntosVida() * 2);
	}
	
	/**
	 * 
	 *
	 */
	
	public void mezclaHumanos () {
		for (int i = 0; i < humanos.length; i++) {
			int azar1 = Utils.obtenerNumeroAzar(0, humanos.length - 1);
			int azar2 = Utils.obtenerNumeroAzar(0, humanos.length - 1);
			Personaje aux = humanos[azar1];
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
			Personaje aux = malvados[azar1];
			malvados[azar1] = malvados[azar2];
			malvados[azar2] = aux;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	
	public Personaje getPrimerHumanoVivo() {
		for (int i = 0; i < humanos.length; i++) {
			if(humanos[i].isVivo()) return humanos[i];
		}
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public Personaje getPrimerMalvadoVivo() {
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
