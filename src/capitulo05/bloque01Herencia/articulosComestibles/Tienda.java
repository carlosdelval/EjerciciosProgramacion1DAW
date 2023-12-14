package capitulo05.bloque01Herencia.articulosComestibles;

import tutorialJava.Utils;

public class Tienda {

	public static void main(String[] args) {

		Articulo articulos[] = new Articulo[4];

		for (int i = 0; i < 4; i++) {
			int opcion = Utils.obtenerEnteroConDescripcion("Introduzca un nuevo artículo, 1 para perecedero, 2 para no perecedero: ");
			while(opcion != 1 && opcion != 2) {
				opcion = Utils.obtenerEnteroConDescripcion("Introduzca un nuevo artículo, 1 para perecedero, 2 para no perecedero: ");
			}
			if (opcion == 1) {
				Perecedero p = new Perecedero();
				System.out.println("Introduzca la fecha de caducidad: ");
				p.setDia(Utils.obtenerEnteroConDescripcion("Introduzca el día: "));
				p.setMes(Utils.obtenerEnteroConDescripcion("Introduzca el mes: "));
				p.setAnio(Utils.obtenerEnteroConDescripcion("Introduzca el año: "));
				articulos[i] = p;
			}
			if (opcion == 2) {
				NoPerecedero p = new NoPerecedero();
				articulos[i] = p;
			}
			articulos[i].setCodigo(Utils.obtenerEnteroConDescripcion("Introduzca el código del artículo: "));
			articulos[i].setNombre(Utils.obtenerCadenaConDescripcion("Introduzca el nombre del artículo: "));
			articulos[i].setPrecio(Utils.obtenerEnteroConDescripcion("Introduzca el precio del artículo: "));
		}
		for (int i = 0; i < articulos.length; i++) {
			System.out.println(articulos[i].toString());
		}
	}
}
