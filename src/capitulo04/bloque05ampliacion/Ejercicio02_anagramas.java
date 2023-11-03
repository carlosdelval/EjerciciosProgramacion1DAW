package capitulo04.bloque05ampliacion;

import tutorialJava.Utils;

public class Ejercicio02_anagramas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = Utils.obtenerCadenaConDescripcion("Introduzca la primera cadena: ");
		
		String s2 = Utils.obtenerCadenaConDescripcion("Introduzca la segunda cadena: ");

		if (sonAnagramas(s1, s2)) System.out.println("Son anagrama.");
		
		else System.out.println("No son anagrama.");

	}

	public static boolean sonAnagramas(String s1, String s2) {

		int a[] = new int[s1.length()];
		
		if(s1.length() != s2.length()) return false;

		for (int i = 0; i < a.length; i++) {

			a[i] = 0;

		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < s2.length(); j++) {

				if (s2.charAt(j) == s1.charAt(i)) {

					a[i] = 1;

				}

			}

		}
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] != 1) return false;
			
		}
		
		return true;
		
	}
}
