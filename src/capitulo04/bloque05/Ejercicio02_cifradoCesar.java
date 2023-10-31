package capitulo04.bloque05;

import tutorialJava.Utils;

public class Ejercicio02_cifradoCesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int desplazamiento = Utils.obtenerEnteroConDescripcion("Introduzca el desplazamiento deseado: ");
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena: ");
		
		System.out.println(cifradoCesar(s , desplazamiento));

	}
	
	public static String cifradoCesar(String s, int desp) {
		
		String cadena = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			cadena += (char) (s.charAt(i) + desp % 27);
			
		}
		
		return cadena;
		
	}

}
