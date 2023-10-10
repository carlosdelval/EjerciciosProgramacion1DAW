package capitulo04.bloque01;

import java.util.Scanner;

public class Ejercicio01_arraySumaMediaMayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;

		int numeros[] = new int[150];

		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) Math.round(Math.random() * 100);
			
		}
		
		System.out.println("El array es: \n");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros [i]);
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			suma = suma + numeros[i];
			
		}
		
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La media de los números es: " + suma / numeros.length);

	}

}
