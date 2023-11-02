package capitulo04.bloque05ampliacion;

import tutorialJava.Utils;

public class Ejercicio01_eliminarRepetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena: ");

		System.out.println(eliminarDuplicados(s));

	}
	
	public static String eliminarDuplicados(String s) {
		
		String nueva = s;
		
		boolean hayDuplicados = true;
		
		while (hayDuplicados == true) {
			
			hayDuplicados = false;
			
			String aux = "" + nueva.charAt(0);
			
			for (int i = 0; i < nueva.length(); i++) {
				
				for (int j = i + 1; j < nueva.length(); j++) {
					
					if (nueva.charAt(i) != nueva.charAt(j)) aux += nueva.charAt(j);
					else hayDuplicados = true;
				
				}
			
			}
			
		}
		
		return nueva;

	}
}
