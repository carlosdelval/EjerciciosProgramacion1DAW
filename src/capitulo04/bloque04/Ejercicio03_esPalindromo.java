package capitulo04.bloque04;

import tutorialJava.Utils;

public class Ejercicio03_esPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
		
		if(esPalindromo(s) == true) {
			
			System.out.println("Es palíndromo.");
			
		}else {
			
			System.out.println("No es palíndromo.");
			
		}

	}
	
	public static boolean esPalindromo(String s) {
		
		int i = 0, j = s.length()-1;
		
		while (i < j) {
			
			if ( s.charAt(i) != s.charAt(j)) {
				
				return false;
				
			}
			
			i++;
			j--;
			
		}
		
		return true;
		
	}

}
