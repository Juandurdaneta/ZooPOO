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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.Color;
import client.*;
import server.*;
//VENTANA PRINCIPAL DE LA INTERFAZ

class GUI extends JFrame implements ActionListener{
	  	private JPanel ventana;
	    private JButton opcion1= new JButton("Ver Animales en el Zoologico");
		private JButton opcion2 = new JButton("Añadir animales en el Zoologico");
		private JButton opcion3 = new JButton("Chat de la aplicacion");
		private JLabel Titulo;
		JButton botonvolver = new JButton("Volver");
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
		//Boton 1
		opcion1.setBounds(100, 100, 200, 40);
		opcion1.setFont(new Font("Calibri", Font.BOLD, 13));
		this.ventana.add(opcion1);
		this.opcion1.addActionListener(this);
		//Boton 2
		opcion2.setBounds(350, 100, 215, 40);
		opcion2.setFont(new Font("Calibri", Font.BOLD, 13));
		this.ventana.add(opcion2);
		this.opcion2.addActionListener(this);	
		//Boton 3
		opcion3.setBounds(220, 200, 215, 40);
		opcion3.setFont(new Font("Calibri",Font.BOLD, 13));
		this.ventana.add(opcion3);
		this.opcion3.addActionListener(this);
		
		//Boton para volver
		
		botonvolver.setBounds(566, 302, 89, 23);
		ventana.add(botonvolver);
		botonvolver.setVisible(false);
		botonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvolverActionPerformed(evt);
            }
		  });
		
		
		
	}
		
//OPCION VER LISTA DE ANIMALES
	@Override
	public void actionPerformed(ActionEvent e) {
		this.opcion1.setVisible(false);
		this.opcion2.setVisible(false);this.opcion3.setVisible(false);
		this.Titulo.setVisible(false);this.botonvolver.setVisible(true);
		JLabel texto3= new JLabel("Seleccione el tipo de Animal que desea Imprimir");
		texto3.setFont(new Font("Calibri", Font.BOLD, 17));
		texto3.setBounds(175, 5, 400, 75);
		
		// BOTON PARA IMPRIMIR MAMIFEROS
		
		JButton opcionMostrarMamiferos = new JButton("1. Mamiferos");
		
		
		
		opcionMostrarMamiferos.setVisible(true);
		opcionMostrarMamiferos.setBounds(100, 80,  200, 40);
		
		ventana.add(opcionMostrarMamiferos);
		ventana.add(texto3);
		opcionMostrarMamiferos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {
				setVisible(false);
				dispose();
				DB database = DB.getInstances();
				String query = "SELECT *FROM mamifero";
				ResultSet rs = database.dbStatementImprimir(query);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						String imprimir = new String();
						try {
							
							while (rs.next()) {
								imprimir += "Nombre del animal : "+rs.getString(1)+"\nGenero del animal : "+rs.getString(2)+"\nEdad del animal : "+rs.getInt(3)+"\n-------------------------------------------------\n";
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						finally {
							try {
								rs.close();
								
							}catch(SQLException a) {
								a.printStackTrace();
							}
						}
						VerAnimales ver = new VerAnimales(imprimir);
						
					}
					
					
				});
			}
			
		});
		// BOTON PARA IMPRIMIR AVES
		JButton opcionMostrarAves = new JButton("2. Aves");
		opcionMostrarAves.setBounds(350, 80,  200, 40);
		opcionMostrarAves.setVisible(true);
		ventana.add(opcionMostrarAves);
		opcionMostrarAves.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {
				setVisible(false);
				dispose();
				DB database = DB.getInstances();
				String query = "SELECT *FROM ave";
				ResultSet rs = database.dbStatementImprimir(query);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						String imprimir = new String();
						try {
							
							while (rs.next()) {
								imprimir += "Nombre del animal : "+rs.getString(1)+"\nGenero del animal : "+rs.getString(2)+"\nEdad del animal : "+rs.getInt(3)+"\n-------------------------------------------------\n";
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						finally {
							try {
								rs.close();
								
							}catch(SQLException a) {
								a.printStackTrace();
							}
						}
						VerAnimales ver = new VerAnimales(imprimir);
						
					}
					
					
				});
			}
			
		});
	//BOTON PARA IMPRIMIR ANFIBIOS
		
