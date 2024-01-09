package capitulo07.wrappers;

import java.util.Scanner;

public class contraseniaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String cadenaTexto[] = new String[6];
		boolean hayMayus = false;
		boolean hayMin = false;
		boolean hayNum = false;
		boolean hayAlfanum = false;
		
		while(hayMayus == false || hayMin == false || hayNum == false || hayAlfanum == false) {
			System.out.println("Introduzca su contraseña: ");
			System.out.println();
			for (int i = 0; i < cadenaTexto.length; i++) {
				cadenaTexto[i] = sc.next();
			}
		}
	}

}
