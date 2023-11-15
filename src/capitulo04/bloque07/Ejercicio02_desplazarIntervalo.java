package capitulo04.bloque07;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio02_desplazarIntervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[10];
		rellenarArray(numeros);
		UtilsArrays.imprimeArray(numeros);
		System.out.print("// (0 - 9)\n");
		int inicial = Utils.obtenerEnteroConDescripcion("Introduzca la posición inicial: ");
		int fin = Utils.obtenerEnteroConDescripcion("Introduzca la posición final: ");
		
		while(inicial > fin || inicial < 0 || fin < 0 || inicial > 9 || fin > 9) {
			
			System.out.println("Datos incorrectos, introduzca de nuevo.");
			inicial = Utils.obtenerEnteroConDescripcion("Introduzca la posición inicial: ");
			fin = Utils.obtenerEnteroConDescripcion("Introduzca la posición final: ");
		}
		desplazarArray(numeros, inicial, fin);
		UtilsArrays.imprimeArray(numeros);
	}
	
	/**
	 * 
	 * @param n
	 */
	
	public static void rellenarArray(int n[]) {
		
		for (int i = 0; i < n.length; i++) {
			n[i] = Utils.obtenerEnteroConDescripcion("Introduzca un valor: ");
		}
	}
	
	/**
	 * 	
	 * @param n
	 * @param min
	 * @param max
	 */
	
	public static void desplazarArray(int n[], int min, int max) {
		
		int aux = n[n.length - 2];
		for (int i = n.length - 2; i > 0; i--) {
			if(i > max -1 || i < min - 1) {
				n[i] = n[i - 1];
			}
		}
		n[0] = n[n.length - 1];
		n[n.length - 1] = aux;
	}
}
