package capitulo08_BBDD.tutorialJavaCoches;

import java.sql.SQLException;

import tutorialJava.Utils;

public class CRUDmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int main = 5;
		do {
			main = Utils.obtenerEnteroConDescripcion("0. Abandonar el programa."
					+ "\n1. Fabricante" + "\n2. Concesionario"
					+ "\n3. Cliente" + "\n4. Coche" + "\n5. Venta");
			if(main < 0 || main > 5) System.out.println("Opción incorrecta, introduzca de nuevo.");
			if(main == 0) System.out.println("Fin del programa.");
			if(main == 1) CRUDfabricante.fabricante();
			if(main == 2) CRUDconcesionario.concesionario();
			if(main == 3) CRUDcliente.cliente();
			if(main == 4) CRUDcoche.coche();
			if(main == 5) CRUDventa.venta();
			
		}while(main != 0);
	}
}
