package poo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.TextArea;

public class VentanaVerAnimales {

	JFrame frame;

	public VentanaVerAnimales() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\ZoologicoPOO2\\icono.png"));
		frame.setBounds(100, 100, 682, 388);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animales ingresados en el Zoologico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel.setBounds(162, 0, 335, 50);
		frame.getContentPane().add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(103, 56, 463, 252);
		frame.getContentPane().add(textArea);
	}
}
