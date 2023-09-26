package capitulo02.bloque01;

import java.util.Scanner;

public class Ejercicio06_pidoNumeroIndicoParOImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		num = sc.nextDouble();
		if(num%2 == 1) {
			System.out.println("El número es impar.");
		}else {
			System.out.println("El número es par.");
		}
	}

}
