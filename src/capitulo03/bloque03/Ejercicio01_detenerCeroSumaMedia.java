package capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio01_detenerCeroSumaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int suma = 0, numeros = 1, num;

		for (int i = 0; i < i + 1; i++) {

			System.out.println("Introduzca un número:");

			num = sc.nextInt();

			if (num == 0) {

				break;

			} else {

				suma = suma + num;
				
				numeros = i + 1;

			}
			
		}
		System.out.println("La suma de los números es " + suma + ", y la media " + suma / numeros + ".");

	}
}
