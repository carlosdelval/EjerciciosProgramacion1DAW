package capitulo06.mathdatecalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fechaIntroducida = JOptionPane.showInputDialog("Introduzca su fecha (formato dd/MM/yyyy HH:mm:ss): ");
		System.out.println("Fecha introducida: " + fechaIntroducida);
		System.out.println();
		
		
		Date fechaParseada = null;
		try {
			fechaParseada = new Date(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(fechaIntroducida).getTime());
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		
		Calendar fechaCalendar = Calendar.getInstance();
		fechaCalendar.setTime(fechaParseada);
		
		System.out.println("Desde calendario: ");
		System.out.println();
		System.out.println("Año: " + fechaCalendar.get(Calendar.YEAR));
		System.out.println("Mes: " + (1 + fechaCalendar.get(Calendar.MONTH)));
		System.out.println("Día: " + fechaCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora: " + fechaCalendar.get(Calendar.HOUR));
		System.out.println("Minuto: " + fechaCalendar.get(Calendar.MINUTE));
		System.out.println("Segundo: " + fechaCalendar.get(Calendar.SECOND));
		System.out.println();
		
		System.out.println("Desde fecha: ");
		System.out.println();
		System.out.println("Año: " + new SimpleDateFormat("yyyy").format(fechaParseada));
		System.out.println("Mes: " + new SimpleDateFormat("MM").format(fechaParseada));
		System.out.println("Día: " + new SimpleDateFormat("dd").format(fechaParseada));
		System.out.println("Hora: " + new SimpleDateFormat("HH").format(fechaParseada));
		System.out.println("Minuto: " + new SimpleDateFormat("mm").format(fechaParseada));
		System.out.println("Segundo: " + new SimpleDateFormat("ss").format(fechaParseada));
		System.out.println();
		
		
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Ahora más 20 días : " + fechaCalendar.getTime());
		fechaCalendar.add(Calendar.WEEK_OF_YEAR, -2);
		System.out.println("Ahora menos 2 semanas : " + fechaCalendar.getTime());
		fechaCalendar.add(Calendar.YEAR, 4);
		System.out.println("Ahora más 4 años : " + fechaCalendar.getTime());
		
	}

}
