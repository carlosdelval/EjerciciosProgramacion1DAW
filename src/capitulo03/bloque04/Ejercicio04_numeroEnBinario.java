package capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio04_numeroEnBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, digito, binario = 0, potencia = 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número que desea convertir en binario:");
		num = sc.nextInt();

		while (num > 0) {
			digito = num % 2;
			binario = digito * potencia + binario;
			potencia *= 10;
			num /= 2;
		}

		System.out.println("El número en formato binario es " + binario);

	}

}
