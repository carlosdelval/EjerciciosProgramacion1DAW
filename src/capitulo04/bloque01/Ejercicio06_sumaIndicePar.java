package capitulo04.bloque01;

import java.util.Scanner;

public class Ejercicio06_sumaIndicePar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		
		int numeros[] = new int[150];

		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) Math.round(Math.random() * 100);
			
		}
		
        for (int i = 0; i < numeros.length; i += 2) {
        	
            suma = suma + numeros[i];
            
        }
        
        System.out.println("La suma de los números cuyo índice es par es: " + suma + ".");

	}

}
