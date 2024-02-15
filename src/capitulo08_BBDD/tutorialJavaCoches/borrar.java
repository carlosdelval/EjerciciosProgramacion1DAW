package capitulo08_BBDD.tutorialJavaCoches;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class borrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfCIF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					borrar frame = new borrar();
					frame.setVisible(true);
					frame.CargarPrimero();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public borrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestión de fabricantes");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weightx = 0.0;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.weightx = 1.0;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 2;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblCif = new JLabel("CIF:");
		GridBagConstraints gbc_lblCif = new GridBagConstraints();
		gbc_lblCif.insets = new Insets(0, 0, 5, 5);
		gbc_lblCif.gridx = 0;
		gbc_lblCif.gridy = 3;
		contentPane.add(lblCif, gbc_lblCif);
		
		jtfCIF = new JTextField();
		GridBagConstraints gbc_jtfCIF = new GridBagConstraints();
		gbc_jtfCIF.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCIF.gridx = 1;
		gbc_jtfCIF.gridy = 3;
		contentPane.add(jtfCIF, gbc_jtfCIF);
		jtfCIF.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		
		JButton btnPrimero = new JButton("");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn;
				try {
					conn = ConnectionManager.getConexion();
					Fabricante f = GestionFabricante.getPrimero(conn);
					cargaFabricanteEnPantalla(f);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPrimero.setIcon(new ImageIcon(borrar.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotostart.png")));
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jtfId.getText().equalsIgnoreCase("")) cargarAnterior(8);
				else cargarAnterior(Integer.parseInt(jtfId.getText()));
			}
		});
		btnAnterior.setIcon(new ImageIcon(borrar.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/previous.png")));
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jtfId.getText().equalsIgnoreCase("")) cargarSiguiente(0);
				else cargarSiguiente(Integer.parseInt(jtfId.getText()));
			}
		});
		btnSiguiente.setIcon(new ImageIcon(borrar.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/next.png")));
		panel.add(btnSiguiente);
		
		JButton btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfId.setText("");
				jtfNombre.setText("");
				jtfCIF.setText("");
			}
		});
		
		JButton btnUltimo = new JButton("");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn;
				try {
					conn = ConnectionManager.getConexion();
					Fabricante f = GestionFabricante.getUltimo(conn);
					cargaFabricanteEnPantalla(f);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUltimo.setIcon(new ImageIcon(borrar.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotoend.png")));
		panel.add(btnUltimo);
		btnNuevo.setIcon(new ImageIcon(borrar.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/nuevo.png")));
		panel.add(btnNuevo);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setIcon(new ImageIcon(borrar.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/guardar.png")));
		panel.add(btnGuardar);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminaFabricante(Integer.parseInt(jtfId.getText()));
			}
		});
		btnDelete.setIcon(new ImageIcon(borrar.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/eliminar.png")));
		panel.add(btnDelete);
	}
	
	private void cargarAnterior(int id) {
		
		Connection conn;
		try {
			conn = ConnectionManager.getConexion();
			Fabricante f = GestionFabricante.getAnterior(conn, id);
			cargaFabricanteEnPantalla(f);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private void cargarSiguiente(int id) {
		
		Connection conn;
		try {
			conn = ConnectionManager.getConexion();
			Fabricante f = GestionFabricante.getSiguiente(conn, id);
			cargaFabricanteEnPantalla(f);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private void CargarPrimero() {
		Connection conn;
		try {
			conn = ConnectionManager.getConexion();
			Fabricante f = GestionFabricante.getPrimero(conn);
			cargaFabricanteEnPantalla(f);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private void cargaFabricanteEnPantalla(Fabricante f) {
		if(f != null) {
			jtfId.setText("" +f.getId());
			jtfNombre.setText(f.getNombre());
			jtfCIF.setText(f.getCif());
		}
	}
	
	private void eliminaFabricante(int id){
		Connection conn;
		try {
			conn = ConnectionManager.getConexion();
			GestionFabricante.deleteFabricante(conn, id);
			jtfId.setText("");
			jtfNombre.setText("");
			jtfCIF.setText("");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private void guardar() {
		try {
			Fabricante f = new Fabricante();
			f.setId(-1);
			if(!this.jtfId.getText().trim().equals("")) { //Si el id no es algo vacío
				f.setId(Integer.parseInt(jtfId.getText()));
			}
			f.setCif(this.jtfCIF.getText());
			f.setNombre(this.jtfNombre.getText());
			//Decido si debo insertar o modificar
			Connection conn = ConnectionManager.getConexion();
			if(f.getId() == -1) {
				GestionFabricante.insertFabricante(conn, f);
			}else {
				GestionFabricante.updateFabricante(conn, f);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
