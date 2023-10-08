package capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio02_primoCompuestoLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int limS, limI, i = 2, num;

		boolean esPrimo = true;

		System.out.println("Introduzca el límite inferior: ");

		limI = sc.nextInt();
		
		while(limI <=0) {
			
			System.out.println("El número no es válido, introduzca otro por favor:");
			limI = sc.nextInt();
			
		}

		System.out.println("Introduzca el límite superior: ");

		limS = sc.nextInt();
		
		while(limS < limI) {
			
			System.out.println("El número no es válido, introduzca otro por favor:");
			limS = sc.nextInt();
			
		}

		num = limI;

		while (num <= limS) {

			while (i < num) {

				if (num % i == 0) {

					esPrimo = false;

				}

				i++;

			}

			if (esPrimo == true) {

				System.out.println("El número " + num + " es primo.");

			} else {

				System.out.println("El número " + num + " es compuesto.");

			}
			
			esPrimo = true;
			i = 2;
			num++;

		}
	}
}
