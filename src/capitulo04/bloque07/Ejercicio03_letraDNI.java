package capitulo04.bloque07;

import tutorialJava.Utils;

public class Ejercicio03_letraDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int dni = Utils.obtenerEnteroConDescripcion("Introduzca los dígitos de su DNI: ");
		
		while(dni < 9999999 || dni > 99999999){
			
			System.out.println("DNI no válido. Introduzca de nuevo: ");
			dni = Utils.obtenerEnteroConDescripcion("Introduzca los dígitos de su DNI: ");
		}
		
		if(calcularLetra(dni, letras) == 'o') System.out.println("DNI no válido.");
		else System.out.println("La letra de su DNI es: " + calcularLetra(dni, letras) + ".");
	}
	
	public static char calcularLetra(int n, String a) {
		
		char aux = 'o';
		n = n % 23;
		if(n > 0 && n <= 22) aux = a.charAt(n);
		return aux;
	}
}
