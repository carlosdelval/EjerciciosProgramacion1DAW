package capitulo04.bloque09;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio03_addInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [25];
		UtilsArrays.inicializaArray(a, 0, 100);
		UtilsArrays.imprimeArray(a);
		int n = Utils.obtenerEnteroConDescripcion("Introduzca el número a añadir:");
		a = addInteger(a, n);
		UtilsArrays.imprimeArray(a);
	}
	
	/**
	 * 
	 * @param a
	 * @param add
	 * @return
	 */
	
	public static int[] addInteger(int a[], int add) {
		
		int a2[] = new int [a.length + 1];
		for (int i = 0; i < a.length; i++) {
			a2[i] = a[i];
		}
		a2[a.length] = add;
		return a2;
	}

}
