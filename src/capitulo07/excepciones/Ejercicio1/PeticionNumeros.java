package capitulo07.excepciones.Ejercicio1;

public class PeticionNumeros extends Exception {
	
	public PeticionNumeros(String msg) {
		super(msg);
	}
	
	public static void pideNumeroPar(int numIntroducido) {
		if(numIntroducido % 2 != 0)System.out.println("numeroIntroducido.exception .... El número introducido es impar");
	}
}
