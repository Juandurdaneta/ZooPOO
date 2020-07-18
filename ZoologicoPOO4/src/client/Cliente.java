package client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import server.Client_info;

public class Cliente {
	
	private int puerto;
	private InetAddress direccion;
	private static DatagramSocket socket;
	private static boolean en_ejecucion=true;
	private String nombre;
	
	
	public Cliente(String nombre, String direccion, int puerto) {
		try {
			this.nombre=nombre;
			this.direccion=InetAddress.getByName(direccion);//Convierte el string direccion a InetAddress
			this.puerto=puerto;
			socket = new DatagramSocket();
			en_ejecucion=true;
			recibir();
			enviar("\\conn:"+nombre );
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void enviar (String msj) {
		
		if (!msj.startsWith("\\")) {
			msj = nombre +": " +msj;
			
		}
		
		try {
			msj+="\\e";
			byte[] data = msj.getBytes();
			DatagramPacket packet = new DatagramPacket( data, data.length, direccion, puerto );
			socket.send(packet);
			System.out.println("Mensaje enviado a la direccion "+direccion.getHostAddress()+":"+puerto);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private static void recibir() {//Metodo que crea un hilo que ejecuta y espera mensajes
		Thread hilorecibir = new Thread("Receptor del programa") {
			 public void run() {
				 try {
					 while (en_ejecucion) {
						 
						 byte[] data = new byte[1024];
						 DatagramPacket packet = new DatagramPacket(data, data.length);
						 socket.receive(packet);//Detiene el hilo actual hasta que recibe un mensaje
						 String msj = new String(data);
						 msj=msj.substring(0, msj.indexOf("\\e"));
						 if (!esComando(msj, packet)) {
							 VentanaCliente.ImprimirEnConsola(msj);
						 }
						
						 
					 }
				 }catch(Exception e) {
					 e.printStackTrace();
		 		 }
			 }
		};hilorecibir.start();
	}
	private static boolean 	esComando(String msj, DatagramPacket packet) {
		if (msj.startsWith("\\con:")) {
			
			return true;
		}
		
		return false;
	}
}
