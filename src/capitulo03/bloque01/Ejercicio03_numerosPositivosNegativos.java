package capitulo03.bloque01;

import java.util.Scanner;

public class Ejercicio03_numerosPositivosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int suma, num, numeros, numPositivos, numNegativos;
		
		suma = numPositivos = numNegativos = 0;
		
		System.out.println("Diga el número de enteros a introducir: ");
		
		numeros = sc.nextInt();
		
		for (int i = 0; i < numeros; i++) {
			
			System.out.println("Introduzca un número: ");
			
			num = sc.nextInt();
			
			if(num>0) {
				
				numPositivos ++;
				
			}if(num<0){
				
				numNegativos ++;
				
			}
		}
		
		System.out.println("Hay " + numPositivos + " números positivos y " + numNegativos + " números negativos.");
	}

}