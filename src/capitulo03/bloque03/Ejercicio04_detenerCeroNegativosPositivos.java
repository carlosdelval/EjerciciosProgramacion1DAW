package capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio04_detenerCeroNegativosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nPositivos = 0, nNegativos = 0, num;

		for (int i = 0; i < i + 1; i++) {

			System.out.println("Introduzca un número:");

			num = sc.nextInt();

			if (num == 0) {

				break;

			} else {

				if(num > 0) {
					
					nPositivos++;
					
				}if(num < 0){
					
					nNegativos++;
					
				}

			}
		}
		
		System.out.println("Hay " + nPositivos + " números positivos, y " + nNegativos + " números negativos.");

	}

}
