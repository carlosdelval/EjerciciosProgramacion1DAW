package capitulo02.bloque02;

import java.util.Scanner;

public class Ejercicio01_sumaCategorias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2, num3, num4, num5, sumaNegativos, sumaBajos, sumaMedios, sumaGrandes;
		sumaNegativos = sumaBajos = sumaMedios = sumaGrandes = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el valor de la primera variable: ");
		num1 = sc.nextDouble();
		
		if(num1<0) {
			sumaNegativos= sumaNegativos + num1;
		}if(num1 >= 0 && num1 <= 25) {
			sumaBajos = sumaBajos + num1;
		}if(num1 >= 26 && num1 <= 250) {
			sumaMedios = sumaMedios + num1;
		}else {
			sumaGrandes = sumaGrandes + num1;
		}
		
		
		System.out.println("Introduzca el valor de la segunda variable: ");
		num2= sc.nextDouble();
		
		if(num2<0) {
			sumaNegativos= sumaNegativos + num2;
		}if(num2 >= 0 && num2 <= 25) {
			sumaBajos = sumaBajos + num2;
		}if(num2 >= 26 && num2 <= 250) {
			sumaMedios = sumaMedios + num2;
		}else {
			sumaGrandes = sumaGrandes + num2;
		}
		
		System.out.println("Introduzca el valor de la tercera variable: ");
		num3= sc.nextDouble();
		
		if(num3<0) {
			sumaNegativos= sumaNegativos + num3;
		}if(num3 >= 0 && num3 <= 25) {
			sumaBajos = sumaBajos + num3;
		}if(num3 >= 26 && num3 <= 250) {
			sumaMedios = sumaMedios + num3;
		}else {
			sumaGrandes = sumaGrandes + num3;
		}
		
		System.out.println("Introduzca el valor de la cuarta variable: ");
		num4= sc.nextDouble();
		System.out.println("Introduzca el valor de la quinta variable: ");
		num5= sc.nextDouble();

	}

}
