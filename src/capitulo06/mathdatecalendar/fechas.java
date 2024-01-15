package capitulo06.mathdatecalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fechaIntroducida = JOptionPane.showInputDialog("Introduzca su fecha: ");
		SimpleDateFormat fecha = new SimpleDateFormat (fechaIntroducida);
		
		Calendar fechaCalendar = Calendar.getInstance();
	}

}
