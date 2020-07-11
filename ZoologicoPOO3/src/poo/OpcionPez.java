package poo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class OpcionPez {

	JFrame frame;
	private JTextField Nombre;
	private JTextField Edad;
	private JTextField Genero;

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
		
		Nombre = new JTextField();
		Nombre.setBounds(272, 85, 339, 20);
		frame.getContentPane().add(Nombre);
		Nombre.setColumns(10);
		
		JLabel nombreM = new JLabel("Nombre del Pez a Ingresar");
		nombreM.setFont(new Font("Calibri", Font.BOLD, 14));
		nombreM.setBounds(10, 82, 252, 20);
		frame.getContentPane().add(nombreM);
		
		JLabel generoM = new JLabel("Genero del Pez");
		generoM.setFont(new Font("Calibri", Font.BOLD, 14));
		generoM.setBounds(10, 138, 195, 20);
		frame.getContentPane().add(generoM);
		
		Edad = new JTextField();
		Edad.setBounds(272, 135, 342, 22);
		frame.getContentPane().add(Edad);
		Edad.setColumns(10);
		
		JLabel edad = new JLabel("Edad del Pez");
		edad.setFont(new Font("Calibri", Font.BOLD, 14));
		edad.setBounds(10, 204, 165, 20);
		frame.getContentPane().add(edad);
		
		Genero = new JTextField();
		Genero.setBounds(272, 202, 86, 20);
		frame.getContentPane().add(Genero);
		Genero.setColumns(10);
		
		JButton botonvolver = new JButton("Volver");
		botonvolver.setBounds(566, 302, 89, 23);
		frame.getContentPane().add(botonvolver);
		botonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvolverActionPerformed(evt);
            }
		  });
		
		JButton btnNewButton = new JButton("Ingresar ");
		btnNewButton.setBounds(289, 258, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evnt) {
			IngresarActionPerformed(evnt);
		}
	});
	}

	public JFrame getJPanel() {
		return this.frame;
		
	}
	private void botonvolverActionPerformed(java.awt.event.ActionEvent evt) {
		GUI interfazusuario = new GUI();
		interfazusuario.setVisible(true);
		frame.setVisible(false);
		frame.dispose();
		
	}
	@SuppressWarnings("deprecation")
	private void IngresarActionPerformed(java.awt.event.ActionEvent evnt) {//METODO PARA AÑADIR LO INGRESADO A LA BASE DE DATOS
		String driverDB = "org.postgresql.Driver";
		String dbName= "ZoologicoPOO";
		String urlDB = "jdbc:postgresql://localhost:5432/"+dbName;
		String userDB = "postgres";
		String passDB = "masterkey";
		
		try {
			Pez p = new Pez();
			p.setNombre(Nombre.getText());
			p.setGenero(Genero.getText());
			p.setEdad(Edad.getText());
			
			Class.forName(driverDB).newInstance();
			System.out.println("Conectandose a la base de datos "+dbName+" ... ");
			Connection conn = DriverManager.getConnection(urlDB, userDB, passDB); 
			System.out.println("Conexion establecida satisfactoriamente");
			
			String sql = "INSERT INTO pez (NombreAnimal,Genero,Edad"+"VALUES (?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getNombre());
			pstmt.setString(2, p.getGenero());
			pstmt.setString(3, p.getEdad());
			
			pstmt.execute();
			
			conn.close();
			
			
		}catch (Exception e){
	        e.printStackTrace();
	        }
	}
}

