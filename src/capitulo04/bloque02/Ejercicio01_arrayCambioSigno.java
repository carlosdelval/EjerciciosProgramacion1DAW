package capitulo04.bloque02;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio01_arrayCambioSigno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[150];
		
		UtilsArrays.inicializaArray(array, -100, 100);
		
		cambiaSignoEnValores(array);

	}


	public static void cambiaSignoEnValores(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				
				array[i] = array[i] * -1;
				
			}
			
		}
	}
}
