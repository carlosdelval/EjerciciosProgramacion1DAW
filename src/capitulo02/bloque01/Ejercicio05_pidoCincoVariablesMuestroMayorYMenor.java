package capitulo02.bloque01;

import java.util.Scanner;

public class Ejercicio05_pidoCincoVariablesMuestroMayorYMenor {

	public static void main(String[] args) {
		double num1, num2, num3, num4, num5, mayor, menor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la primera variable: ");
		num1= sc.nextDouble();
		mayor=menor=num1;
		System.out.println("Introduzca el valor de la segunda variable: ");
		num2= sc.nextDouble();
		if(mayor<=num2) {
			mayor=num2;
		}
		if(menor>=num2) {
			menor=num2;
		}
		System.out.println("Introduzca el valor de la tercera variable: ");
		num3= sc.nextDouble();
		if(mayor<=num3) {
			mayor=num3;
		}
		if(menor>=num3) {
			menor=num3;
		}
		System.out.println("Introduzca el valor de la cuarta variable: ");
		num4= sc.nextDouble();
		if(mayor<=num4) {
			mayor=num4;
		}
		if(menor>=num4) {
			menor=num4;
		}
		System.out.println("Introduzca el valor de la quinta variable: ");
		num5= sc.nextDouble();
		if(mayor<=num5) {
			mayor=num5;
		}
		if(menor>=num5) {
			menor=num5;
		}
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
	}

}
