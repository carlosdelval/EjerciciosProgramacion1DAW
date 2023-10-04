package capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio02_detenerCeroMenorYMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int mayor = 0, menor = 0, num;

		for (int i = 0; i < i + 1; i++) {

			System.out.println("Introduzca un número:");

			num = sc.nextInt();

			if (num == 0) {

				break;

			} else {

				if(num > mayor) {
					
					mayor = num;
					
				}if(num < menor){
					
					menor = num;
					
				}

			}
		}
		
		System.out.println("El número mayor es " + mayor + ", y el menor es " + menor + ".");

	}
}
