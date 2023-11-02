package capitulo04.bloque05;

import java.util.Iterator;

import tutorialJava.Utils;

public class Ejercicio05_invertirPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena: ");

		System.out.println(invertirPalabras(s));

	}

	public static String invertirPalabras(String s) {
		
		s += " ";

		String inverso = "";
		
		String aux = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				
				aux += s.charAt(i);
				
			}

			else {

				for (int j = aux.length() - 1; j > -1; j--) {

					inverso += aux.charAt(j);

				}
				
				inverso += " ";
				
				aux = "";

			}
			

		}

		return inverso;

	}

}
