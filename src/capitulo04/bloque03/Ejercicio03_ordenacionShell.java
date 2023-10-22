package capitulo04.bloque03;

import tutorialJava.UtilsArrays;

public class Ejercicio03_ordenacionShell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[150]; 
		
		UtilsArrays.inicializaArray(a, 0, 1000);
		
		System.out.println("El array es: ");
		
		UtilsArrays.imprimeArray(a);
		
		ordenarShell(a);
		
		System.out.println("El array después de la ordenación es: ");
		
		UtilsArrays.imprimeArray(a);
		
	}
	
	public static void ordenarShell(int[] array) {

		int shell = 10;

		do {

			for (int i = 0; i < array.length; i++) {

				for (int j = i; j < array.length - shell; j++) {

					if (array[j] > array[j + shell]) {

						int aux = array[j + shell];

						array[j + shell] = array[j];

						array[j] = aux;

					}
				}
			}

			shell /= 2;

		} while (shell > 0);

	}
}
