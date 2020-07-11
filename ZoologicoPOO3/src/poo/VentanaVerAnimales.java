package poo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.TextArea;
import java.awt.ScrollPane;

public class VentanaVerAnimales {

	JFrame frame;

	public VentanaVerAnimales() {
		ArrayList <Object> objetos = new ArrayList<Object>();
		initialize(objetos);
		Mamifero leon = new Mamifero();
		leon.setNombre("Leon");
		leon.setEdad("4");
		leon.setGenero("Hembra");
		Aves Loro= new Aves();
		Loro.setNombre("Loro");
		Loro.setEdad("7");
		Loro.setGenero("Macho");
		Anfibio Rana= new Anfibio();
		Rana.setNombre("Rana");
		Rana.setEdad("7");
		Rana.setGenero("Macho");
		Pez Salmon= new Pez();
		Salmon.setNombre("Salmon");
		Salmon.setEdad("2");
		Salmon.setGenero("Hembra");
		Reptil Cocodrilo = new Reptil();
		Cocodrilo.setNombre("Cocodrilo");
		Cocodrilo.setEdad("18");
		Cocodrilo.setGenero("Macho");
		//AÑADIENDO LOS ANIMALES PREEDEFINIDOS A LA LISTA DE ANIMALES
		 
		 objetos.add(leon);
		 objetos.add(Loro);
		 objetos.add(Rana);
		 objetos.add(Salmon);
		 objetos.add(Cocodrilo);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ArrayList<Object> objetos) {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\ZoologicoPOO2\\icono.png"));
		frame.setBounds(100, 100, 682, 388);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animales ingresados en el Zoologico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel.setBounds(162, 0, 335, 50);
		frame.getContentPane().add(lblNewLabel);
		String msj = new String();
		for(int i=0; i<objetos.size(); i++) {
			msj += "Animal #"+(i+1)+"->"+objetos.get(i)+".\n\n";
				
			}
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(71, 56, 521, 240);
		frame.getContentPane().add(scrollPane);
		JTextArea textArea = new JTextArea(msj);
		textArea.setLineWrap(true);
		textArea.setVisible(true);
    		
	
		
		
		
		
			
	}
}
