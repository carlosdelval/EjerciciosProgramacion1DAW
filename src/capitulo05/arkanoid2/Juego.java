package capitulo05.arkanoid2;

import tutorialJava.Utils;

public class Juego {
	Ladrillo ladrillos[] = new Ladrillo[20];
	Pelota pelota = new Pelota();
	Ladrillo primero;
	Ladrillo ultimo;

	public Juego() {

		do {
			pelota.setX(Utils.obtenerNumeroAzar(0, 800));
			pelota.setY(Utils.obtenerNumeroAzar(0, 500));
			for (int i = 0; i < ladrillos.length; i++) {
				if (ladrillos[i] != null) {
					if (pelota.chocaLadrillo(ladrillos[i])) {
						ladrillos[i].chocaPelota();
						if (ladrillos[i].getPuntosVida() == 0) {
							if (hayLadrillosMuertos(ladrillos) == true) {
								primero = ladrillos[i];
								System.out.println("El primer ladrillo en destruirse ha sido " + primero.toString());
							}
							ladrillos[i] = null;
						}
					}
					if (ladrillos[i] != null)
						System.out.println(ladrillos[i].toString());
				}
			}
		} while (hayLadrillosVivos(ladrillos) == true);

		System.out.println("Final del juego, todos los ladrillos han sido destruidos.");
	}

	/**
	 * Método que recorre el array de ladrillos y comprueba si queda alguno vivo, es
	 * decir, distinto de null.
	 * 
	 * @param ladrillos
	 * @return
	 */

	private boolean hayLadrillosVivos(Ladrillo[] ladrillos) {
		for (int i = 0; i < ladrillos.length; i++) {
			if (ladrillos[i] != null)
				return true;
		}
		return false;
	}

	private boolean hayLadrillosMuertos(Ladrillo[] ladrillos) {
		for (int i = 0; i < ladrillos.length; i++) {
			if (ladrillos[i] == null)
				return false;
		}
		return true;
	}
}
