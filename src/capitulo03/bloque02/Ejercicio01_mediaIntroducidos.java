package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio01_mediaIntroducidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int suma = 0, num, numeros;
		
		System.out.println("Introduzca la cantidad de números deseados: ");
		
		numeros  = sc.nextInt();
		
		for (int i = 0; i < numeros; i++) {
			
			System.out.println("Introduzca un número: ");
			
			num = sc.nextInt();
			
			suma = suma + num;
			
		}
		
		System.out.println("La media de los números introducidos es: " + (float)suma/numeros);

	}

}
