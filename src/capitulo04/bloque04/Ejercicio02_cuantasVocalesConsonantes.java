package capitulo04.bloque04;

import java.util.Scanner;

import tutorialJava.Utils;

public class Ejercicio02_cuantasVocalesConsonantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres sin tildes ni Ñ: ");

		cuantasVocalesConsonantes(s);

	}

	public static void cuantasVocalesConsonantes(String s) {

		int vocales = 0, consonantes = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 97 | s.charAt(i) == 101 | s.charAt(i) == 105 | s.charAt(i) == 111 | s.charAt(i) == 117
					| s.charAt(i) == 65 | s.charAt(i) == 69 | s.charAt(i) == 73 | s.charAt(i) == 79
					| s.charAt(i) == 85) {

				vocales++;

			}

			else {

				if (s.charAt(i) != 32) {

					consonantes++;

				}
			}

		}

		System.out.println("El número de vocales es " + vocales + ".");
		System.out.println("El número de consonantes es " + consonantes + ".");

	}

}
