package capitulo09.Ejercicios.vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import capitulo09.Ejercicios.controladores.ControladorCurso;
import capitulo09.Ejercicios.controladores.ControladorMateria;
import capitulo09.Ejercicios.controladores.ControladorValoracion;
import capitulo09.Ejercicios.entidades.Curso;
import capitulo09.Ejercicios.entidades.ValoracionMateria;

public class PanelValoracionMateria extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfIdProfesor;
	private JTextField jtfIdEstudiante;
	private JTextField jtfIdMateria;
	private JTextField jtfValoracion;
	
	public PanelValoracionMateria() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		JButton btnPrimero = new JButton("");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarPrimero();
			}
		});
		btnPrimero.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotostart.png")));
		toolBar.add(btnPrimero);
		
		JButton btnAnterior = new JButton("");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarAnterior();
			}
		});
		btnAnterior.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/previous.png")));
		toolBar.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarSiguiente();
			}
		});
		btnSiguiente.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/next.png")));
		toolBar.add(btnSiguiente);
		
		JButton btnUltimo = new JButton("");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarUltimo();
			}
		});
		btnUltimo.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotoend.png")));
		toolBar.add(btnUltimo);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/guardar.png")));
		toolBar.add(btnGuardar);
		
		JButton btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		btnNuevo.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/nuevo.png")));
		toolBar.add(btnNuevo);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		btnEliminar.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/eliminar.png")));
		toolBar.add(btnEliminar);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Valoración Materia");
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
		
		JLabel lblNewLabel_1 = new JLabel("ID Profesor:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfIdProfesor = new JTextField();
		GridBagConstraints gbc_jtfIdProfesor = new GridBagConstraints();
		gbc_jtfIdProfesor.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdProfesor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdProfesor.gridx = 1;
		gbc_jtfIdProfesor.gridy = 2;
		panel.add(jtfIdProfesor, gbc_jtfIdProfesor);
		jtfIdProfesor.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Estudiante:");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 3;
		panel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		jtfIdEstudiante = new JTextField();
		jtfIdEstudiante.setColumns(10);
		GridBagConstraints gbc_jtfIdEstudiante = new GridBagConstraints();
		gbc_jtfIdEstudiante.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdEstudiante.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdEstudiante.gridx = 1;
		gbc_jtfIdEstudiante.gridy = 3;
		panel.add(jtfIdEstudiante, gbc_jtfIdEstudiante);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID Materia:");
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2.gridx = 0;
		gbc_lblNewLabel_1_2.gridy = 4;
		panel.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		jtfIdMateria = new JTextField();
		jtfIdMateria.setColumns(10);
		GridBagConstraints gbc_jtfIdMateria = new GridBagConstraints();
		gbc_jtfIdMateria.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdMateria.gridx = 1;
		gbc_jtfIdMateria.gridy = 4;
		panel.add(jtfIdMateria, gbc_jtfIdMateria);
		
		JLabel lblNewLabel_1_3 = new JLabel("Valoración:");
		GridBagConstraints gbc_lblNewLabel_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_1_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_3.gridx = 0;
		gbc_lblNewLabel_1_3.gridy = 5;
		panel.add(lblNewLabel_1_3, gbc_lblNewLabel_1_3);
		
		jtfValoracion = new JTextField();
		jtfValoracion.setColumns(10);
		GridBagConstraints gbc_jtfValoracion = new GridBagConstraints();
		gbc_jtfValoracion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfValoracion.gridx = 1;
		gbc_jtfValoracion.gridy = 5;
		panel.add(jtfValoracion, gbc_jtfValoracion);

	}

	/**
	 * 
	 */
	private void cargarPrimero() {
		ValoracionMateria o = ControladorValoracion.getPrimero();
		muestraEnPantalla(o);
	}
	
	private void cargarUltimo() {
		muestraEnPantalla(ControladorValoracion.getUltimo());
	}
	
	private void cargarSiguiente() {
		if(this.jtfId.getText().equalsIgnoreCase("")) this.jtfId.setText("0");
		muestraEnPantalla(ControladorValoracion.getSiguiente(Integer.parseInt(this.jtfId.getText())));
	}
	
	private void cargarAnterior() {
		if(this.jtfId.getText().equalsIgnoreCase("")) this.jtfId.setText("2");
		muestraEnPantalla(ControladorValoracion.getAnterior(Integer.parseInt(this.jtfId.getText())));
	}
	
	
	private void muestraEnPantalla(ValoracionMateria o) {
		if (o != null) {
			this.jtfId.setText("" + o.getId());
			this.jtfIdProfesor.setText("" + o.getIdProfesor());
			this.jtfIdMateria.setText("" + o.getIdMateria());
			this.jtfIdEstudiante.setText("" + o.getIntEstudiante());
			this.jtfValoracion.setText("" + o.getValoracion());
		}
	}
	
	private void guardar() {
		try {
			ValoracionMateria c = new ValoracionMateria();
			c.setId(-1);
			if(!this.jtfId.getText().trim().equals("")) { //Si el id no es algo vacío
				c.setId(Integer.parseInt(jtfId.getText()));
			}
			c.setIdMateria(Integer.parseInt(this.jtfIdMateria.getText()));
			c.setIdProfesor(Integer.parseInt(this.jtfIdProfesor.getText()));
			c.setIntEstudiante(Integer.parseInt(this.jtfIdEstudiante.getText()));
			c.setValoracion(Integer.parseInt(this.jtfValoracion.getText()));
			//Decido si debo insertar o modificar
			if(c.getId() == -1) {
				ControladorValoracion.insert(c);
			}else {
				ControladorValoracion.update(c);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void nuevo() {
		this.jtfId.setText("");
		this.jtfIdProfesor.setText("");
		this.jtfIdMateria.setText("");
		this.jtfIdEstudiante.setText("");
		this.jtfValoracion.setText("");
	}
	
	private void eliminar() {
		ControladorValoracion.delete(Integer.parseInt(this.jtfId.getText()));
		this.jtfId.setText("");
		this.jtfIdProfesor.setText("");
		this.jtfIdMateria.setText("");
		this.jtfIdEstudiante.setText("");
		this.jtfValoracion.setText("");
	}
	
}
