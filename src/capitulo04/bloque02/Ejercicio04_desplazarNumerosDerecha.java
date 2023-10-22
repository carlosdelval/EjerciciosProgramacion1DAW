package capitulo04.bloque02;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio04_desplazarNumerosDerecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[5];
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		System.out.println("El array es: ");
		
		UtilsArrays.imprimeArray(array);
		
		desplazaCiclicoDerecha(array);
		
		System.out.println("El array después del desplazamiento es: ");
		
		UtilsArrays.imprimeArray(array);



	}
	
	public static void desplazaCiclicoDerecha (int a[]) {
		
		int arrayAux[] = new int[5];
		
		for (int i = 0; i < a.length - 1; i++) {
			
			arrayAux[i+1] = a[i];
			
		}
		
		arrayAux[0] = a[a.length - 1];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = arrayAux[i];
			
		}
				
		}
	
}

