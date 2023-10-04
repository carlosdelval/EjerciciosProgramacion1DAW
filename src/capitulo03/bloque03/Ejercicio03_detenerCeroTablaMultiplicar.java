package capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio03_detenerCeroTablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		for (int i = 0; i < i + 1; i++) {

			System.out.println("Introduzca un número:");

			num = sc.nextInt();

			if (num == 0) {

				break;

			} else {
					
				for (int j = 0; j < 11; j++) {
					
					System.out.println(num + " x " + j + " = " + num*j);
					
				}
				
				}

			}
		System.out.println("El número 0 ha sido introducido, fin del bucle.");
		}
	}

