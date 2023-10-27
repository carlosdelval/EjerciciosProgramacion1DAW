package capitulo04.bloque04;

import tutorialJava.Utils;

public class Ejercicio03_esPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
		
		boolean esPalindromo = esPalindromo(s);
		
		if(esPalindromo = true) {
			
			System.out.println("Es palíndromo.");
			
		}else {
			
			System.out.println("No es palíndromo.");
			
		}

	}
	
	public static boolean esPalindromo(String s) {
		
		boolean esPal = true;
		
		int j = 0;
		
		char array[] = new char[s.length()];
		
		for (int i = s.length() - 1; i >= 0; i--) {
			
			array[j] = s.charAt(i);
			
			j++;
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] != s.charAt(i)) {
				
				esPal = false;
				
			}
			
		}
		
		return esPal;
		
	}

}
