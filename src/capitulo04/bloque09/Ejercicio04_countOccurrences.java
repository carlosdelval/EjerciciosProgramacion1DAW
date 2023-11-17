package capitulo04.bloque09;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio04_countOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int [25];
		UtilsArrays.inicializaArray(a, 0, 100);
		UtilsArrays.imprimeArray(a);
		int n = Utils.obtenerEnteroConDescripcion("Introduzca el número a encontrar:");
		int count = countOccurrences(a, n);
		System.out.println("El número " + n + " se repite " + count + " veces en el array.");
	}
	
	/**
	 * 
	 * @param a
	 * @param n
	 * @return
	 */
	
	public static int countOccurrences(int a[], int n) {
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == n) count++;
		}
		return count;
	}

}
