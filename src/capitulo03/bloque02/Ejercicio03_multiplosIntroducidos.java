package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio03_multiplosIntroducidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num, multiplo;

		System.out.println("Introduzca un número: ");
		num = sc.nextInt();

		for (int i = 1; i < 100; i++) {

			if(num % i == 0) {
				
				System.out.println("El número " + i + " es múltiplo de " + num);
				
			}
		}
	}
}
