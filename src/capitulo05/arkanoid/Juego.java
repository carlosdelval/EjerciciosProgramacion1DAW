package capitulo05.arkanoid;

import java.util.Scanner;

import tutorialJava.Utils;

public class Juego {
		Scanner sc = new Scanner (System.in);
		private ladrillo[] ladrillos = new ladrillo[20];
		private Pelota bola = new Pelota();
		
		public Juego() {
			int primero = 0, ultimo = 0;
			inicializaLadrillos(ladrillos);
			
			//Bucle que se ejecuta mientras siga habiendo ladrillos en el array.
			do {
				//Imprimo el estado de los ladrillos que quedan.
				for (int i = 0; i < ladrillos.length; i++) {
					System.out.println(ladrillos[i].toString(i) + "   ");
				}
				sc.nextLine();
				//Le doy valores random a la coord de la bola.
				bola.setX(Utils.obtenerNumeroAzar(0, 800));
				bola.setY(Utils.obtenerNumeroAzar(0, 500));
				
				//Compruebo si la bola golpea a un ladrillo y si lo golpea y al bajarle la vida es 0 lo elimino del array.
				for (int i = 0; i < ladrillos.length; i++) {
					if(bola.golpeaLadrillo(ladrillos[i])) ladrillos[i].recibirGolpe();
					if(ladrillos[i].getPuntosVida() == 0) {
						if(ladrillos.length == 20) primero = i + 1;
						if(ladrillos.length == 1) ultimo = i + 1;
						ladrillos = eliminarLadrillo(ladrillos, i);
					}
				}
			}while(ladrillos.length > 0);
			System.out.println("Fin del juego! Se han eliminado todos los ladrillos.");
			System.out.println("El primer ladrillo en caer ha sido el número " + primero);
			System.out.println("El último ladrillo en caer ha sido el número " + ultimo);
		}
		
		/**
		 * Método que elimina un ladrillo del array.
		 * @param ladrillos
		 * @param eliminado
		 */
		
		private ladrillo[] eliminarLadrillo(ladrillo[] ladrillos, int eliminado) {
			ladrillo[] ladrillos2 = new ladrillo[ladrillos.length - 1];
			int aux = 0;
			for (int i = 0; i < ladrillos.length; i++) {
				if(ladrillos[i] != ladrillos[eliminado]) {
					ladrillos2[aux] = ladrillos[i];
					aux++;
				}
			}
			return ladrillos2;
		}
		
		/**
		 * Método que inicializa el array de ladrillos.
		 */
		
		private void inicializaLadrillos(ladrillo[] ladrillos) {
			for (int i = 0; i < ladrillos.length; i++) {
				ladrillos[i] = new ladrillo();
			}
		}
}
