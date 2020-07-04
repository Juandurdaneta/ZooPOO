package poo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VerAnimales extends JFrame {
	private JPanel contenido;
	
	public VerAnimales (String g) {
		//CREACION DE LA VENTANA QUE MOSTRARA LOS ANIMALES EN PANTALLA
		setTitle("ZoologicoPOO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//DETIENE LA EJECUCION AL CERRAR LA VENTANA
		contenido = new JPanel();
		setContentPane(contenido);
		contenido.setLayout(null);
		setBounds(100, 100, 800,500);
		contenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//LABEL DE ENCABEZADO
		
		JLabel encabezado = new JLabel ("Lista de animales en el Zoologico");
		encabezado.setBounds(200, 25, 400, 25);
		contenido.add(encabezado);
		
		//JSCROLL PARA NAVEGAR ENTRE LOS ANIMALES
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 55, 693, 362);
		contenido.add(scrollPane);
		
		//IMPRESION DE LOS ANIMALES EN LA VENTANA
		
		JTextArea texto = new JTextArea(g);
		texto.setLineWrap(true);
		scrollPane.setViewportView(texto);
		setVisible(true);
	}
}
