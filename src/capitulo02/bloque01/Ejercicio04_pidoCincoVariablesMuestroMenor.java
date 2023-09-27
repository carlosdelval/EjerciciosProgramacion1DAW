package capitulo02.bloque01;

import java.util.Scanner;

public class Ejercicio04_pidoCincoVariablesMuestroMenor {

	public static void main(String[] args) {
		double num1, num2, num3, num4, num5, menor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la primera variable: ");
		num1= sc.nextDouble();
		
		menor=num1;
		
		System.out.println("Introduzca el valor de la segunda variable: ");
		num2= sc.nextDouble();
		
		if(menor>=num2) {
			menor=num2;
		}
		
		System.out.println("Introduzca el valor de la tercera variable: ");
		num3= sc.nextDouble();

		if(menor>=num3) {
			menor=num3;
		}
		
		System.out.println("Introduzca el valor de la cuarta variable: ");
		num4= sc.nextDouble();
		
		if(menor>=num4) {
			menor=num4;
		}
		System.out.println("Introduzca el valor de la quinta variable: ");
		num5= sc.nextDouble();

		if(menor>=num5) {
			menor=num5;
		}
		
		System.out.println("El número mayor es: " + menor);
	}

}
