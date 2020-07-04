package poo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class OpcionPez {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionPez window = new OpcionPez();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OpcionPez() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\ZoologicoPOO2\\icono.png"));
		frame.setBounds(100, 100, 681, 375);
		frame.getContentPane().setLayout(null);
		
		JLabel ventanam = new JLabel("Ventana para registrar un Pez");
		ventanam.setBounds(184, 11, 264, 39);
		ventanam.setFont(new Font("Calibri", Font.BOLD, 17));
		ventanam.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(ventanam);
		
		textField = new JTextField();
		textField.setBounds(272, 85, 339, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel nombreM = new JLabel("Nombre del Pez a Ingresar");
		nombreM.setFont(new Font("Calibri", Font.BOLD, 14));
		nombreM.setBounds(10, 82, 252, 20);
		frame.getContentPane().add(nombreM);
		
		JLabel generoM = new JLabel("Genero del Pez");
		generoM.setFont(new Font("Calibri", Font.BOLD, 14));
		generoM.setBounds(10, 138, 195, 20);
		frame.getContentPane().add(generoM);
		
		textField_1 = new JTextField();
		textField_1.setBounds(272, 135, 342, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel edad = new JLabel("Edad del Pez");
		edad.setFont(new Font("Calibri", Font.BOLD, 14));
		edad.setBounds(10, 204, 165, 20);
		frame.getContentPane().add(edad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 202, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton botonvolver = new JButton("Volver");
		botonvolver.setBounds(566, 302, 89, 23);
		frame.getContentPane().add(botonvolver);
		
		JButton btnNewButton = new JButton("Ingresar ");
		btnNewButton.setBounds(289, 258, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	public JFrame getJPanel() {
		return this.frame;
		
	}
}

