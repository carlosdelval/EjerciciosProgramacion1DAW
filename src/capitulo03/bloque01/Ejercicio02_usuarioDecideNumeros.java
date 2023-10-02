package capitulo03.bloque01;

import java.util.Scanner;

public class Ejercicio02_usuarioDecideNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int suma, num, numeros;
		suma = 0;
		System.out.println("Diga el número de enteros a introducir: ");
		numeros = sc.nextInt();
		
		for (int i = 0; i < numeros; i++) {
			
			System.out.println("Introduzca un número: ");
			
			num = sc.nextInt();
			
			if(num>10) {
				suma = suma + num;
			}
		}
		
		System.out.println("La suma de los números mayores de 10 vale: " + suma);
	}

}
