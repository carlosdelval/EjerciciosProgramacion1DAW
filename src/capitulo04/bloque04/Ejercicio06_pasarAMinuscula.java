package capitulo04.bloque04;

import java.util.Iterator;

import tutorialJava.Utils;

public class Ejercicio06_pasarAMinuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
		
		System.out.println(pasarAMinuscula(s));

	}
	
	public static String pasarAMinuscula(String s) {
		
		String res = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				
				res += (char) (s.charAt(i) + 32);
				
			}
			else {
				
				res += s.charAt(i);
				
			}
			
		}
		
		return res;
		
	}

}
