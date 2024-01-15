package capitulo06.mathdatecalendar;

public class corteGraficas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0;
		double y1 = 0;
		double y2 = 0;
		do {
			y1 = Math.sqrt(x);
			y2 = -Math.log10(x);
			x += 0.0001;
		}while(Math.abs(y1 - y2) > 0.001);
		System.out.println("Se cortan cuando x = " + x + ".");
		System.out.println("La coordenada es (" + x + ", " + y1 + ").");
	}

}
