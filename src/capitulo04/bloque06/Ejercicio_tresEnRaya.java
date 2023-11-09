package capitulo04.bloque06;

import java.util.Iterator;
import java.util.Scanner;

import tutorialJava.Utils;

public class Ejercicio_tresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int m[][] = new int[3][3];
		boolean hayGanador = false;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 0;
			}
		}

		String player1 = Utils.obtenerCadenaConDescripcion("Ingrese el nombre del jugador 1: ");
		String player2 = Utils.obtenerCadenaConDescripcion("Ingrese el nombre del jugador 2: ");
		
		imprimirTablero(m);

		while (hayGanador == false) {
			
			System.out.println("Es el turno de " + player1 + ".");
			System.out.println("Ingrese la primera coordenada: ");
			int coord1 = ingresaCoordenada() - 1;
			System.out.println("Ingrese la segunda coordenada: ");
			int coord2 = ingresaCoordenada() - 1;
			while(validarJugada(m, coord1, coord2) == false) {
				
				System.out.println("Jugada no válida, posición ocupada!");
				System.out.println("Ingrese la primera coordenada: ");
				coord1 = ingresaCoordenada() - 1;
				System.out.println("Ingrese la segunda coordenada: ");
				coord2 = ingresaCoordenada() - 1;
			}
			m[coord1][coord2] = 1;
			imprimirTablero(m);
			hayGanador = hayVictoria(m);
			if (hayGanador == true) {
				System.out.println("TRES EN RAYA, " + player1 + " es el ganador!");
			}
			
			if(tableroLleno(m) == true) hayGanador = true;

			if (hayGanador == false) {
				System.out.println("Es el turno de " + player2 + ".");
				System.out.println("Ingrese la primera coordenada: ");
				coord1 = ingresaCoordenada() - 1;
				System.out.println("Ingrese la segunda coordenada: ");
				coord2 = ingresaCoordenada() - 1;
				while(validarJugada(m, coord1, coord2) == false) {
					
					System.out.println("Jugada no válida, posición ocupada!");
					System.out.println("Ingrese la primera coordenada: ");
					coord1 = ingresaCoordenada() - 1;
					System.out.println("Ingrese la segunda coordenada: ");
					coord2 = ingresaCoordenada() - 1;
				}
				m[coord1][coord2] = 2;
				imprimirTablero(m);
				hayGanador = hayVictoria(m);
				if (hayGanador == true) {
					System.out.println("TRES EN RAYA, " + player2 + " es el ganador!");
				}
			}
			if(tableroLleno(m) == true) {
				System.out.println("Fin del juego, empate.");
				hayGanador = true;
			}
		}

	}

	/**
	 * 
	 * @param m
	 * @return
	 */

	public static boolean hayVictoria(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			if(m[i][1] == m[i][2] && m[i][0] == m[i][1] && m[i][1] != 0) return true;
		}
		
		for (int j = 0; j < m[0].length; j++) {
			if(m[1][j] == m[2][j] && m[0][j] == m[1][j] && m[1][j] != 0) return true;
		}
		
		return false;
	}
	
	public static boolean tableroLleno(int m[][]) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(m[i][j] == 0) return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 
	 * @param m
	 * @param coord1
	 * @param coord2
	 * @return
	 */
	
	public static boolean validarJugada(int m[][], int coord1, int coord2) {
		
		if(m[coord1][coord2] != 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @param m
	 */
	
	public static void imprimirTablero(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @return
	 */

	public static int ingresaCoordenada() {
		
		Scanner sc = new Scanner(System.in);
		int n = Utils.obtenerEnteroConDescripcion("");
		
		while (n < 0 && n > 3) {

			System.out.println("Coordenada no válida, jugamos a tres en raya! Ingrese de nuevo: ");
			n = sc.nextInt();
		}

		return n;
	}
}
