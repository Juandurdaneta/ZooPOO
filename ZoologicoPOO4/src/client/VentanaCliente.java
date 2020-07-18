package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaCliente {

	public JFrame frame;
	private JTextField CampoDeTexto;
	private Cliente cliente;
	static JTextArea textArea = new JTextArea();
	

	
	public VentanaCliente() {
		initialize();
		String nombre = "";
		do {
			nombre= JOptionPane.showInputDialog("Introduce tu nombre de usuario");
			if (nombre.contentEquals("")) {
				JOptionPane.showMessageDialog(null,"El usuario introducido es incorrecto!, debe contener al menos un caracter");
			}
		}while (nombre.contentEquals(""));
		cliente = new Cliente(nombre ,"localhost",12346);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\ZoologicoPOO4\\icono.png"));
		frame.setResizable(false);
		frame.setTitle("Chat del Zoologico");
		frame.setBounds(100, 100, 603, 418);
		frame.getContentPane().setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 598, 345);
		frame.getContentPane().add(scrollPane);
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 345, 598, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		CampoDeTexto = new JTextField();
		CampoDeTexto.setBounds(10, 6, 469, 20);
		panel.add(CampoDeTexto);
		CampoDeTexto.setColumns(55);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JButton botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.enviar(CampoDeTexto.getText());
				CampoDeTexto.setText("");
				if (!CampoDeTexto.getText().equals("")) {
					cliente.enviar(CampoDeTexto.getText());
					
				}
			}
		});
		botonEnviar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botonEnviar.setBounds(489, 4, 78, 23);
		panel.add(botonEnviar);
		
		frame.setLocationRelativeTo(null);
		
	}
	
	public static void ImprimirEnConsola(String msj) {
		textArea.setText(textArea.getText()+msj+"\n");
	}
}
