package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02_calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num1, num2;
		String operacion;
		
		System.out.println();
		operacion = JOptionPane.showInputDialog("Menú:" +
				"\n1.- Raíz\n2.- Potencia\n3.- Módulo de la división\n Introduzca la opción: ");
		num = Integer.parseInt(operacion);
		
		operacion = JOptionPane.showInputDialog("Introduzca el primer número: ");
		num1 = Integer.parseInt(operacion);
		operacion = JOptionPane.showInputDialog("Introduzca el segundo número: ");
		num2 = Integer.parseInt(operacion);
		
		switch(num) {
		case 1:
			System.out.println("La raíz vale: " + Math.pow(num1, (float)1/num2));
			break;
		case 2:
			System.out.println("La potencia vale: " + Math.pow(num1, num2));
			break;
		case 3:
			System.out.println("El módulo de la división vale: " + (num1 % num2));
			break;
		default:
			System.out.println("La opción " + operacion + " no es válida.");
		}
	}
}
