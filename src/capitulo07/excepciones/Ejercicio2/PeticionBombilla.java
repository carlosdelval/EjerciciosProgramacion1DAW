package capitulo07.excepciones.Ejercicio2;

import tutorialJava.Utils;

public class PeticionBombilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		try {
			cadena = introduceBombilla();
		} catch(diferenteEspacioBlancoException e) {
			e.printStackTrace();
		} catch(palabrasInferiorTresException e) {
			e.printStackTrace();
		} catch(noApareceBombillaException e) {
			e.printStackTrace();
		} catch(insultoException e) {
			e.printStackTrace();
		}
	}
	
	public static String introduceBombilla() throws diferenteEspacioBlancoException, palabrasInferiorTresException, noApareceBombillaException, insultoException {
		String cadena = Utils.obtenerCadenaConDescripcion("Introduce tu frase con la palabra bombilla: ");
		int cont = 0;
		if(hayEspaciosBlanco(cadena) == false) throw new diferenteEspacioBlancoException("No hay espacios en blanco!!!");
		if(numPalabras(cadena) < 3) throw new palabrasInferiorTresException("Hay menos de 3 palabras en la frase!!!");
		if(contarOcurrencias(cadena, "bombilla") == 0) throw new noApareceBombillaException("No aparece la palabra bombilla en la frase!!!");
		if(contarOcurrencias(cadena, "tonto") != 0) throw new insultoException("No me insultes :(");
		if(contarOcurrencias(cadena, "tonta") != 0) throw new insultoException("No me insultes :(");
		if(contarOcurrencias(cadena, "idiota") != 0) throw new insultoException("No me insultes :(");
		return cadena;
	}
	
	public static Boolean hayEspaciosBlanco(String cadena) {
		Boolean hayEspacio = false;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == ' ') hayEspacio = true;
		}
		if(hayEspacio == false) return false;
		return true;
	}
	
	public static int numPalabras(String s) {
		int cont = 1;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 32 && s.charAt(i+1) != 32) {
				cont++;
			}
		}
		return cont;
	}
	public static int contarOcurrencias(String s, String sub) {
		int ocur = 0;
		for (int i = 0; i <= s.length() - sub.length(); i++) {
			boolean esIgual = true;
			for (int j = 0; j < sub.length(); j++) {
				if (s.charAt(i + j) != sub.charAt(j)) {
					esIgual = false;
				}
			}
			if (esIgual) ocur++;
		}
		return ocur;
	}
}
