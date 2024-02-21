package capitulo09.Ejercicios.vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;

import capitulo08_BBDD.tutorialJavaCoches.ConnectionManager;
import capitulo08_BBDD.tutorialJavaCoches.GestionFabricante;
import capitulo09.Ejercicios.controladores.ControladorCurso;
import capitulo09.Ejercicios.controladores.ControladorMateria;
import capitulo09.Ejercicios.entidades.Curso;
import capitulo09.Ejercicios.entidades.Materia;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class PanelMateria extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfAcronimo;
	private JTextField jtfNombre;
	private JComboBox<Curso> jcbCurso;

	/**
	 * Create the panel.
	 */
	public PanelMateria() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		JButton btnPrimero = new JButton("");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarPrimero();
			}
		});
		btnPrimero.setIcon(new ImageIcon(PanelMateria.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotostart.png")));
		toolBar.add(btnPrimero);
		
		JButton btnAnterior = new JButton("");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarAnterior();
			}
		});
		btnAnterior.setIcon(new ImageIcon(PanelMateria.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/previous.png")));
		toolBar.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarSiguiente();
			}
		});
		btnSiguiente.setIcon(new ImageIcon(PanelMateria.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/next.png")));
		toolBar.add(btnSiguiente);
		
		JButton btnUltimo = new JButton("");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarUltimo();
			}
		});
		btnUltimo.setIcon(new ImageIcon(PanelMateria.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotoend.png")));
		toolBar.add(btnUltimo);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setIcon(new ImageIcon(PanelMateria.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/guardar.png")));
		btnGuardar.setSelectedIcon(null);
		toolBar.add(btnGuardar);
		
		JButton btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		btnNuevo.setIcon(new ImageIcon(PanelMateria.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/nuevo.png")));
		toolBar.add(btnNuevo);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		btnEliminar.setIcon(new ImageIcon(PanelMateria.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/eliminar.png")));
		toolBar.add(btnEliminar);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Gestión de Materia");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Curso:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jcbCurso = new JComboBox<Curso>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		panel.add(jcbCurso, gbc_comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Acrónimo:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfAcronimo = new JTextField();
		GridBagConstraints gbc_jtfAcronimo = new GridBagConstraints();
		gbc_jtfAcronimo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfAcronimo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfAcronimo.gridx = 1;
		gbc_jtfAcronimo.gridy = 3;
		panel.add(jtfAcronimo, gbc_jtfAcronimo);
		jtfAcronimo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 4;
		panel.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		
		//Cargo todos los cursos en el jcombo
		cargarTodosCursos();

	}

	/**
	 * 
	 */
	private void cargarPrimero() {
		Materia o = ControladorMateria.getPrimero();
		muestraEnPantalla(o);
	}
	
	private void cargarUltimo() {
		muestraEnPantalla(ControladorMateria.getUltimo());
	}
	
	private void cargarSiguiente() {
		if(this.jtfId.getText().equalsIgnoreCase("")) this.jtfId.setText("0");
		muestraEnPantalla(ControladorMateria.getSiguiente(Integer.parseInt(this.jtfId.getText())));
	}
	
	private void cargarAnterior() {
		if(this.jtfId.getText().equalsIgnoreCase("")) this.jtfId.setText("2");
		muestraEnPantalla(ControladorMateria.getAnterior(Integer.parseInt(this.jtfId.getText())));
	}
	
	
	private void muestraEnPantalla(Materia o) {
		if (o != null) {
			this.jtfId.setText("" + o.getId());
			
			for(int i = 0; i < jcbCurso.getItemCount(); i++) {
				if(jcbCurso.getItemAt(i).getId() == o.getCursoId()) {
					jcbCurso.setSelectedIndex(i);
				}
			}
			this.jtfAcronimo.setText(o.getAcronimo());
			this.jtfNombre.setText(o.getNombre());
		}
	}
	
	private void cargarTodosCursos() {
		List<Curso> l = ControladorCurso.getTodos();
		for(Curso o : l) {
			jcbCurso.addItem(o);
		}
	}
	
	private void guardar() {
		try {
			Materia m = new Materia();
			m.setId(-1);
			if(!this.jtfId.getText().trim().equals("")) { //Si el id no es algo vacío
				m.setId(Integer.parseInt(jtfId.getText()));
			}
			m.setAcronimo(this.jtfAcronimo.getText());
			m.setNombre(this.jtfNombre.getText());
			int cursoId = ((Curso)this.jcbCurso.getSelectedItem()).getId();
			m.setCursoId(cursoId);
			//Decido si debo insertar o modificar
			if(m.getId() == -1) {
				ControladorMateria.insertMateria(m);
			}else {
				ControladorMateria.updateMateria(m);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void nuevo() {
		this.jtfId.setText("");
		this.jtfNombre.setText("");
		this.jtfAcronimo.setText("");
		this.jcbCurso.setSelectedItem(null);
	}
	
	private void eliminar() {
		ControladorMateria.deleteMateria(Integer.parseInt(this.jtfId.getText()));
		jtfId.setText("");
		jtfNombre.setText("");
		jtfAcronimo.setText("");
	}
}









