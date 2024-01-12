package estudiar;

public class segundoNumMasAlto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {5, 4 , 8, 9};
		int segundo = segundoMasAlto(numeros);
		System.out.println("El segundo número más alto del array es: " + segundo);
	}
	
	/**
	 * Método que busca el mayor del array.
	 * @param array
	 * @return
	 */
	
	public static int numeroMasAlto(int array[]) {
		int mayor = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > mayor) mayor = array[i];
		}
		return mayor;
	}
	
	public static int segundoMasAlto(int array[]) {
		int mayor = numeroMasAlto(array);
		int segundo = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != mayor) {
				if(array[i] > segundo) segundo = array[i];
			}
		}
		return segundo;
	}
	
}
