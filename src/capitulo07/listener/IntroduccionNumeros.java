package capitulo07.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tutorialJava.Utils;

public class IntroduccionNumeros {

	static List<IncidenciaMatematicaListener> listIncidenciaMatematicaListeners = 
			new ArrayList<IncidenciaMatematicaListener>();
	
	/**
	 * 
	 * @param l
	 */
	public static void addIncidenciaMatematicaListener(IncidenciaMatematicaListener l) {
		listIncidenciaMatematicaListeners.add(l);
	}
	
	/**
	 * 
	 * @param l
	 */
	public static void removeIncidenciaMatematicaListener(IncidenciaMatematicaListener l) {
		listIncidenciaMatematicaListeners.remove(l);
	}
	
	/**
	 * 
	 */
	private static void fireDivisorCero(int operacionIntroducida) {
		IncidenciaMatematicaEvent event = new IncidenciaMatematicaEvent(operacionIntroducida);
		for (int i = listIncidenciaMatematicaListeners.size() - 1; i >= 0; i--) {
			listIncidenciaMatematicaListeners.get(i).divisorCero(event);
		}
	}
	
	private static void fireRestaNegativa(int operacionIntroducida) {
		IncidenciaMatematicaEvent event = new IncidenciaMatematicaEvent(operacionIntroducida);
		for (int i = listIncidenciaMatematicaListeners.size() - 1; i >= 0; i--) {
			listIncidenciaMatematicaListeners.get(i).restaNegativa(event);
		}
	}
	
	private static void fireSumaOMultiMayorA1000(int operacionIntroducida) {
		IncidenciaMatematicaEvent event = new IncidenciaMatematicaEvent(operacionIntroducida);
		for (int i = listIncidenciaMatematicaListeners.size() - 1; i >= 0; i--) {
			listIncidenciaMatematicaListeners.get(i).sumaOMultiMayorA1000(event);
		}
	}
	
	private static void fireRaizCuadradaNegativa(int operacionIntroducida) {
		IncidenciaMatematicaEvent event = new IncidenciaMatematicaEvent(operacionIntroducida);
		for (int i = listIncidenciaMatematicaListeners.size() - 1; i >= 0; i--) {
			listIncidenciaMatematicaListeners.get(i).raizCuadradaNegativa(event);
		}
	}
	
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int opcion = 0, operacion;
		
		// doy de alta los listeners
		Mesa mesa1 = new Mesa();
		Perro perro1 = new Perro();
		
		do {
			opcion = Utils.obtenerEnteroConDescripcion("Ingrese la operación a realizar:"
					+ "\n0. Salir del programa. "
					+ "\n1. Suma."
					+ "\n2. Resta." 
					+ "\n3. Multiplicación."
					+ "\n4. División."
					+ "\n5. Raíz Cuadrada.");
			
			if(opcion == 1) {
				num1 = Utils.obtenerEnteroConDescripcion("Ingrese el primer número de la operación.");
				num2 = Utils.obtenerEnteroConDescripcion("Ingrese el segundo número de la operación.");
				operacion = num1 + num2;
				if(operacion > 1000) fireSumaOMultiMayorA1000(operacion);
				else System.out.println("La suma es: " + operacion);
			}
			if(opcion == 2) {
				num1 = Utils.obtenerEnteroConDescripcion("Ingrese el primer número de la operación.");
				num2 = Utils.obtenerEnteroConDescripcion("Ingrese el segundo número de la operación.");
				operacion = num1 - num2;
				if(operacion < 0) fireRestaNegativa(operacion);
				else System.out.println("La resta es: " + operacion);
			}
			if(opcion == 3) {
				num1 = Utils.obtenerEnteroConDescripcion("Ingrese el primer número de la operación.");
				num2 = Utils.obtenerEnteroConDescripcion("Ingrese el segundo número de la operación.");
				operacion = num1 * num2;
				if(operacion > 1000) fireSumaOMultiMayorA1000(operacion); 
				else System.out.println("La multiplicación es: " + operacion);
			}
			if(opcion == 4) {
				num1 = Utils.obtenerEnteroConDescripcion("Ingrese el primer número de la operación.");
				num2 = Utils.obtenerEnteroConDescripcion("Ingrese el segundo número de la operación.");
				if(num2 == 0) fireDivisorCero(num2);
				else System.out.println("La división es: " + num1/num2);
			}
			if(opcion == 5) {
				num1 = Utils.obtenerEnteroConDescripcion("Ingrese el primer número de la operación.");
				if(num1 < 0) fireRaizCuadradaNegativa(num1);
				else System.out.println("La raíz cuadrada es: " + Math.sqrt(num1));
			}
			
		} while (opcion == 0);
	}

}
