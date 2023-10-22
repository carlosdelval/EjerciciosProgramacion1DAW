package capitulo04.bloque03;

import tutorialJava.UtilsArrays;

public class Ejercicio02_ordenacionInsercionDirecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[150]; 
		
		UtilsArrays.inicializaArray(a, 0, 1000);
		
		System.out.println("El array es: ");
		
		UtilsArrays.imprimeArray(a);
		
		ordenarInsercionDirecta(a);
		
		System.out.println("El array después de la ordenación es: ");
		
		UtilsArrays.imprimeArray(a);
		
		
	}
	
	public static void ordenarInsercionDirecta(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			
			int actual = array[i];
			
			int j = i - 1;

			while (j >= 0 && array[j] > actual) {
				
				array[j + 1] = array[j];
				
				j--;
				
			}

			array[j + 1] = actual;
			
		}
	}
}
