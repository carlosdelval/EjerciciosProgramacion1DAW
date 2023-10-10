package capitulo03.bloque05;

import java.util.Scanner;

public class Ejercicio04_juegoNumeroAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random()*100);
		
		int num1;
		
		System.out.println("Introduzca un número: ");
		
		num1 = sc.nextInt();
		
		while(num1 != num) {
			
			if(num1 > num) {
				
				System.out.println("El número es menor. Vuelva a intentarlo: ");
				
				num1 = sc.nextInt();
				
			}else {
				
				System.out.println("El número es mayor. Vuelva a intentarlo: ");
				
				num1 = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Enhorabuena, el número es: " + num + "!!! :))) !! :D");

	}

}
