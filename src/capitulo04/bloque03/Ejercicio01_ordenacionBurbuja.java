package capitulo04.bloque03;

import tutorialJava.UtilsArrays;

public class Ejercicio01_ordenacionBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[150]; 
		
		UtilsArrays.inicializaArray(a, 0, 1000);
		
		System.out.println("El array es: ");
		
		UtilsArrays.imprimeArray(a);
		
		ordenarBurbuja(a);
		
		System.out.println("El array después de la ordenación es: ");
		
		UtilsArrays.imprimeArray(a);
		
	}
	
    public static void ordenarBurbuja(int[] array) {
    	
        boolean intercambiado;
        
        do {
        	
            intercambiado = false;
            
            for (int i = 1; i < array.length; i++) {
            	
                if (array[i - 1] > array[i]) {
                	
                    int aux = array[i - 1];
                    
                    array[i - 1] = array[i];
                    
                    array[i] = aux;
                    
                    intercambiado = true;
                    
                }
                
            }
            
        } while (intercambiado);
        
    }

}
