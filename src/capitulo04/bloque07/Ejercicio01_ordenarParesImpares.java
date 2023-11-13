package capitulo04.bloque07;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio01_ordenarParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[20];
		arrayAleatorio(numeros);
		System.out.println("El array sin ordenar es: \n");
		UtilsArrays.imprimeArray(numeros);
		System.out.println();
		ordenarParesImpares(numeros);
		System.out.println("El array ordenado es: \n");
		UtilsArrays.imprimeArray(numeros);

	}

	/**
	 * 
	 * @param n
	 */

	public static void arrayAleatorio(int n[]) {

		for (int i = 0; i < n.length; i++) {
			n[i] = Utils.obtenerNumeroAzar(0, 100);
		}
	}
	
	/**
	 * 
	 * @param n
	 */

	public static void ordenarParesImpares(int n[]) {

		int aux;
		do {
			
			for (int i = 0; i < n.length; i++) {
				int primeraImpar = primeraPosImpar(n);
				int ultimaPar = ultimaPosPar(n);
				
				aux = n[ultimaPar];
				n[ultimaPar] = n[primeraImpar];
				n[primeraImpar] = aux;
			}
			
		}while(primeraPosImpar(n) < ultimaPosPar(n));
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static int primeraPosImpar(int n[]) {
		
		int pos = 0;
		for (int i = 0; i < n.length; i++) {
			if(n[i] % 2 != 0) return i;
		}
		return 0;
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static int ultimaPosPar(int n[]) {
		
		int pos = 0;
		for (int i = n.length - 1; i > -1; i--) {
			if(n[i] % 2 == 0) return i;
		}
		return n.length - 1;
	}
	
	
}
