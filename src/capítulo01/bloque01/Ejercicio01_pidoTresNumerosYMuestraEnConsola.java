package capítulo01.bloque01;

import java.util.Scanner;

public class Ejercicio01_pidoTresNumerosYMuestraEnConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEntero;
		float numFlotante;
		double numDouble;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		numEntero = sc.nextInt();
		System.out.println("Introduzca un número flotante: ");
		numFlotante = sc.nextFloat();
		System.out.println("Introduzca un número double: ");
		numDouble = sc.nextDouble();
		
		System.out.println("El entero es: " + numEntero + " el flotante es: " + numFlotante + " el double es: " + numDouble);

		
		
	}

}
