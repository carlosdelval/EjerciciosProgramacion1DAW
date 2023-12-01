package capitulo05.poker;

import tutorialJava.Utils;

public class Baraja {
	Carta baraja[] = new Carta[52];
	
	/**
	 * Método que inicializa la baraja de cartas.
	 * @param baraja
	 */
	
	public void inicializaBaraja() {
		int idSetter = 1;
		int aux = 1;
		for (int i = 0; i < 13; i++) {
			baraja[i] = new Carta(aux, "picas", idSetter);
			idSetter++;
			aux++;
		}
		aux = 1;
		for (int i = 13; i < 26; i++) {
			baraja[i] = new Carta(aux, "diamantes", idSetter);
			idSetter++;
			aux++;
		}
		aux = 1;
		for (int i = 26; i < 39; i++) {
			baraja[i] = new Carta(aux, "tréboles", idSetter);
			idSetter++;
			aux++;
		}
		aux = 1;
		for (int i = 39; i < 52; i++) {
			baraja[i] = new Carta(aux, "corazones", idSetter);
			idSetter++;
			aux++;
		}
	}
	
	/**
	 * Método que pasa la primera carta de la baraja al final.
	 * @param baraja
	 * @return
	 */
	
	public void pasarPrimeraAUltima() {
		Carta aux = baraja[0];
		for (int i = 0; i > baraja.length - 1; i++) {
			baraja[i] = baraja[i + 1];
		}
		baraja[baraja.length - 1] = aux;
	}
	
	/**
	 * Pasar última carta a la primera.
	 * @return
	 */
	
	public void pasarUltimaAPrimera () {
		Carta aux = baraja[baraja.length - 1];
		for (int i = (baraja.length - 1); i > 0; i--) {
			baraja[i] = baraja[i - 1];
		}
		baraja[0] = aux;
	}
	
	/**
	 * Método que mezcla la baraja.
	 * @param baraja
	 */
	
	public void mezclaBaraja() {
		for (int i = 0; i < baraja.length; i++) {
			int azar1 = Utils.obtenerNumeroAzar(0, baraja.length - 1);
			int azar2 = Utils.obtenerNumeroAzar(0, baraja.length - 1);
			Carta aux = baraja[azar1];
			baraja[azar1] = baraja[azar2];
			baraja[azar2] = aux;
		}
	}
	
	/**
	 * Método que ordena la baraja.
	 * @param baraja
	 */
	
	public void ordenaBaraja() {
		boolean hayDesorden = true;
		while (hayDesorden = true) {
			hayDesorden = false;
			for (int i = baraja.length - 1; i > 0; i++) {
				if (baraja[i].id < baraja[i - 1].id) {
					Carta aux = baraja[i];
					baraja[i] = baraja[i - 1];
					baraja[i - 1] = aux;
					hayDesorden = true;
				}
			}
		}
	}
	
	/**
	 * Método que muestra la baraja en pantalla.
	 * @param baraja
	 */
	
	public void mostrarBaraja() {
		for (int i = 0; i < baraja.length - 1; i++) {
			System.out.print(baraja[i].toString() + ", ");
		}
		System.out.println(baraja[baraja.length - 1]);
	}
	
	/**
	 * Método que "tacha" de la baraja las cartas que ha obtenido un jugador en su mano.
	 * @param player
	 */
	
	public void repartirMano(Jugador player) {
		player.setMano(baraja);
		for (int i = 0; i < baraja.length; i++) {
			for (int j = 0; j < player.getMano().length; j++) {
				if(baraja[i] == player.getMano()[j]) baraja[i] = null;
			}
		}
	}
}
