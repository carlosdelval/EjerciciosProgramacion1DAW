package capitulo04.bloque02;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio04_desplazarNumerosDerecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[5];
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		



	}
	
	public static void desplazaCiclicoDerecha (int a[]) {
		
		int aAux[] = new int[a.length];
		
		for (int i = 0; i < a.length-1; i++) {
			
			aAux[i+1] = a[i];
			
		}
		
				
		}
}

