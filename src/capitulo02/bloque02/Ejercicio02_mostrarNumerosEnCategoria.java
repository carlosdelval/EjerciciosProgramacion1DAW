package capitulo02.bloque02;

import java.util.Scanner;

public class Ejercicio02_mostrarNumerosEnCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2, num3, num4, num5;
		int numNegativos, numBajos, numMedios, numGrandes;
		numNegativos = numBajos = numMedios = numGrandes = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el valor de la primera variable: ");
		num1 = sc.nextDouble();
		
		if(num1<0) {
			numNegativos= numNegativos + 1;
		}if(num1 >= 0 && num1 <= 25) {
			numBajos = numBajos + 1;
		}if(num1 >= 26 && num1 <= 250) {
			numMedios = numMedios + 1;
		}if (num1 > 250) {
			numGrandes = numGrandes + 1;
		}
		
		
		System.out.println("Introduzca el valor de la segunda variable: ");
		num2= sc.nextDouble();
		
		if(num2<0) {
			numNegativos= numNegativos + 1;
		}if(num2 >= 0 && num2 <= 25) {
			numBajos = numBajos + 1;
		}if(num2 >= 26 && num2 <= 250) {
			numMedios = numMedios + 1;
		}if (num2 > 250) {
			numGrandes = numGrandes + 1;
		}
		
		
		System.out.println("Introduzca el valor de la tercera variable: ");
		num3= sc.nextDouble();
		
		if(num3<0) {
			numNegativos= numNegativos + 1;
		}if(num3 >= 0 && num3 <= 25) {
			numBajos = numBajos + 1;
		}if(num3 >= 26 && num3 <= 250) {
			numMedios = numMedios + 1;
		}if (num3 > 250) {
			numGrandes = numGrandes + 1;
		}
		
		
		System.out.println("Introduzca el valor de la tercera variable: ");
		num4= sc.nextDouble();
		
		if(num4<0) {
			numNegativos= numNegativos + 1;
		}if(num4 >= 0 && num4 <= 25) {
			numBajos = numBajos + 1;
		}if(num4 >= 26 && num4 <= 250) {
			numMedios = numMedios + 1;
		}if (num4 > 250) {
			numGrandes = numGrandes + 1;
		}
		
		
		System.out.println("Introduzca el valor de la tercera variable: ");
		num5= sc.nextDouble();
		
		if(num5<0) {
			numNegativos= numNegativos + 1;
		}if(num5 >= 0 && num5 <= 25) {
			numBajos = numBajos + 1;
		}if(num5 >= 26 && num5 <= 250) {
			numMedios = numMedios + 1;
		}if (num5 > 250) {
			numGrandes = numGrandes + 1;
		}
		System.out.println("Hay " +numNegativos + " números negativos.");
		System.out.println("Hay " +numBajos+ " números bajos.");
		System.out.println("Hay " +numMedios+ " números medios.");
		System.out.println("Hay " +numGrandes+ " números grandes.");
	}

}