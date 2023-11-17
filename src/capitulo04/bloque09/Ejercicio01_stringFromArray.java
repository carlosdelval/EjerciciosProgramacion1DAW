package capitulo04.bloque09;

import tutorialJava.UtilsArrays;

public class Ejercicio01_stringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {67, 65, 82, 76, 79, 83};
		UtilsArrays.imprimeArray(a);
		String s = stringFromArray(a);
		System.out.println(s);

	}
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	
	public static String stringFromArray(int a[]) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			sb.append((char) a[i]);
		}
		return sb.toString();
	}

}
