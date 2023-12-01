package capitulo05.poker;

import tutorialJava.Utils;

public class Jugador {
	String nombre;
	Carta mano[] = new Carta[5];

	public Carta[] getMano() {
		return mano;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String newNombre) {
		nombre = newNombre;
	}
	public void setMano(Carta[] baraja) {
		boolean hayRepeticion = true;
		for (int i = 0; i < mano.length; i++) {
			mano[i] = baraja[Utils.obtenerNumeroAzar(0, 51)];
			while (hayRepeticion) {
				hayRepeticion = false;
				for (int j = 0; j < baraja.length; j++) {
					if (i != j && mano[i] == mano[j])
						hayRepeticion = true;
				}
			}
		}
	}
}
