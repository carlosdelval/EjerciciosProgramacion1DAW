package capitulo04.bloque02;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio03_multiplicarPorNumeroIntroducido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[150];
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		UtilsArrays.imprimeArray(array);
		
		System.out.println("Introduzca el factor: ");
		int n = sc.nextInt();
		
		multiplicaValoresPorFactor(array, n);
		
		UtilsArrays.imprimeArray(array);


	}
	
	public static void multiplicaValoresPorFactor (int a[], int factor) {
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = a[i] * factor;
			
		}
		
	}
}
