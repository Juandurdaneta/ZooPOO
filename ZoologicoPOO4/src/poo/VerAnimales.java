package poo;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VerAnimales extends JFrame {
	private JPanel contenido;
	
	public VerAnimales (String g) {
		//CREACION DE LA VENTANA QUE MOSTRARA LOS ANIMALES EN PANTALLA
		setTitle("ZoologicoPOO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//DETIENE LA EJECUCION AL CERRAR LA VENTANA
		contenido = new JPanel();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\ZoologicoPOO2\\icono.png"));
		setContentPane(contenido);
		contenido.setLayout(null);
		setBounds(100, 100, 682, 388);
		contenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//LABEL DE ENCABEZADO
		
		JLabel encabezado = new JLabel ("Lista de animales del tipo seleccionado");
		encabezado.setBounds(200, 25, 400, 25);
		encabezado.setHorizontalAlignment(SwingConstants.CENTER);
		encabezado.setFont(new Font("Calibri", Font.BOLD, 18));
		encabezado.setBounds(162, 0, 335, 50);
		contenido.add(encabezado);
		
		//JSCROLL PARA NAVEGAR ENTRE LOS ANIMALES
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 55, 600, 250);
		contenido.add(scrollPane);
	
		
		//IMPRESION DE LOS ANIMALES EN LA VENTANA
		
		JTextArea texto = new JTextArea(g);
		texto.setLineWrap(true);
		texto.setEditable(false);
		scrollPane.setViewportView(texto);
		setVisible(true);
		//Boton para volver
		
		JButton botonvolver = new JButton("Volver");
		botonvolver.setBounds(566, 315, 89, 23);
		contenido.add(botonvolver);
		botonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvolverActionPerformed(evt);
            }
		  });
		
		
	}
	private void botonvolverActionPerformed(java.awt.event.ActionEvent evt) {
		GUI interfazusuario = new GUI();
		interfazusuario.setVisible(true);
		contenido.setVisible(false);
		dispose();
		
	}
}
