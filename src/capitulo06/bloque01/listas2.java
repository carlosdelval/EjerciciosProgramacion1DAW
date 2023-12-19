package capitulo06.bloque01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import tutorialJava.Utils;

public class listas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<String> fichero = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		
		int opcion = 0;
		
		while(opcion != 1) {
			System.out.println("Pulse una tecla para empezar..");
			sc.nextLine();
			opcion = Utils.obtenerEnteroConDescripcion("Ingrese la acción a realizar: "
					+ "\n1. Abandonar el programa."
					+ "\n2. Agregar una línea al texto."
					+ "\n3. Insertar una línea en cualquier posición del texto"
					+ "\n4. Editar una línea (reescribir su contenido)"
					+ "\n5. Borrar una línea" + "\n6. Cortar un conjunto de líneas" + "\n7. Pegar un conjunto de líneas cortadas en una determinada posición"
					+ "\n8. Imprimir el fichero");

			if(opcion == 2) {
				String a = Utils.obtenerCadenaConDescripcion("Ingrese el texto que desea añadir: ");
				anadirLinea(fichero, a);
			}
			if(opcion == 3) {
				String a = Utils.obtenerCadenaConDescripcion("Ingrese el texto que desea insertar: ");
				int pos = Utils.obtenerEnteroConDescripcion("Ingrese la línea donde desea insertar: ");
				insertarLinea(fichero, a, pos);
			}
			if(opcion == 4) {
				String a = Utils.obtenerCadenaConDescripcion("Ingrese el texto que desea editar: ");
				int pos = Utils.obtenerEnteroConDescripcion("Ingrese la línea donde desea editar: ");
				editarLinea(fichero, a, pos);
			}
			if(opcion == 5) {
				int pos = Utils.obtenerEnteroConDescripcion("Ingrese la línea donde desea eliminar: ");
				eliminaLinea(fichero, pos);
			}
			if(opcion == 6) {
				int posInicial = Utils.obtenerEnteroConDescripcion("Ingrese la línea inicial donde desea cortar: ");
				int posFinal = Utils.obtenerEnteroConDescripcion("Ingrese la línea final donde desea cortar: ");
				portapapeles = portaPapeles(fichero, posInicial, posFinal);
			}
			if(opcion == 7) {
				int pos = Utils.obtenerEnteroConDescripcion("Ingrese la línea donde desea pegar el portapapeles: ");
				pegarPortapapeles(fichero, pos, portapapeles);
			}
			if(opcion == 8) {
				System.out.println();
				System.out.println();
				imprimeFichero(fichero);
				System.out.println();
				System.out.println();
				
			}
		}
		System.out.println("Fin del programa.");
	}
	
	private static void anadirLinea(List<String> l, String a) {
		l.add(a);
	}
	
	private static void insertarLinea(List<String> l, String a, int pos) {
		l.add(pos, a);
	}
	
	private static void editarLinea(List<String> l, String a, int pos) {
		System.out.println("Va a editar la línea: " + l.get(pos));
		l.set(pos, a);
	}
	private static void eliminaLinea(List<String> l, int pos) {
		l.remove(pos);
	}
	private static void imprimeFichero(List<String> l) {
		for (String c : l) {
			System.out.println(c.toString());
		}	
	}
	private static List<String> portaPapeles(List<String> l, int posMin, int posMax){
		List<String> newFichero = new ArrayList<String>();
		for (int i = posMin; i < posMax; i++) {
			newFichero.add(l.get(i));
			l.remove(i);
		}
		newFichero.add(l.get(posMax));
		l.remove(posMax);
		return newFichero;
	}
	private static void pegarPortapapeles(List<String> l, int pos, List<String> portapapeles) {
		l.addAll(pos, portapapeles);
	}

}
