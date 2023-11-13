package capitulo04.bloque07;

import tutorialJava.Utils;
import tutorialJava.UtilsArrays;

public class Ejercicio02_desplazarIntervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[10];
		rellenarArray(numeros);
		UtilsArrays.imprimeArray(numeros);
		System.out.print(" // (0 - 9)");
		int inicial = Utils.obtenerEnteroConDescripcion("Introduzca la posición inicial: ");
		int fin = Utils.obtenerEnteroConDescripcion("Introduzca la posición final: ");
		
		while(inicial > fin || inicial < 0 || fin < 0 || inicial > 9 || fin > 9) {
			
			System.out.println("Datos incorrectos, introduzca de nuevo.");
			inicial = Utils.obtenerEnteroConDescripcion("Introduzca la posición inicial: ");
			fin = Utils.obtenerEnteroConDescripcion("Introduzca la posición final: ");
		}
		
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
}
