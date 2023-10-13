package capitulo04.bloque01;

import java.util.Scanner;

public class Ejercicio02_numerosAzarLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int numeros[] = new int[150];
		
		int limI, limS;
		
		System.out.println("Introduzca el límite inferior: ");
		limI = sc.nextInt();
		
		System.out.println("Introduzca el límite superior: ");
		limS = sc.nextInt();
		
		while(limI > limS | limI < 0 | limS < 0) {
			
			System.out.println("Los límites no son válidos, introduzca de nuevo.\n");
			
			System.out.println("Introduzca el límite inferior: ");
			limI = sc.nextInt();
			
			System.out.println("Introduzca el límite superior: ");
			limS = sc.nextInt();
		
		}

		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) (Math.round(Math.random() * (limS - limI)) + limI);
			
		}
		
		System.out.println("El array es: \n");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros [i]);
			
		}

	}

}
