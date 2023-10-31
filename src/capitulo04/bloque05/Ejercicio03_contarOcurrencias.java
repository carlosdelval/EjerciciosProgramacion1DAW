package capitulo04.bloque05;

import tutorialJava.Utils;

public class Ejercicio03_contarOcurrencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena: ");
		
		String sub = Utils.obtenerCadenaConDescripcion("Introduzca la subcadena a encontrar: ");
		
		System.out.println("El número de veces que se ha encontrado la subcadena es: " + contarOcurrencias(s,sub));

	}
	
	public static int contarOcurrencias(String s, String sub) {
		
		int ocur = 0;
		
		String aux = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == sub.charAt(0)) {
				
				for (int j = i; j < i + sub.length(); j++) {
					
					aux += s.charAt(j);
					
				}
				
				if(aux == sub) {
					
					ocur++;
					
				}
				
				aux = "";
				
			}
			
		}
		
		return ocur;
		
	}

}
