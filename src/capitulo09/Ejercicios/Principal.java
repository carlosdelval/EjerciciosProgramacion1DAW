package capitulo09.Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import capitulo09.Ejercicios.vista.PanelCurso;
import capitulo09.Ejercicios.vista.PanelEstudiante;
import capitulo09.Ejercicios.vista.PanelMateria;
import capitulo09.Ejercicios.vista.PanelProfesor;
import capitulo09.Ejercicios.vista.PanelValoracionMateria;
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
		PanelEstudiante panelEstudiante = new PanelEstudiante();
		PanelProfesor panelProfesor = new PanelProfesor();
		PanelValoracionMateria panelValoracion = new PanelValoracionMateria();
		
		JTabbedPane panelTabbed = new JTabbedPane();
		panelTabbed.addTab("Cursos", panelCurso);
		panelTabbed.addTab("Materias", panelMateria);
		panelTabbed.addTab("Estudiantes", panelEstudiante);
		panelTabbed.addTab("Profesores", panelProfesor);
		panelTabbed.addTab("Valoraciones", panelValoracion);
		panelTabbed.setSelectedIndex(0);
		
		this.getContentPane().add(panelTabbed);
		
		
		JMenuBar mnMenuBar = new JMenuBar();
		setJMenuBar(mnMenuBar);
		JMenu mnMenu = new JMenu("Archivo");
		mnMenuBar.add(mnMenu);
		
		JMenuItem curso = new JMenuItem("Curso");
		curso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelTabbed.setSelectedIndex(0);
			}
		});
		JMenuItem materia = new JMenuItem("Materia");
		materia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelTabbed.setSelectedIndex(1);
			}
		});
		JMenuItem estudiante = new JMenuItem("Estudiante");
		estudiante.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelTabbed.setSelectedIndex(2);
			}
		});
		JMenuItem profesor = new JMenuItem("Profesor");
		profesor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelTabbed.setSelectedIndex(3);
			}
		});
		JMenuItem valoracionMateria = new JMenuItem("Valoración Materia");
		valoracionMateria.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelTabbed.setSelectedIndex(4);
			}
		});
	

		
		
		mnMenu.add(curso);
		mnMenu.add(materia);
		mnMenu.add(estudiante);
		mnMenu.add(profesor);
		mnMenu.add(valoracionMateria);
	}
	

	public static void main(String[] args) {
		Principal ventana = new Principal();
		ventana.setVisible(true);
	}

}
