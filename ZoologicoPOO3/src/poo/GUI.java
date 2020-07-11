package poo;
import javax.swing.*;



import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.Color;
//VENTANA PRINCIPAL DE LA INTERFAZ

class GUI extends JFrame implements ActionListener{
	  	private JPanel ventana;
	    private JButton opcion1= new JButton("Ver Animales en el Zoologico");
		private JButton opcion2 = new JButton("Añadir animales en el Zoologico");
		private JLabel Titulo;
		private JTextField NombreAnimal = new JTextField();
		private JTextField EdadAnimal = new JTextField();
		private JTextField GeneroAnimal = new JTextField();
		Animal animal = new Animal();
		Mamifero mamifero = new Mamifero();
		Anfibio anfibio = new Anfibio();
		Aves aves = new Aves();
		Reptil reptil = new Reptil();
		Pez peces = new Pez();
		
	public GUI() {
		setResizable(false);
		//METODO PARA QUE LA VENTANA APAREZCA EN MEDIO DE LA PANTALLA
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		 
		 Dimension tamañopantalla=pantalla.getScreenSize();
		 
		 int alturapantalla=tamañopantalla.height;
		 int anchopantalla=tamañopantalla.width;
		 
		 setSize(anchopantalla/2,alturapantalla/2);
		 setLocation(anchopantalla/4,alturapantalla/4);
		 setTitle("ZoologicoPOO");
		 
		 
		 //AÑADIENDO LOGO A LA VENTANA
		 Image Logotipo=pantalla.getImage("icono.png");
		 setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\ZoologicoPOO2\\icono.png"));
		 
		 
		 //VENTANA DONDE VAN LOS BOTONES Y LOS LABELS
		 
		 
			this.ventana= new JPanel();
			getContentPane().add(ventana);
		ventana.setLayout(null);
		
		//TITULO DE LA APLICACION
		
		this.Titulo= new JLabel("Bienvenido/a a la aplicacion del Zoologico");
		Titulo.setBounds(191, 31, 400, 25);
		Titulo.setFont(new Font("Calibri", Font.BOLD, 17));
		this.ventana.add(Titulo);
		opcion1.setBounds(100, 100, 200, 40);
		opcion1.setFont(new Font("Calibri", Font.BOLD, 13));
		this.ventana.add(opcion1);
		this.opcion1.addActionListener(this);
		opcion2.setBounds(350, 100, 215, 40);
		opcion2.setFont(new Font("Calibri", Font.BOLD, 13));
		this.ventana.add(opcion2);
		
		Button botonsalir = new Button("Salir de la app");
		botonsalir.setBounds(529, 305, 138, 40);
		botonsalir.setBackground(SystemColor.scrollbar);
		botonsalir.setFont(new Font("Calibri", Font.BOLD, 12));
		ventana.add(botonsalir);
		this.opcion2.addActionListener(this);	
		
		//AÑADIENDO LA LISTA DE ANIMALES PREDEFINIDOS 
		
		AnimalesPredefinidos();
		animal.Imprimirlistadeanimales();
	}
		
//OPCION VER LISTA DE ANIMALES
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==opcion1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						
						VentanaVerAnimales window = new VentanaVerAnimales();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
		}
		
			//VENTANA PARA ELEGIR TIPO DE ANIMAL
		
		if (e.getSource()==opcion2) {
			this.opcion1.setVisible(false);
			this.opcion2.setVisible(false);
			this.Titulo.setVisible(false);
			JLabel texto2= new JLabel("Seleccione que tipo de Animal desea Añadir");
			texto2.setBounds(200, 25, 400, 25);
			//OPCION MAMIFERO
			JButton opcionAñadirMamiferos = new JButton("Mamifero");
			opcionAñadirMamiferos.setVisible(true);
			opcionAñadirMamiferos.setBounds(215, 80,  200, 40);
			opcionAñadirMamiferos.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								opcionMamifero window = new opcionMamifero();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
					
				}
				
			});
			
			//OPCION AVE
			JButton opcionAñadirAves = new JButton("Ave");
			opcionAñadirAves.setVisible(true);
			opcionAñadirAves.setBounds(215, 120,  200, 40);
			opcionAñadirAves.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								opcionAve window = new opcionAve();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
					
				}
				
			});
			//OPCION ANFIBIO
			JButton opcionAñadirAnfibios = new JButton("Anfibio");
			opcionAñadirAnfibios.setVisible(true);
			opcionAñadirAnfibios.setBounds(215, 160,  200, 40);opcionAñadirAnfibios.addActionListener(new ActionListener() {

				@Override
				
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								OpcionAnfibio window = new OpcionAnfibio();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
					
				}
				
			});
			//OPCION PEZ
			JButton opcionAñadirPez = new JButton("Pez");
			opcionAñadirPez.setVisible(true);
			opcionAñadirPez.setBounds(215, 195,  200, 40);opcionAñadirPez.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dispose();
					
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
				
			});
			//OPCION REPTIL
			JButton opcionAñadirReptil = new JButton("Reptil");
			opcionAñadirReptil.setVisible(true);
			opcionAñadirReptil.setBounds(215, 230,  200, 40);opcionAñadirReptil.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								opcionReptil window = new opcionReptil();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
					
				}
				
			});
			
			this.ventana.add(texto2);this.ventana.add(opcionAñadirMamiferos);this.ventana.add(opcionAñadirAves);this.ventana.add(opcionAñadirAnfibios);this.ventana.add(opcionAñadirPez);this.ventana.add(opcionAñadirReptil);
			
		}
		
	}


	public void DatosIngresados(JPanel DatoAnimal) {
		NombreAnimal.setBounds(200, 30, 50, 20);
		EdadAnimal.setBounds(200, 60, 120, 20);
		GeneroAnimal.setBounds(200, 90, 120, 20);
		DatoAnimal.add(NombreAnimal);
		DatoAnimal.add(EdadAnimal);
		DatoAnimal.add(GeneroAnimal);
		NombreAnimal.setText("");
		EdadAnimal.setText("");
		GeneroAnimal.setText("");
		setVisible(true);
		}
	
	//LISTA DE ANIMALES PREDEFINIDOS EN EL ZOOLOGICO
	public void AnimalesPredefinidos() {
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
		 ArrayList <Object> objetos = new ArrayList<Object>(); 
		 objetos.add(leon);
		 objetos.add(Loro);
		 objetos.add(Rana);
		 objetos.add(Salmon);
		 objetos.add(Cocodrilo);
		/**animal.setAnimal(Cocodrilo);
		animal.setAnimal(Salmon);
		animal.setAnimal(Rana);
		animal.setAnimal(Loro);
		animal.setAnimal(leon);**/
	}
}

