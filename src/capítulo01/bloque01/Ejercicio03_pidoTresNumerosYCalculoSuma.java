package capítulo01.bloque01;

import java.util.Scanner;

public class Ejercicio03_pidoTresNumerosYCalculoSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numDouble1;
		double numDouble2;
		double numDouble3;
		double numDouble4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número de la suma: ");
		numDouble1 = sc.nextDouble();
		System.out.println("Introduzca el segundo número de la suma: ");
		numDouble2 = sc.nextDouble();
		System.out.println("Introduzca el tercer número de la suma: ");
		numDouble3 = sc.nextDouble();
		numDouble4 = numDouble1 + numDouble2 + numDouble3;
		
		System.out.println("La suma de las tres cifras es: " + numDouble4);

	}

}
