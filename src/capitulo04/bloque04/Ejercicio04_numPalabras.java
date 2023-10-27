package capitulo04.bloque04;

import tutorialJava.Utils;

public class Ejercicio04_numPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
		
		int numPal = numPalabras(s);
		
		System.out.println("Hay " + numPal + " palabras en la cadena.");
		

	}
	
	public static int numPalabras(String s) {
		
		int cont = 1;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == 32 && s.charAt(i+1) != 32) {
				
				cont++;
				
			}
			
		}
		
		return cont;
		
	}

}
