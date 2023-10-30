package capitulo04.bloque04;

import java.util.Iterator;

import tutorialJava.Utils;

public class Ejercicio06_pasarAMinuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
		
		String min = pasarAMinuscula(s);
		
		System.out.println(min);

	}
	
	public static String pasarAMinuscula(String s) {
		
		String min;
		
		min = s.toLowerCase();
		
		return min;
		
	}

}
