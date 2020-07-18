package server;

import java.net.InetAddress;

public class Client_info {
	private InetAddress direccion;
	private int puerto;
	private int id;
	private String nombre;
	
	 public Client_info(String nombre, int id, InetAddress direccion, int puerto) {
		this.nombre=nombre;
		this.id=id;
		this.direccion=direccion;
		this.puerto=puerto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getID() {
		return id;
	}
	public InetAddress getDireccion() {
		return direccion;
	}
	public int getPuerto() {
		return puerto;
		
	}
}
