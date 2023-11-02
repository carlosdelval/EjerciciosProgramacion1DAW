package capitulo04.bloque05;

import tutorialJava.Utils;

public class Ejercicio06_pangramas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena, sin tildes o puntuaciones: ");

		if (pangrama(s)) System.out.println("Es un pangrama.");
		
		else System.out.println("No es un pangrama.");

	}
	
	public static boolean pangrama(String s) {
		
		int a[] = new int[26];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = 0;
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < s.length(); j++) {
				
				if((s.charAt(j) >= 65 + i && s.charAt(j) <= 90) || (s.charAt(j) >= 97 + i && s.charAt(j) <= 122)) {
					
					a[i] = 1;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] != 1) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

}
