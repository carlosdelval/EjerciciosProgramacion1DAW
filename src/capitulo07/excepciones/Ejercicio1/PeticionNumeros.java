package capitulo07.excepciones.Ejercicio1;

import tutorialJava.Utils;

public class PeticionNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		try {
			num = pideNumeroPar();
		} catch (numeroImparException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int pideNumeroPar() throws numeroImparException {
		int num = Utils.obtenerEnteroConDescripcion("Introduzca un número par: ");
		if(num % 2 != 0) throw new numeroImparException("El número es impar");
		return num;
	}

}
