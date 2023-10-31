package capitulo04.bloque04;

import tutorialJava.Utils;

public class Ejercicio05_comparacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
		
		String s2 = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
	
		if (comparacionCadenas(s1 , s2) == -1) {
			
			System.out.println("Las cadena 1 es menor que la cadena 2.");
			
		}
		
		if (comparacionCadenas(s1 , s2) == 1) {
			
			System.out.println("La cadena 2 es menor que la cadena 1.");
			
		}
		
		if (comparacionCadenas(s1 , s2) == 0) {
			
			System.out.println("Las cadenas son iguales.");
			
		}

	}
	
	public static int comparacionCadenas(String s1, String s2) {
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (s1.length() > i && s2.length() > i) {
				
				if (s1.charAt(i) < s2.charAt(i)) {
					
					return -1;
					
				}
				
				else {
					
					if(s1.charAt(i) > s2.charAt(i)) {
						
						return 1;
						
					}
					
				}
				
			}
			
		}
		
		if (s1.length() < s2.length()) {
			
			return -1;
			
		}
		
		if (s2.length() < s1.length()) {
			
			return 1;
			
		}
		
		return 0;
		
	}

}
