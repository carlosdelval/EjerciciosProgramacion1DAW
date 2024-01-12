package arkanoid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
				
				// Creo y muestro una ventana de 800x600 px
				creaYMuestraVentana();
				
				Scanner sc = new Scanner(System.in);
				String respuestaUsuario;
	}
	
	private static void creaYMuestraVentana() {
		JFrame ventana = new JFrame("Arkanoid");
		ventana.setBounds(0, 0, 800, 600);
		
		// Para colocar objetos sobre la ventana debo asignarle un "layout" (plantilla) al panel principal de la ventana
		ventana.getContentPane().setLayout(new BorderLayout());
		
		// Creo y agrego un canvas, es un objeto que permitirá dibujar sobre él
		MiCanvas canvas = new MiCanvas(null);
		canvas.setBackground(Color.WHITE);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		// Hago que la ventana sea visible
		ventana.setVisible(true);
		
	}

}
