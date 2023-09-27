package capitulo02.bloque01;

import java.util.Scanner;

public class Ejercicio07_parImparConAndIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		int num = sc.nextInt();
		
		if((num & 1) == 0) {
			System.out.println(num + " es un número par.");
		}else {
			System.out.println(num + " es un número impar.");
		}
	}

}
