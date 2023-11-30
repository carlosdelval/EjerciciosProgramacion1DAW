package capitulo05.poker;

public class Baraja {
	Carta baraja[] = new Carta[52];
	
	/**
	 * Método que inicializa la baraja de cartas.
	 * @param baraja
	 */
	
	public void inicializaBaraja(Carta[] baraja) {
		int idSetter = 1;
		for (int i = 0; i < 13; i++) {
			baraja[i] = new Carta(i + 1, "picas", idSetter);
			idSetter++;
		}
		for (int i = 13; i < 26; i++) {
			baraja[i] = new Carta(i + 1, "diamantes", idSetter);
			idSetter++;
		}
		for (int i = 26; i < 39; i++) {
			baraja[i] = new Carta(i + 1, "tréboles", idSetter);
			idSetter++;
		}
		for (int i = 39; i < 52; i++) {
			baraja[i] = new Carta(i + 1, "corazones", idSetter);
			idSetter++;
		}
	}
}
