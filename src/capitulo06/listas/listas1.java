package capitulo06.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tutorialJava.Utils;

public class listas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		int opcion = 0;
		
		while(opcion != 1) {
			System.out.println("Pulse una tecla para empezar..");
			sc.nextLine();
			opcion = Utils.obtenerEnteroConDescripcion("Ingrese la acción a realizar: "
					+ "\n1. Abandonar el programa."
					+ "\n2. Crear aleatoriamente lista de valores." 
					+ "\n3. Calcular suma, media, mayor y menor."
					+ "\n4. Agregar una cantidad de nuevos valores."
					+ "\n5. Eliminar elementos cuyo valor esté dentro de un intervalo." 
					+ "\n6. Imprimir la lista.");

			if(opcion == 2) {
				int longitud = Utils.obtenerEnteroConDescripcion("Ingrese la longitud de la lista: ");
				int max = Utils.obtenerEnteroConDescripcion("Ingrese el máximo de los números aleatorios: ");
				int min = Utils.obtenerEnteroConDescripcion("Ingrese el mínimo de los números aleatorios: ");
				inicializarListaAleatoria(numeros, longitud, max, min);
			}
			if(opcion == 3) {
				sumaMediaMayorMenor(numeros);
			}
			if(opcion == 4) {
				int numDatos = Utils.obtenerEnteroConDescripcion("Ingrese cuántos datos nuevos quiere ingresar");
				int pos = Utils.obtenerEnteroConDescripcion("Indique la posición a partir de la cuál añadir: ");
				int max = Utils.obtenerEnteroConDescripcion("Ingrese el máximo de los números aleatorios: ");
				int min = Utils.obtenerEnteroConDescripcion("Ingrese el mínimo de los números aleatorios: ");
				agregarValores(numeros, numDatos, pos, max, min);
			}
			if(opcion == 5) {
				int max = Utils.obtenerEnteroConDescripcion("Ingrese el máximo del intervalo a eliminar: ");
				int min = Utils.obtenerEnteroConDescripcion("Ingrese el mínimo del intervalo a eliminar: ");
				eliminaElementosIntervalo(numeros, max, min);
			}
			if(opcion == 6) {
				imprimeLista(numeros);
				System.out.println();
				System.out.println();
				}
		}
		System.out.println("Fin del programa.");
	}
	
	private static void inicializarListaAleatoria(List<Integer> l, int longitud, int max, int min) {
		l.clear();
		for (int i = 0; i < longitud; i++) {
			l.add(Utils.obtenerNumeroAzar(min, max));
		}
	}
	
	private static void sumaMediaMayorMenor(List<Integer> l) {
		
		int suma = 0;
		int mayor = l.get(0);
		int menor = l.get(0);
		
		for (int i = 0; i < l.size(); i++) {
			if(l.get(i) > mayor) mayor = l.get(i).intValue();
			if(l.get(i) < menor) menor = l.get(i).intValue();
			suma = suma + l.get(i).intValue();
		}
		
		int media = suma / l.size();
		System.out.println("Suma = " + suma + " -- Media = " + media + " -- Mayor --> " + mayor + "  -- Menor --> " + menor);
	}
	
	private static void agregarValores(List<Integer> l, int numDatos, int pos, int max, int min) {
		for (int i = pos + numDatos; i >= pos; i--) {
			l.add(i, Utils.obtenerNumeroAzar(min, max));
		}
	}
	
	private static void eliminaElementosIntervalo(List<Integer> l, int max, int min) {
		for (int i = max; i >= min; i--) {
			l.remove(i);
		}
		System.out.println("Se han eliminado " + (max - min) + " elementos.");
	}
	
	private static void imprimeLista(List<Integer> l) {
		
		for (int i = 0; i < l.size() - 1; i++) {
			System.out.print(l.get(i).intValue() + ", ");
		}
		System.out.print(l.get(l.size() - 1).intValue());
	}

}
