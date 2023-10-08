package capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio01_primoNoPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num, i = 2;
		
		boolean esPrimo = true;
		
		System.out.println("Introduzca un número: ");
		
		num = sc.nextInt();
		
		while(num <=0) {
			
			System.out.println("El número no es válido, introduzca otro por favor:");
			num = sc.nextInt();
			
		}
		
		
		while(i < num) {
			
			if(num % i == 0) {
				
				esPrimo = false;
				
			}
			
			i++;
			
		}
		
		if(esPrimo == true) {
			
			System.out.println("El número " + num + " es primo.");
			
		}else {
			
			System.out.println("El número " + num + " es compuesto.");
			
		}

	}

}
