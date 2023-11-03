package capitulo04.bloque05ampliacion;

import tutorialJava.Utils;

public class Ejercicio01_eliminarRepetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena: ");

		System.out.println(eliminarDuplicados(s));

	}

	public static String eliminarDuplicados(String s) {

		String nueva = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			boolean seRepite = false;
			
			for (int j = i - 1; j > -1 ; j--) {
				
				if(s.charAt(i) == s.charAt(j)) {
					
					 seRepite = true;
					
				}
				
			}
			
			if(seRepite == false) nueva += s.charAt(i);

		}
		
		return nueva;
		
	}
}
