package capitulo07.excepciones.Ejercicio1;

import tutorialJava.Utils;

public class numeroImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		try {
			num = Utils.obtenerEnteroConDescripcion("Introduzca un número entero par: ");
		}
		catch(Exception e) {
			PeticionNumeros a = (PeticionNumeros) e;
			a.pideNumeroPar(num);
		}
	}

}
