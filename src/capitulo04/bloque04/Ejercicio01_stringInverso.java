package capitulo04.bloque04;

import java.util.Scanner;

import tutorialJava.Utils;

public class Ejercicio01_stringInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Utils.obtenerCadenaConDescripcion("Introduzca la cadena de caracteres: ");
		
		stringAlReves(s);
		

	}
	
	public static void stringAlReves(String s) {
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));
			
		}
		
	}

}
