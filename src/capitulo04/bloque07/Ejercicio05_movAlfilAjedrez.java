package capitulo04.bloque07;

import java.util.Scanner;

import tutorialJava.Utils;

public class Ejercicio05_movAlfilAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int fila = Utils.obtenerEnteroConDescripcion("Introduzca la primera coordenada: ");
		int columna = Utils.obtenerEnteroConDescripcion("Introduzca la segunda coordenada: ");
		while (fila < 1 || fila > 8 || columna < 1 || columna > 8) {

			System.out.println("Posición incorrecta, repita de nuevo por favor: ");
			fila = Utils.obtenerEnteroConDescripcion("Introduzca la primera coordenada: ");
			columna = Utils.obtenerEnteroConDescripcion("Introduzca la segunda coordenada: ");
		}
		System.out.println("El alfil se encuentra en la coordenada " + fila + numALetra(columna));
		movAlfil(fila, columna);

	}

	/**
	 * He tenido que recurrir a los if del principio en este método para que no se me saliera en el siguiente método de la length del String,
	 * no he encontrado otra manera de hacerlo.
	 * @param n
	 * @return
	 */

	public static char numALetra(int n) {
		
		if(n == 9) n--;
		if(n == -1) n += 2;
		n--;
		String ABC = "ABCDEFGH";
		char aux = ABC.charAt(n);
		return aux;
	}

	/**
	 * Utilizo un while para cada movimiento en diagonal, intentando mediante ifs que si la coordenada se encuentra pegada a un lateral
	 * entre o deje de entrar en los whiles, y limitando los movimientos con un tope jugando con el 1 y 8
	 * @param f
	 * @param c
	 */

	public static void movAlfil(int f, int c) {

		int auxf = f;
		int auxc = c;
		System.out.println("El alfil puede desplazarse a las posiciones: ");
		if (f != 1) {
			while (f > 1 && c < 8) {
				System.out.print(f - 1 + "-" + numALetra(c + 1) + " ");
				if (f > 1)
					f--;
				if (c < 8)
					c++;
			}
		}
		f = auxf;
		c = auxc;
		if (c != 1) {
			while (c > 1 && f < 8) {
				System.out.print(f + 1 + "-" + numALetra(c - 1) + " ");
				if (c > 1)
					c--;
				if (f < 8)
					f++;
			}
		}
		f = auxf;
		c = auxc;
		while (c < 8 && f < 8) {
			System.out.print(f + 1 + "-" + numALetra(c + 1) + " ");
			if (c < 8)
				c++;
			if (f < 8)
				f++;
		}
		f = auxf;
		c = auxc;
		while (c > 1 && f > 1) {
			System.out.print(f - 1 + "-" + numALetra(c - 1) + " ");
			if (c > 1)
				c--;
			if (f > 1)
				f--;
		}
	}
}
