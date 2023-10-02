package capitulo03.bloque01;

import java.util.Scanner;

public class Ejercicio01_sumaMayores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int suma, num;
		suma = 0;
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Introduzca un número: ");
			
			num = sc.nextInt();
			
			if(num>10) {
				suma = suma + num;
			}
		}
		
		System.out.println("La suma de los números mayores de 10 vale: " + suma);
	}

}
