package capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio03_tablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 1;
		
		do {
			
			System.out.println("La tabla del " + num1 + " es:\n");
			System.out.println(num1 + "x1= " + num1*1 + "\n");
			System.out.println(num1 + "x2= " + num1*2 + "\n");
			System.out.println(num1 + "x3= " + num1*3 + "\n");
			System.out.println(num1 + "x4= " + num1*4 + "\n");
			System.out.println(num1 + "x5= " + num1*5 + "\n");
			System.out.println(num1 + "x6= " + num1*6 + "\n");
			System.out.println(num1 + "x7= " + num1*7 + "\n");
			System.out.println(num1 + "x8= " + num1*8 + "\n");
			System.out.println(num1 + "x9= " + num1*9 + "\n");
			System.out.println(num1 + "x10= " + num1*10 + "\n");
			
			num1++;
			
		} while (num1 <= 15);
		
	}

}
