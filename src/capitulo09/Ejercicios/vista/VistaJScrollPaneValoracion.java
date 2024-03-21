package capitulo09.Ejercicios.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class VistaJScrollPaneValoracion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfEstudiante1;
	private JTextField jtfEstudiante2;
	private JTextField jtfEstudiante3;
	private JLabel lblEstudiante1;
	private JLabel lblEstudiante2;
	private JLabel lblEstudiante3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaJScrollPaneValoracion frame = new VistaJScrollPaneValoracion();
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
	public VistaJScrollPaneValoracion() {
		setLayout(new BorderLayout(0, 0));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#f6f7a3"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblEstudiante1 = new JLabel("Estudiante 1:");
		GridBagConstraints gbc_lblEstudiante1 = new GridBagConstraints();
		gbc_lblEstudiante1.anchor = GridBagConstraints.EAST;
		gbc_lblEstudiante1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstudiante1.gridx = 0;
		gbc_lblEstudiante1.gridy = 0;
		contentPane.add(lblEstudiante1, gbc_lblEstudiante1);
		
		jtfEstudiante1 = new JTextField();
		GridBagConstraints gbc_jtfEstudiante1 = new GridBagConstraints();
		gbc_jtfEstudiante1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEstudiante1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEstudiante1.gridx = 1;
		gbc_jtfEstudiante1.gridy = 0;
		contentPane.add(jtfEstudiante1, gbc_jtfEstudiante1);
		jtfEstudiante1.setColumns(10);
		
		lblEstudiante2 = new JLabel("Estudiante 2:");
		GridBagConstraints gbc_lblEstudiante2 = new GridBagConstraints();
		gbc_lblEstudiante2.anchor = GridBagConstraints.EAST;
		gbc_lblEstudiante2.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstudiante2.gridx = 0;
		gbc_lblEstudiante2.gridy = 1;
		contentPane.add(lblEstudiante2, gbc_lblEstudiante2);
		
		jtfEstudiante2 = new JTextField();
		GridBagConstraints gbc_jtfEstudiante2 = new GridBagConstraints();
		gbc_jtfEstudiante2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEstudiante2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEstudiante2.gridx = 1;
		gbc_jtfEstudiante2.gridy = 1;
		contentPane.add(jtfEstudiante2, gbc_jtfEstudiante2);
		jtfEstudiante2.setColumns(10);
		
		lblEstudiante3 = new JLabel("Estudiante 3:");
		GridBagConstraints gbc_lblEstudiante3 = new GridBagConstraints();
		gbc_lblEstudiante3.anchor = GridBagConstraints.EAST;
		gbc_lblEstudiante3.insets = new Insets(0, 0, 0, 5);
		gbc_lblEstudiante3.gridx = 0;
		gbc_lblEstudiante3.gridy = 2;
		contentPane.add(lblEstudiante3, gbc_lblEstudiante3);
		
		jtfEstudiante3 = new JTextField();
		GridBagConstraints gbc_jtfEstudiante3 = new GridBagConstraints();
		gbc_jtfEstudiante3.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEstudiante3.gridx = 1;
		gbc_jtfEstudiante3.gridy = 2;
		contentPane.add(jtfEstudiante3, gbc_jtfEstudiante3);
		jtfEstudiante3.setColumns(10);
	}
	
	

}
