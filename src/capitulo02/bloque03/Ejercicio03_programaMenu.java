package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_programaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num1, num2;
		String operacion;
		
		System.out.println();
		operacion = JOptionPane.showInputDialog("Menú:" +
				"\n1.- Hipotenusa triángulo\n2.- Superficie circunferencia\n3.- Perímetro circunferencia"
				+ "\n4.- Área rectángulo\n5.- Área triángulo\nIntroduzca la opción: ");
		num = Integer.parseInt(operacion);
		
		switch(num) {
		case 1:
			operacion = JOptionPane.showInputDialog("Introduzca la primera longitud: ");
			num1 = Integer.parseInt(operacion);
			operacion = JOptionPane.showInputDialog("Introduzca la segunda longitud: ");
			num2 = Integer.parseInt(operacion);
			
			System.out.println("La hipotenusa del triángulo vale: " + Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2)));
			break;
		case 2:
			operacion = JOptionPane.showInputDialog("Introduzca la longitud del radio: ");
			num1 = Integer.parseInt(operacion);
			
			System.out.println("El área de la circunferencia vale: " + Math.PI * Math.pow(num1, 2));
			break;
		case 3:
			operacion = JOptionPane.showInputDialog("Introduzca la longitud del radio: ");
			num1 = Integer.parseInt(operacion);
			
			System.out.println("La longitud del perímetro vale: " + 2 * Math.PI * num1);
			break;
		case 4:
			operacion = JOptionPane.showInputDialog("Introduzca la longitud de la base: ");
			num1 = Integer.parseInt(operacion);
			operacion = JOptionPane.showInputDialog("Introduzca la altura: ");
			num2 = Integer.parseInt(operacion);
			
			System.out.println("El área del rectángulo vale: " + num1 * num2);
			break;
		case 5:
			operacion = JOptionPane.showInputDialog("Introduzca la longitud de la base: ");
			num1 = Integer.parseInt(operacion);
			operacion = JOptionPane.showInputDialog("Introduzca la altura: ");
			num2 = Integer.parseInt(operacion);
			
			System.out.println("El área del triángulo vale: " + (num1 * num2) / 2);
			break;
		default:
			System.out.println("La opción " + operacion + " es incorrecta.");

	}
}
}
