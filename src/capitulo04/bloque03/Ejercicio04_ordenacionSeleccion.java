package capitulo04.bloque03;

import tutorialJava.UtilsArrays;

public class Ejercicio04_ordenacionSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[150]; 
		
		UtilsArrays.inicializaArray(a, 0, 1000);
		
		System.out.println("El array es: ");
		
		UtilsArrays.imprimeArray(a);
		
		ordenarSeleccion(a);
		
		System.out.println("El array después de la ordenación es: ");
		
		UtilsArrays.imprimeArray(a);
		
	}
	
    public static void ordenarSeleccion(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < array.length; j++) {
            	
                if (array[j] < array[indiceMinimo]) {
                	
                    indiceMinimo = j;
                    
                }
            }

            int aux = array[i];
            
            array[i] = array[indiceMinimo];
            
            array[indiceMinimo] = aux;
        }
    }

}
