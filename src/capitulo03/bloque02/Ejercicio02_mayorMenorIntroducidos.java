package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio02_mayorMenorIntroducidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, mayor, menor, numeros;
		
		mayor = menor = 0;
		
		System.out.println("Introduzca la cantidad de números deseados: ");
		
		numeros  = sc.nextInt();
		
		for (int i = 0; i < numeros; i++) {
			
			System.out.println("Introduzca un número: ");
			
			num = sc.nextInt();
			
			if(num > mayor) {
				
				mayor = num;
				
			}if(num < menor){
				
				menor = num;
				
			}
			
		}
		
		System.out.println("El número mayor es " + mayor + " y el menor es " + menor);

	}

}
