package capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio05_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n, m = 1, factorial = 1;

		System.out.println("Introduzca el factorial que desea calcular:");
		n = sc.nextInt();

		if (n > 0) {

			while (m <= n) {

				factorial = factorial * m;

				m++;

			}

			System.out.println("El factorial " + n + "! es igual a " + factorial);

		} else {
			
			if (n == 0) {

				System.out.println("El factorial 0! es igual a 1");

			} else {

				System.out.println("Entrada no válida.");

			}
		}
	}
}
