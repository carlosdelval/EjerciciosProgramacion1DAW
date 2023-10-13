package capitulo04.bloque01;

import java.util.Scanner;

public class Ejercicio04_buscarEnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[150];
		
		boolean encontrado = false;

		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) Math.round(Math.random() * 100);
			
		}
		
		System.out.println("Introduzca el valor a buscar: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] == num) {
				
				System.out.println("El valor " + num + " se encuentra en la posición " + i + ".");
				
				encontrado = true;
				
			}
			
		}
		
		if(encontrado == false) {
			
			System.out.println("El valor no ha sido encontrado.");
	}

}
}
