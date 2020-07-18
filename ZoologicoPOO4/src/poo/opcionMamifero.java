package poo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class opcionMamifero {

	JFrame frmRegistroDeMamifero;
	private JTextField Nombre;
	private JTextField Genero;
	private JTextField Edad;

	/**
	 * Create the application.
	 */
	public opcionMamifero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeMamifero = new JFrame();
		frmRegistroDeMamifero.setTitle("Ventana para registrar un Mamifero");
		frmRegistroDeMamifero.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\ZoologicoPOO2\\icono.png"));
	 	frmRegistroDeMamifero.setBounds(100, 100, 681, 375);
		frmRegistroDeMamifero.getContentPane().setLayout(null);
		
		JLabel ventanam = new JLabel("Registro de Mamifero");
		ventanam.setBounds(184, 11, 264, 39);
		ventanam.setFont(new Font("Calibri", Font.BOLD, 17));
		ventanam.setHorizontalAlignment(SwingConstants.CENTER);
		frmRegistroDeMamifero.getContentPane().add(ventanam);
		
		Nombre = new JTextField();
		Nombre.setBounds(272, 85, 339, 20);
		frmRegistroDeMamifero.getContentPane().add(Nombre);
		Nombre.setColumns(10);
		
		JLabel nombreM = new JLabel("Nombre del Mamifero a Ingresar");
		nombreM.setFont(new Font("Calibri", Font.BOLD, 14));
		nombreM.setBounds(10, 82, 252, 20);
		frmRegistroDeMamifero.getContentPane().add(nombreM);
		
		JLabel generoM = new JLabel("Genero del Mamifero");
		generoM.setFont(new Font("Calibri", Font.BOLD, 14));
		generoM.setBounds(10, 138, 195, 20);
		frmRegistroDeMamifero.getContentPane().add(generoM);
		
		Genero = new JTextField();
		Genero.setBounds(272, 135, 342, 22);
		frmRegistroDeMamifero.getContentPane().add(Genero);
		Genero.setColumns(10);
		
		JLabel edad = new JLabel("Edad del mamifero");
		edad.setFont(new Font("Calibri", Font.BOLD, 14));
		edad.setBounds(10, 204, 165, 20);
		frmRegistroDeMamifero.getContentPane().add(edad);
		
		Edad = new JTextField();
		Edad.setBounds(272, 202, 86, 20);
		frmRegistroDeMamifero.getContentPane().add(Edad);
		Edad.setColumns(10);
		
		JButton botonvolver = new JButton("Volver");
		botonvolver.setBounds(566, 302, 89, 23);
		frmRegistroDeMamifero.getContentPane().add(botonvolver);
		botonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvolverActionPerformed(evt);
            }
		  });
		
		JButton btnNewButton = new JButton("Ingresar ");
		btnNewButton.setBounds(289, 258, 89, 23);
		frmRegistroDeMamifero.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evnt) {
				IngresarActionPerformed(evnt);
				
			}
		});
	}

	public JFrame getJPanel() {
		return this.frmRegistroDeMamifero;
		
	}
	private void botonvolverActionPerformed(java.awt.event.ActionEvent evt) {
		GUI interfazusuario = new GUI();
		interfazusuario.setVisible(true);
		frmRegistroDeMamifero.setVisible(false);
		frmRegistroDeMamifero.dispose();
		
	}
	private void IngresarActionPerformed(java.awt.event.ActionEvent evnt) {//METODO PARA AÑADIR LO INGRESADO A LA BASE DE DATOS
		Mamifero mamifero = new Mamifero();
		mamifero.setNombre(Nombre.getText());
		mamifero.setGenero(Genero.getText());
		mamifero.setEdad(Integer.parseInt(Edad.getText()));
		try {
			Object[] objeto = {mamifero.getNombre(),mamifero.getGenero(),mamifero.getEdad()};
			DB database = DB.getInstances();
			database.dbPrepareStatement(objeto,"INSERT INTO mamifero (NombreAnimal,Genero,Edad)"+"VALUES (?,?,?)" );
		}
		finally {
			JOptionPane.showMessageDialog(null,"Animal Agregado al zoologico!");
		}
		
		Nombre.setText("");
		Genero.setText("");
		Edad.setText("");//Esto reinicia los campos de texto
	}
	
}
