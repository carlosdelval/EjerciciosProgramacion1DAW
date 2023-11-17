package capitulo04.bloque09;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio05_removeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[100];
		UtilsArrays.inicializaArray(a, 0, 100);
		UtilsArrays.imprimeArray(a);
		int n = Utils.obtenerEnteroConDescripcion("Introduzca el número a eliminar:");
		a = removeInteger(a, n);
		UtilsArrays.imprimeArray(a);
	}
	
	/**
	 * 
	 * @param a
	 * @param n
	 * @return
	 */

	public static int[] removeInteger(int a[], int n) {

		if (countOccurrences(a, n) == 0)
			return a;
		int l = countOccurrences(a, n);
		int a2[] = new int[a.length - l];
		int j = 0;
		while (j < a2.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != n) {
					a2[j] = a[i];
					j++;
				}
			}
		}
		return a2;
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
			if (a[i] == n)
				count++;
		}
		return count;
	}

}
