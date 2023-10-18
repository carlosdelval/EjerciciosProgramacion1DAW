package capitulo04.bloque02;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio03_multiplicarPorNumeroIntroducido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[150];
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		System.out.println("Introduzca el factor: ");
		int num = sc.nextInt();
		
		multiplicaValoresPorFactor(array, num);


	}
	
	public static void multiplicaValoresPorFactor (int a[], int factor) {
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = a[i] * factor;
			
		}
		
	}
}
