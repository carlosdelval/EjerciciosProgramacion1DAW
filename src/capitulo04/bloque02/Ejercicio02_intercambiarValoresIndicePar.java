package capitulo04.bloque02;

import tutorialJava.UtilsArrays;

public class Ejercicio02_intercambiarValoresIndicePar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = new int[150];
		
		int array2[] = new int[150];
		
		int array3[];
		
		UtilsArrays.inicializaArray(array1, 0, 100);
		
		UtilsArrays.inicializaArray(array2, 0, 100);
        
        array3 = creaTercerArray(array1, array2);
        
        UtilsArrays.imprimeArray(array3);

	}
	
	public static int[] creaTercerArray (int a1[], int a2[]) {
		
		int a[] = new int[a1.length];
		
        for (int i = 1; i < a1.length; i += 2) {
        	
            a[i] = a1[i];
            
        }
        
        for (int i = 0; i < a2.length; i += 2) {
        	
            a[i] = a2[i];
            
        }
        
        return a;
		
	}

}
