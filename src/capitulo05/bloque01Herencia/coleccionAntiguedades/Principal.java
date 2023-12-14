package capitulo05.bloque01Herencia.coleccionAntiguedades;
import tutorialJava.Utils;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Antiguedad antiguedades[] = new Antiguedad[4];

		for (int i = 0; i < antiguedades.length; i++) {
			int opcion = Utils.obtenerEnteroConDescripcion("Introduzca un nuevo artículo, 1 para Libro, 2 para Joya, 3 para Escultura y 4 para Cuadro: ");
			while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
				opcion = Utils.obtenerEnteroConDescripcion("Introduzca un nuevo artículo, 1 para Libro, 2 para Joya, 3 para Escultura y 4 para Cuadro: ");
			}
			if (opcion == 1) {
				Libro p = new Libro();
				p.setAutor(Utils.obtenerCadenaConDescripcion("Introduzca el nombre del autor: "));
				p.setNumPag(Utils.obtenerEnteroConDescripcion("Introduzca el número de páginas: "));
				antiguedades[i] = p;
			}
			if (opcion == 2) {
				Joya p = new Joya();
				p.setMaterial(Utils.obtenerCadenaConDescripcion("Introduzca el material de la joya: "));
				antiguedades[i] = p;
			}
			if (opcion == 3) {
				Escultura p = new Escultura();
				p.setArtista(Utils.obtenerCadenaConDescripcion("Introduzca el nombre del artista: "));
				p.setMaterial(Utils.obtenerCadenaConDescripcion("Introduzca el material de la escultura: "));
				antiguedades[i] = p;
			}
			if (opcion == 4) {
				Cuadro p = new Cuadro();
				p.setEpoca(Utils.obtenerCadenaConDescripcion("Introduzca la época del cuadro: "));
				p.setPintor(Utils.obtenerCadenaConDescripcion("Introduzca el pintor: "));
				antiguedades[i] = p;
			}
			antiguedades[i].setAnioFabricacion(Utils.obtenerEnteroConDescripcion("Introduzca el año de fabricación: "));
			antiguedades[i].setPrecio(Utils.obtenerEnteroConDescripcion("Introduzca el precio de venta: "));
			antiguedades[i].setOrigen(Utils.obtenerCadenaConDescripcion("Introduzca el origen de procedencia: "));
			
		}
		for (int i = 0; i < antiguedades.length; i++) {
			System.out.println(antiguedades[i].toString());
		}
	}

}
