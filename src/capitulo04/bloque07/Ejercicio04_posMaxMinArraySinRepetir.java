package capitulo04.bloque07;

public class Ejercicio04_posMaxMinArraySinRepetir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][] = new int[6][10];
		rellenarMatrizSinRepetir(m);
		imprimeMatriz(m);
		System.out.println("El número máximo de la matriz es " + calcularMax(m) + ".");
		System.out.println("El número mínimo de la matriz es " + calcularMin(m) + ".");
	}
	
	/**
	 * 
	 * @param m
	 */
	
	public static void rellenarMatrizSinRepetir(int [][] m) {
		
		int aux;
		boolean seRepite = true;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				do {
					seRepite = false;
					aux = (int) Math.round(Math.random() * 1000);
					for (int k = 0; k < m.length; k++) {
						for (int k2 = 0; k2 < m[k].length; k2++) {
							if(aux == m[k][k2]) seRepite = true;
						}
					}
				}while(seRepite == true);
				m[i][j] = aux;
			}
		}
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	
	public static int calcularMax(int [][] m) {
		
		int max = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > max) max = m[i][j];
			}
		}
		return max;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	
	public static int calcularMin(int [][] m) {
		
		int min = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < min) min = m[i][j];
			}
		}
		return min;
	}
	
	/**
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
}
