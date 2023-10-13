package capitulo04.bloque01;

import java.util.Scanner;

public class Ejercicio05_sumaParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sumaPares = 0, sumaImpares = 0;
		
		int numeros[] = new int[150];

		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) Math.round(Math.random() * 100);
			
			if(numeros[i] % 2 == 0) {
				
				sumaPares = sumaPares + numeros[i];
				
			}else {
				
				sumaImpares = sumaImpares + numeros[i];
				
			}
			
		}
		
		System.out.println("La suma de los pares es: " + sumaPares + ".\nLa suma de los impares es: " + sumaImpares + ".");

	}

}
