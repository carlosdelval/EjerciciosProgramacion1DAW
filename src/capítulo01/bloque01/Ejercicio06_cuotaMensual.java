package capítulo01.bloque01;

import java.util.Scanner;

public class Ejercicio06_cuotaMensual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Capital;
		int NumeroPlazos;
		float Euribor;
		float Diferencial;
		double InteresA;
		double InteresM;
		double CuotaMensual;
		double Enesima;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca los datos del Euribor: ");
		Euribor = sc.nextFloat();
		System.out.println("Introduzca los datos del Diferencial:");
		Diferencial = sc.nextFloat();
		System.out.println("Introduzca los datos del Capital:");
		Capital = sc.nextFloat();
		System.out.println("Introduzca el número de plazos mensuales a pagar: ");
		NumeroPlazos = sc.nextInt();
		InteresA= Euribor + Diferencial;
		InteresM= (InteresA/12)/100;
		Enesima= Math.pow(1+InteresM,NumeroPlazos);
		CuotaMensual= Capital*((InteresM*Enesima)/(Enesima-1));
		System.out.println("La cuota mensual es: " + CuotaMensual);
		
		

	}

}
