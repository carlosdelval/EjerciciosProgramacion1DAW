package estudiar.SimulacroExamenAltaUsuario.Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import estudiar.SimulacroExamenAltaUsuario.Controladores.ControladorAcuerdo;
import estudiar.SimulacroExamenAltaUsuario.Controladores.ControladorIdioma;
import estudiar.SimulacroExamenAltaUsuario.Controladores.ControladorPais;
import estudiar.SimulacroExamenAltaUsuario.Controladores.ControladorUsuario;
import estudiar.SimulacroExamenAltaUsuario.Entidades.Acuerdo;
import estudiar.SimulacroExamenAltaUsuario.Entidades.Idioma;
import estudiar.SimulacroExamenAltaUsuario.Entidades.Pais;
import estudiar.SimulacroExamenAltaUsuario.Entidades.Usuario;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class VistaAltaUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfEmail;
	private JTextField jtfUsuario;
	private JTextField jtfPassword;
	private JTextField jtfRepPassword;
	private JComboBox jcbPais;
	private JComboBox jcbIdioma;
	private JCheckBox jcheckTerminos;
	private JButton jbtnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAltaUsuario frame = new VistaAltaUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaAltaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 0;
		contentPane.add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfUsuario = new JTextField();
		GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
		gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUsuario.gridx = 1;
		gbc_jtfUsuario.gridy = 1;
		contentPane.add(jtfUsuario, gbc_jtfUsuario);
		jtfUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfPassword = new JTextField();
		GridBagConstraints gbc_jtfPassword = new GridBagConstraints();
		gbc_jtfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPassword.gridx = 1;
		gbc_jtfPassword.gridy = 2;
		contentPane.add(jtfPassword, gbc_jtfPassword);
		jtfPassword.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Repetición Password:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfRepPassword = new JTextField();
		GridBagConstraints gbc_jtfRepPassword = new GridBagConstraints();
		gbc_jtfRepPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jtfRepPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfRepPassword.gridx = 1;
		gbc_jtfRepPassword.gridy = 3;
		contentPane.add(jtfRepPassword, gbc_jtfRepPassword);
		jtfRepPassword.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("País:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jcbPais = new JComboBox();
		GridBagConstraints gbc_jcbPais = new GridBagConstraints();
		gbc_jcbPais.insets = new Insets(0, 0, 5, 0);
		gbc_jcbPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbPais.gridx = 1;
		gbc_jcbPais.gridy = 4;
		contentPane.add(jcbPais, gbc_jcbPais);
		jcbPais.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (jcbPais.getSelectedItem() != null) cargaIdiomas((Pais)jcbPais.getSelectedItem());
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("Idioma:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jcbIdioma = new JComboBox();
		GridBagConstraints gbc_jcbIdioma = new GridBagConstraints();
		gbc_jcbIdioma.insets = new Insets(0, 0, 5, 0);
		gbc_jcbIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdioma.gridx = 1;
		gbc_jcbIdioma.gridy = 5;
		contentPane.add(jcbIdioma, gbc_jcbIdioma);
		jcbIdioma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (jcbIdioma.getSelectedItem() != null) cargaAcuerdo((Idioma)jcbIdioma.getSelectedItem());
			}
		});
		
		jcheckTerminos = new JCheckBox("Acepta los términos del alta de usuario");
		GridBagConstraints gbc_jcheckTerminos = new GridBagConstraints();
		gbc_jcheckTerminos.anchor = GridBagConstraints.WEST;
		gbc_jcheckTerminos.gridwidth = 2;
		gbc_jcheckTerminos.insets = new Insets(0, 0, 5, 0);
		gbc_jcheckTerminos.gridx = 0;
		gbc_jcheckTerminos.gridy = 6;
		contentPane.add(jcheckTerminos, gbc_jcheckTerminos);
		
		jbtnGuardar = new JButton("Guardar");
		jbtnGuardar.setEnabled(false);
		jbtnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardaUsuario();
			}
		});
		GridBagConstraints gbc_jbtnGuardar = new GridBagConstraints();
		gbc_jbtnGuardar.anchor = GridBagConstraints.EAST;
		gbc_jbtnGuardar.gridx = 1;
		gbc_jbtnGuardar.gridy = 7;
		contentPane.add(jbtnGuardar, gbc_jbtnGuardar);
		
		jcheckTerminos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				activaBoton();
			}
		});
		
		cargaPaises();
	}
	
	private void cargaPaises() {
		List<Pais> paises = ControladorPais.findAll();
		this.jcbPais.removeAllItems();
		
		for (Pais p : paises) {
			this.jcbPais.addItem(p);
		}
	}
	
	private void cargaIdiomas (Pais p) {
		List<Idioma> idiomas = ControladorIdioma.findAll(p);
		this.jcbIdioma.removeAllItems();
		
		for (Idioma i : idiomas) {
			this.jcbIdioma.addItem(i);
		}
	}
	
	private void guardaUsuario() {
		Usuario u = new Usuario();
		u.setEmail(jtfEmail.getText());
		u.setIdIdioma(((Idioma)jcbIdioma.getSelectedItem()).getId());;
		u.setPassword(jtfPassword.getText());
		u.setUsuario(jtfUsuario.getText());
		if(compruebaUsuario() == true || compruebaContrasenia() == true) return;
		if(ControladorUsuario.update(u) == 1) JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
		else JOptionPane.showMessageDialog(null, "Usuario NO registrado correctamente.");
	}
	
	private void cargaAcuerdo(Idioma i) {
		Acuerdo a = ControladorAcuerdo.obtenerAcuerdo(i);
		jcheckTerminos.setText(a.getDescripcion());
	}
	
	private Boolean compruebaContrasenia() {
		Boolean mayus = false;
		Boolean minus = false;
		Boolean digito = false;
		String pass = jtfPassword.getText();
		
		if(!pass.equals(jtfRepPassword.getText())) {
			JOptionPane.showMessageDialog(null, "Las contraseñas deben coincidir.");
			return true;
		}
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) digito = true;
			if (Character.isUpperCase(pass.charAt(i))) mayus = true;
			if (Character.isLowerCase(pass.charAt(i))) minus = true;
		}
		if(!digito | !mayus | !minus) {
			JOptionPane.showMessageDialog(null, "Las contraseñas deben contener al menos una mayúscula, una minúscula y un dígito.");
			return true;
		}
		
		return false;
	}
	
	private Boolean compruebaUsuario() {
		List<Usuario> usuarios = ControladorUsuario.getUsuarios();
		
		if(jtfUsuario.getText().length() < 8) {
			JOptionPane.showMessageDialog(null, "El usuario debe contener 8 o más caracteres.");
			return true;
		}
		
		for (Usuario u : usuarios) {
			if(u.getUsuario().equals(jtfUsuario.getText())){
				JOptionPane.showMessageDialog(null, "El usuario ya está registrado. Elija otro.");
				return true;
			}
		}
		
		return false;
	}
	
	private void activaBoton() {
		if(jcheckTerminos.isSelected()) jbtnGuardar.setEnabled(true);
		else jbtnGuardar.setEnabled(false);
	}

}
