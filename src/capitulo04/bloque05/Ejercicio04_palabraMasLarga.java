package capitulo04.bloque05;

import tutorialJava.Utils;

public class Ejercicio04_palabraMasLarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena: ");

		System.out.println("La palabra más larga es: " + palabraMasLarga(s));

	}

	public static String palabraMasLarga(String s) {

		s = s + " ";

		String larga = "";

		for (int i = 0; i < s.length(); i++) {
			
			int count = 0;
			
			String aux = "";

			while (s.charAt(i) != ' ' && i < s.length()) {

				count++;

				aux += s.charAt(i);

				i++;

			}

			if (aux.length() > larga.length()) {

				larga = aux;

			}

		}
		
		return larga;

	}

}
