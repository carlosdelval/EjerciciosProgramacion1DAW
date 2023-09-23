package capítulo01.bloque01;

import java.util.Scanner;

public class Ejercicio05_pidoVariablesEIntercambioValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double double1;
		double double2;
		double double3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la primera variable: ");
		double1= sc.nextDouble();
		System.out.println("El valor de la primera variable es: " + double1);
		System.out.println("Introduzca el valor de la segunda variable: ");
		double2= sc.nextDouble();
		System.out.println("El valor de la segunda variable es: " + double2);
		double3= double1;
		double1= double2;
		double2= double3;
		
		System.out.println("Después del intercambio, el valor de la primera variable es: " + double1
				+ ", y el valor de la segunda es: " + double2);

	}

}
