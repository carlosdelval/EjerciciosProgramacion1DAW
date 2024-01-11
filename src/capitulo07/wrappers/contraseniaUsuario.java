package capitulo07.wrappers;

import java.util.Scanner;

public class contraseniaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char cadenaTexto[] = new char[6];
		boolean hayMayus = false;
		boolean hayMin = false;
		boolean hayNum = false;
		boolean hayAlfanum = false;
		
		while(hayMayus == false || hayMin == false || hayNum == false || hayAlfanum == false) {
			System.out.println("Introduzca su contraseña (6 caracteres, mínimo una minúscula, una mayúscula, un dígito y un alfanumérico): ");
			for (int i = 0; i < cadenaTexto.length; i++) {
				cadenaTexto[i] = sc.next().charAt(0);
				if (Character.isDigit(cadenaTexto[i]))
					hayNum = true;
				if (Character.isUpperCase(cadenaTexto[i]))
					hayMayus = true;
				if (Character.isLowerCase(cadenaTexto[i]))
					hayMin = true;
				if (Character.isLetterOrDigit(cadenaTexto[i]) == false)
					hayAlfanum = true;
			}
			if(hayMayus == false || hayMin == false || hayNum == false || hayAlfanum == false)
				System.out.println("Contraseña incorrecta, introduzca de nuevo: ");
		}
		System.out.println("Contraseña introducida con éxito.");
	}
}
