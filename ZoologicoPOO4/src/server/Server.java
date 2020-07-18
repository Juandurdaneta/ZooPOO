package server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class Server {
	
	private static DatagramSocket socket;
	private static boolean en_ejecucion;
	private static ArrayList<Client_info> clientes = new ArrayList<Client_info>();
	private static int IdCliente;
	public static void iniciar(int puerto) {	//Metodo que inicia el servidor
		try {
			socket = new DatagramSocket(puerto);
			en_ejecucion=true;
			recibir();
			System.out.println("Server iniciado en el puerto : "+puerto);
		 }catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void emitir(String msj) {//Metodo que envia un mensaje para cada cliente conectado al servidor
		for(Client_info info : clientes ) {
			enviar(msj, info.getDireccion(), info.getPuerto());
		}
	}
	private static void enviar(String msj, InetAddress direccion, int puerto) {//Metodo para enviar un mensaje
		try {
			msj+="\\e";
			byte[] data = msj.getBytes();
			DatagramPacket packet = new DatagramPacket( data, data.length, direccion, puerto );
			socket.send	(packet);
			System.out.println("Mensaje enviado a, "+direccion.getHostAddress()+":"+puerto);
			
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
							 emitir(msj);
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
			String nombre = msj.substring(msj.indexOf(":")+1);
			clientes.add(new Client_info(nombre, IdCliente++, packet.getAddress(), packet.getPort()));
			emitir("Usuario "+nombre+ "Conectado!");
			return true;
		}
		
		return false;
	}
	
	public static void detener() {//Metodo que detiene la ejecucion del server
		en_ejecucion= false;
	}
	
}
