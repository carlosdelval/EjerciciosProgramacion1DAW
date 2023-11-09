package capitulo04.bloque06;

import java.util.Scanner;

import tutorialJava.UtilsArrays;

public class Ejercicio01_metodosMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int m[][] = new int[5][5];

		inicializaMatrizAlAzar(m);
		imprimeMatriz(m);
		System.out.println("\nEs positiva: " + esMatrizPositiva(m));
		System.out.println("Es diagonal: " + esDiagonal(m));
		System.out.println("Es triangular superior: " + esTriangularSuperior(m));
		System.out.println("Es dispersa: " + esDispersa(m));
		System.out.println("El array unidimensional de la matriz es: \n");
		UtilsArrays.imprimeArray(creaArrayUnidimensional(m));
		System.out.println("\nEs simétrica: " + esSimetrica(m));
		System.out.println("La matriz traspuesta es: \n");
		imprimeMatriz(creaTraspuesta(m));
		System.out.println("\nLa matriz opuesta es: \n");
		imprimeMatriz(creaOpuesta(m));
		System.out.println("\nIntroduzca la fila a borrar: ");
		int fila = sc.nextInt();
		while (fila > m.length || fila < 1) {
			System.out.println("Fila no válida, matriz de 5x5. Introduzca de nuevo: ");
			fila = sc.nextInt();
		}
		System.out.println("La matriz con la fila número " + fila + " eliminada es: \n");
		imprimeMatriz(eliminaFilaIntroducida(m, fila));

	}

	/**
	 * Método que inicializa la matriz con números al azar.
	 * 
	 * @param m
	 */

	public static void inicializaMatrizAlAzar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) Math.round(Math.random() * 100);
			}
		}
	}

	/**
	 * Método que imprime la matriz en pantalla.
	 * 
	 * @param m
	 */

	public static void imprimeMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * Método que recorre la matriz y comprueba que todos sus valores son positivos.
	 * 
	 * @param m
	 * @return
	 */

	public static boolean esMatrizPositiva(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Método que recorre la matriz encontrando los valores que no están en la
	 * diagonal principal y comprueba si son todos nulos.
	 * 
	 * @param m
	 * @return
	 */

	public static boolean esDiagonal(int m[][]) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i != j) {
					if (m[i][j] != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Método que encuentra los valores por debajo de la diagonal principal y
	 * comprueba si son todos nulos.
	 * 
	 * @param m
	 * @return
	 */

	public static boolean esTriangularSuperior(int m[][]) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j < i) {
					if (m[i][j] != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Método que recorre la matriz revisandola primero por filas y luego por columnas, y en el momento en el que
	 * recorre una en el que no encuentre un valor nulo devuelve falso.
	 * 
	 * @param m
	 * @return
	 */

	public static boolean esDispersa(int m[][]) {

		for (int i = 0; i < m.length; i++) {

			boolean hayNulo = false;

			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					hayNulo = true;
				}
			}
			if (hayNulo == false) return false;
		}
		
		for (int j = 0; j < m[j].length; j++) {
			
			boolean hayNulo = false;
			
			for (int i = 0; i < m.length; i++) {
				if(m[i][j] == 0) {
					hayNulo = true;
				}
			}
			if (hayNulo == false) return false;
		}
		
		return true;
	}

	/**
	 * Método en el que devuelvo un array con la longitud de la cantidad de
	 * elementos de la matriz, es decir, la multiplicación de una fila por la
	 * columna. Inicializando la variable k en 0 recorro el array mientras recorro
	 * la matriz para ir asignandole los valores.
	 * 
	 * @param m
	 * @return
	 */

	public static int[] creaArrayUnidimensional(int m[][]) {

		int a[] = new int[m.length * m[0].length];
		int k = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				a[k] = m[i][j];
				k++;
			}
		}
		return a;
	}

	/**
	 * Método que comprueba si la matriz es simétrica comparando los valores que
	 * sean simétricos de sus columnas con los de las filas mientras se recorre,
	 * devolviendo falso si encuentra algunos que no sean iguales.
	 * 
	 * @param m
	 * @return
	 */

	public static boolean esSimetrica(int m[][]) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] != m[j][i])
					return false;
			}
		}
		return true;
	}

	/**
	 * Método que devuelve la matriz traspuesta de la matriz introducida dandole las
	 * longitudes invertidas de la matriz original y asignandole los valores
	 * mientras se recorren ambas cambiando i por j.
	 * 
	 * @param m
	 * @return
	 */

	public static int[][] creaTraspuesta(int m[][]) {

		int mTras[][] = new int[m[0].length][m.length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				mTras[j][i] = m[i][j];
			}
		}
		return mTras;
	}

	/**
	 * Método que devuelve la matriz opuesta de la introducida asignandole los
	 * valores con el signo contrario.
	 * 
	 * @param m
	 * @return
	 */

	public static int[][] creaOpuesta(int m[][]) {

		int mOpuesta[][] = new int[m.length][m[0].length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				mOpuesta[i][j] = -m[i][j];
			}
		}
		return mOpuesta;
	}

	/**
	 * Método que devuelve una matriz igual a la anterior con la fila proporcionada eliminada.
	 * Primero me aseguro de que el caso de que la fila sea la última funcione por separado para que la i+1 no se salga del límite, y luego
	 * recorro las matrices copiando los valores de la primera en la nueva ayudandome de un boolean para que cuando encuentre la fila dada,
	 * se salte esa fila y no los copie.
	 * @param m
	 * @param n
	 * @return
	 */

	public static int[][] eliminaFilaIntroducida(int m[][], int n) {

		boolean filaEncontrada = false;
		int mNueva[][] = new int[m.length - 1][m[0].length];

		if (n == m.length) {
			for (int i = 0; i < mNueva.length; i++) {
				for (int j = 0; j < mNueva[i].length; j++) {
					mNueva[i][j] = m[i][j];
				}
			}
		} else {
			for (int i = 0; i < m.length - 1; i++) {
				for (int j = 0; j < m[i].length; j++) {
					if (i == n - 1) {
						mNueva[i][j] = m[i + 1][j];
						filaEncontrada = true;
					} else {
						if (filaEncontrada == true)
							mNueva[i][j] = m[i + 1][j];
						else
							mNueva[i][j] = m[i][j];
					}
				}
			}
		}
		return mNueva;
	}
}
