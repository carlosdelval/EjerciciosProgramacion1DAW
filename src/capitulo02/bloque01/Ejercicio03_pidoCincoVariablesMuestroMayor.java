package capitulo02.bloque01;

import java.util.Scanner;

public class Ejercicio03_pidoCincoVariablesMuestroMayor {

	public static void main(String[] args) {
		double num1, num2, num3, num4, num5, mayor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la primera variable: ");
		num1= sc.nextDouble();
		
		mayor=num1;
		
		System.out.println("Introduzca el valor de la segunda variable: ");
		num2= sc.nextDouble();
		
		if(mayor<=num2) {
			mayor=num2;
		}
		
		System.out.println("Introduzca el valor de la tercera variable: ");
		num3= sc.nextDouble();
		
		if(mayor<=num3) {
			mayor=num3;
		}
		
		System.out.println("Introduzca el valor de la cuarta variable: ");
		num4= sc.nextDouble();
		
		if(mayor<=num4) {
			mayor=num4;
		}
		
		System.out.println("Introduzca el valor de la quinta variable: ");
		num5= sc.nextDouble();
		if(mayor<=num5) {
			mayor=num5;
		}
		
		System.out.println("El número mayor es: " + mayor);
	}

}
