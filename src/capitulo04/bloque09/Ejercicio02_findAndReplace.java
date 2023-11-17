package capitulo04.bloque09;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio02_findAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int [25];
		UtilsArrays.inicializaArray(a, 0, 100);
		UtilsArrays.imprimeArray(a);
		int find = Utils.obtenerEnteroConDescripcion("Introduzca el número a encontrar:");
		int replace = Utils.obtenerEnteroConDescripcion("Introduzca el reemplazo:");
		findAndReplace(a, find, replace);
		UtilsArrays.imprimeArray(a);

	}
	
	/**
	 * 
	 * @param a
	 * @param find
	 * @param replace
	 */
	
	public static void findAndReplace(int a[], int find, int replace) {
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == find) a[i] = replace;
		}
	}

}
