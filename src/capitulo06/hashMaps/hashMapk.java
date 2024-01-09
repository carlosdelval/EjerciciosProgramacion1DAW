package capitulo06.hashMaps;

import java.util.HashMap;
import java.util.Iterator;

import tutorialJava.Utils;

public class hashMapk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Articulo> hm = new HashMap<String, Articulo>();
		
		int opcion = 5;
		
		while(opcion != 0) {
			opcion = Utils.obtenerEnteroConDescripcion("Ingrese la acción a realizar: "
					+ "\n0. Abandonar el programa."
					+ "\n1. Lista de artículos." 
					+ "\n2. Crear nuevo artículo."
					+ "\n3. Eliminar un artículo."
					+ "\n4. Actualizar un artículo.");
			
			if(opcion == 1) {
				listaArticulos(hm);
			}
			if(opcion == 2) {
				creaArticulo(hm);
			}
			if(opcion == 3) {
				eliminaArticulo(hm);
			}
			if(opcion == 4) {
				actualizaArticulo(hm);
			}
		}
		System.out.println("Fin del programa.");
	}
	
	public static void creaArticulo(HashMap<String, Articulo> hm) {
		String cb = Utils.obtenerCadenaConDescripcion("Introduzca el código de barras: ");
		int num = Utils.obtenerEnteroConDescripcion("Introduzca el número de estante: ");
		int stock = Utils.obtenerEnteroConDescripcion("Introduzca la cantidad de stock: ");
		hm.put(cb, new Articulo (num, stock));
		System.out.println("El artículo ha sido introducido con éxito.");
		System.out.println();
	}
	
	public static void eliminaArticulo(HashMap<String, Articulo> hm) {
		String cb = Utils.obtenerCadenaConDescripcion("Introduzca el código del artículo que desea eliminar: ");
		hm.remove(cb);
		System.out.println("El artículo ha sido eliminado con éxito.");
		System.out.println();
	}
	
	public static void actualizaArticulo(HashMap<String, Articulo> hm) {
		String cb = Utils.obtenerCadenaConDescripcion("Introduzca el código del artículo que desea actualizar: ");
		Articulo a = hm.get(cb);
		a.setNumEstante(Utils.obtenerEnteroConDescripcion("Introduzca el nuevo número de estante: "));
		a.setStock(Utils.obtenerEnteroConDescripcion("Introduzca la nueva cantidad de stock: "));
		System.out.println("El artículo ha sido actualizado con éxito.");
		System.out.println();
	}
	
	public static void listaArticulos(HashMap<String, Articulo> hm) {
		Iterator<Articulo> articulos = hm.values().iterator();
		while (articulos.hasNext()) {
			System.out.println("Objeto obtenido: "  + articulos.next());
		}
		System.out.println();
	}
	
}
