package capitulo02.bloque01;

import java.util.Scanner;

public class Ejercicio02_pidoDosVariablesMuestroMenor {

	public static void main(String[] args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la primera variable: ");
		num1= sc.nextDouble();
		System.out.println("Introduzca el valor de la segunda variable: ");
		num2= sc.nextDouble();
		
		if(num1>=num2) {
			System.out.println("El número menor es: " + num2);
		}else {
			System.out.println("El número menor es: " + num1);
		}
	}

}
