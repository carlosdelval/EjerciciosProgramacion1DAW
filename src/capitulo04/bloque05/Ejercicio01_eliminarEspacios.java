package capitulo04.bloque05;

import tutorialJava.Utils;

public class Ejercicio01_eliminarEspacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena: ");
		
		System.out.println(eliminaEspacios(s));

	}
	
	public static String eliminaEspacios(String s) {
		
		String cadena = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) != ' ') {
				
				cadena += s.charAt(i);
					
				}
				
			}
		
		return cadena;
			
		}

}
