package capitulo09.Ejercicios;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import capitulo09.Ejercicios.vista.PanelCurso;
import capitulo09.Ejercicios.vista.PanelMateria;
import tutorialJava.capitulo9_AWT_SWING.utils.Apariencia;


public class Principal extends JFrame {
	
	// Establecer la apariencia típica de Windows
	static {
		Apariencia.setAparienciasOrdenadas(Apariencia.aparienciasOrdenadas);
	}

	
	public Principal() {
		super("Gestión de centro educativo");
		
		this.setBounds(0, 0, 800, 600);
		
		PanelCurso panelCurso = new PanelCurso();
		PanelMateria panelMateria = new PanelMateria();
		this.getContentPane().add(panelCurso);
		
		JTabbedPane panelTabbed = new JTabbedPane();
		panelTabbed.addTab("Cursos", panelCurso);
		panelTabbed.addTab("Materias", panelMateria);
		panelTabbed.setSelectedIndex(0);
		
		this.getContentPane().add(panelTabbed);
	}
	

	public static void main(String[] args) {
		Principal ventana = new Principal();
		ventana.setVisible(true);
	}

}
