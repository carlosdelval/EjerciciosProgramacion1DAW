package capitulo07.wrappers;

public class enterosHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String digitos = "0123456789ABCDEF";
		System.out.println("100 primeros números en hexadecimal: ");
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.println("Número " + (i+1) + " = " + integerAHexa(i+1,digitos));
		}
		
	}
	public static String integerAHexa(int num, String digitos) {
        if (num <= 0)
            return "0";
        StringBuffer hexa = new StringBuffer();
        while (num > 0) {
            int digit = num % 16;
            hexa.insert(0, digitos.charAt(digit));
            num = num / 16;
        }
        return hexa.toString();
    }
}
