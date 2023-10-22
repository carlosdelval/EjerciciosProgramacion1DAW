package capitulo04.bloque02;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio06_elegirPosicionesDireccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca las posiciones que desea desplazar el array de 5 elementos hacia la derecha:");
		
		int posicion = sc.nextInt();
		
		while(posicion > 5 | posicion < 0) {
			
			System.out.println("El número de posiciones no puede ser negativo o mayor al número de elementos del array, repita por favor:");
			
			posicion = sc.nextInt();
			
		}
		
		System.out.println("Introduzca el sentido en el que desea desplazar los valores (-1 para la izquierda, 1 para la derecha): ");
		
		int sentido = sc.nextInt();
		
		while(sentido == 0 | sentido < -1 | sentido > 1) {
			
			System.out.println("Por favor, introduzca -1 para la izquierda o 1 para la derecha: ");
			
			sentido = sc.nextInt();
			
		}
		
		int array[] = new int[5];
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		System.out.println("El array es: ");
		
		UtilsArrays.imprimeArray(array);
		
		desplazaPosicionesDerecha(array, posicion, sentido);
		
		System.out.println("El array después del desplazamiento es: ");
		
		UtilsArrays.imprimeArray(array);



	}
	
	public static void desplazaPosicionesDerecha (int a[], int pos, int sent) {
		
		int arrayAux[] = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			
			int n = (i + pos * sent) % a.length;
			
			if( n < 0 ) {
				
				n += a.length;
				
			}
			
			arrayAux[n] = a[i];
			
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = arrayAux[i];
			
		}
				
		}
	
}

