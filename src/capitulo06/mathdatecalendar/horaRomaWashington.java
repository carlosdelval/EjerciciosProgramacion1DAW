package capitulo06.mathdatecalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class horaRomaWashington {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ahoraWashington = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		Calendar ahoraRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		
		System.out.println("Hora en Roma: " + ahoraRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en Washington: " + ahoraWashington.get(Calendar.HOUR_OF_DAY));
		ahoraRoma.add(Calendar.HOUR_OF_DAY, -ahoraWashington.get(Calendar.HOUR_OF_DAY));
		System.out.println("La diferencia horaria es de " + ahoraRoma.get(Calendar.HOUR_OF_DAY) + " horas.");
	}

}