JButton opcionMostrarAnfibios = new JButton("3. Anfibios");
		
		
		
		opcionMostrarAnfibios.setVisible(true);
		opcionMostrarAnfibios.setBounds(100, 150,  200, 40);
		
		ventana.add(opcionMostrarAnfibios);
		
		opcionMostrarAnfibios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {
				setVisible(false);
				dispose();
				DB database = DB.getInstances();
				String query = "SELECT *FROM anfibio";
				ResultSet rs = database.dbStatementImprimir(query);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						String imprimir = new String();
						try {
							
							while (rs.next()) {
								imprimir += "Nombre del animal : "+rs.getString(1)+"\nGenero del animal : "+rs.getString(2)+"\nEdad del animal : "+rs.getInt(3)+"\n-------------------------------------------------\n";
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						finally {
							try {
								rs.close();
								
							}catch(SQLException a) {
								a.printStackTrace();
							}
						}
						VerAnimales ver = new VerAnimales(imprimir);
						
						
					}
					
					
				});
			}
			
		});
		
		//BOTON PARA IMPRIMIR PECES 
		
		

		JButton opcionMostrarPez= new JButton("4. Peces");
		
		
		
		opcionMostrarPez.setVisible(true);
		opcionMostrarPez.setBounds(350, 150,  200, 40);
		
		ventana.add(opcionMostrarPez);

		opcionMostrarPez.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {
				setVisible(false);
				dispose();
				DB database = DB.getInstances();
				String query = "SELECT *FROM pez";
				ResultSet rs = database.dbStatementImprimir(query);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						
						String imprimir = new String();
						try {
							
							while (rs.next()) {
								imprimir += "Nombre del animal : "+rs.getString(1)+"\nGenero del animal : "+rs.getString(2)+"\nEdad del animal : "+rs.getInt(3)+"\n-------------------------------------------------\n";
							}
							
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						finally {
							try {
								rs.close();
								
							}catch(SQLException a) {
								a.printStackTrace();
							}
						}
						VerAnimales ver = new VerAnimales(imprimir);
						
					}
					
					
				});
			}
			
		});
		
		//BOTON PARA MOSTRAR REPTILES

		JButton opcionMostrarReptil= new JButton("5. Reptiles");
		
		
		
		opcionMostrarReptil.setVisible(true);
		opcionMostrarReptil.setBounds(210, 220,  200, 40);
		
		ventana.add(opcionMostrarReptil);

		opcionMostrarReptil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {
				setVisible(false);
				dispose();
				DB database = DB.getInstances();
				String query = "SELECT *FROM reptil";
				ResultSet rs = database.dbStatementImprimir(query);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						String imprimir = new String();
						try {
							
							while (rs.next()) {
								imprimir += "Nombre del animal : "+rs.getString(1)+"\nGenero del animal : "+rs.getString(2)+"\nEdad del animal : "+rs.getInt(3)+"\n-------------------------------------------------\n";
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
							
						}
						finally {
							try {
								
								rs.close();
								
							}catch(SQLException a) {
								a.printStackTrace();
							}
						}
						VerAnimales ver = new VerAnimales(imprimir);
						
					}
					
					
				});
			}
			
		});
		
		
		
		
			//VENTANA PARA ELEGIR TIPO DE ANIMAL A INGRESAR
		
		if (e.getSource()==opcion2) {
			opcionMostrarMamiferos.setVisible(false);
			opcionMostrarAves.setVisible(false);
			opcionMostrarAnfibios.setVisible(false);
			opcionMostrarPez.setVisible(false);
			opcionMostrarReptil.setVisible(false);
			texto3.setVisible(false);
			this.botonvolver.setVisible(true);
			this.opcion1.setVisible(false);
			this.opcion2.setVisible(false);
			this.Titulo.setVisible(false);
			this.opcion3.setVisible(false);
			JLabel texto2= new JLabel("Seleccione que tipo de Animal desea Añadir");
			texto2.setFont(new Font("Calibri", Font.BOLD, 17));
			texto2.setBounds(180, 25, 400, 25);
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
								window.frmRegistroDeMamifero.setVisible(true);
								UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
								UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
								UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
								UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
								UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
					
				}
				
			});
			
			this.ventana.add(texto2);this.ventana.add(opcionAñadirMamiferos);this.ventana.add(opcionAñadirAves);this.ventana.add(opcionAñadirAnfibios);this.ventana.add(opcionAñadirPez);this.ventana.add(opcionAñadirReptil);
			
		}
		if (e.getSource()==opcion3) {
			this.opcion1.setVisible(true);
			this.opcion2.setVisible(true);
			this.botonvolver.setVisible(false);
			this.opcion3.setVisible(true);
			this.Titulo.setVisible(true);
			opcionMostrarMamiferos.setVisible(false);
			opcionMostrarAves.setVisible(false);
			opcionMostrarAnfibios.setVisible(false);
			opcionMostrarPez.setVisible(false);
			opcionMostrarReptil.setVisible(false);
			texto3.setVisible(false);
			
			
			Server.iniciar(12346);
	 		
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
			 		try {
			 			
						VentanaCliente cliente = new VentanaCliente();
						cliente.frame.setVisible(true);
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
			
		}
	
	}

	private void botonvolverActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		GUI interfazusuario = new GUI();
		interfazusuario.setVisible(true);
		
		
	}
	
	
}

