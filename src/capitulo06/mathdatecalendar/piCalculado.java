package capitulo06.mathdatecalendar;

public class piCalculado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double piCalc = 0;
		int num = 1;
		int cambio = 1;
		do {
			piCalc = piCalc + ((4 * cambio) / num);
			num = num + 2;
			cambio = -cambio;
			
		}while(Math.abs(Math.PI - piCalc) > 0.00001);
		
		System.out.println("Nuestro pi calculado es: " + piCalc);
	}

}
