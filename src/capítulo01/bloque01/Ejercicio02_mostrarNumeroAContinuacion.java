package capítulo01.bloque01;

import java.util.Scanner;

public class Ejercicio02_mostrarNumeroAContinuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEntero;
		float numFlotante;
		double numDouble;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		numEntero = sc.nextInt();
		System.out.println("El entero es: " + numEntero);
		System.out.println("Introduzca un número flotante: ");
		numFlotante = sc.nextFloat();
		System.out.println("El flotante es: " + numFlotante);
		System.out.println("Introduzca un número double: ");
		numDouble = sc.nextDouble();
		System.out.println("El double es: " + numDouble);
	}

}
