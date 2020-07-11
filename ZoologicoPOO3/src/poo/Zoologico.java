package poo;
import java.util.*;
import javax.swing.*;
public class Zoologico {
	public static void main(String[] args) {
		GUI InterfazUsuario = new GUI();
		InterfazUsuario.setVisible(true);
		InterfazUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*public Zoologico() {
		Scanner entrada = new Scanner(System.in);
		Animal animal = new Animal();
		Mamifero mamifero = new Mamifero();
		Anfibio anfibio = new Anfibio();
		Aves aves = new Aves();
		Reptil reptil = new Reptil();
		Pez peces = new Pez();
		
		//Animales Predefinidos
		
		Mamifero leon = new Mamifero();
		leon.setNombre("Leon");
		leon.setEdad(4);
		leon.setGenero("Hembra");
		Aves Loro= new Aves();
		Loro.setNombre("Loro");
		Loro.setEdad(7);
		Loro.setGenero("Macho");
		Anfibio Rana= new Anfibio();
		Rana.setNombre("Rana");
		Rana.setEdad(7);
		Rana.setGenero("Macho");
		Pez Salmon= new Pez();
		Salmon.setNombre("Salmon");
		Salmon.setEdad(2);
		Salmon.setGenero("Hembra");
		Reptil Cocodrilo = new Reptil();
		Cocodrilo.setNombre("Cocodrilo");
		Cocodrilo.setEdad(18);
		Cocodrilo.setGenero("Macho");
		
		//Añadiendo los animales a la lista con todas sus caracteristicas
		
		animal.setAnimal(Cocodrilo);
		animal.setAnimal(Salmon);
		animal.setAnimal(Rana);
		animal.setAnimal(Loro);
		animal.setAnimal(leon);
		do {
		menu();
		switch(entrada.nextInt()) {
			case 1:
				animal.Imprimirlistadeanimales();
				System.out.println("Presiona 1 para volver y 3 para salir");
				break;
			case 2:do {
				menuAnimales();
				switch(entrada.nextInt()) {
				case 1:
					System.out.println("Ingrese el Nombre del animal que desea añadir:");
					String nombre= entrada.next();
					System.out.println("Ingrese el genero del animal: ");
					String genero= entrada.next();
					System.out.println("Ingrese la edad del animal: ");
					int edad=entrada.nextInt();
					mamifero = new Mamifero(nombre,genero,edad);
					animal.setAnimal(mamifero);
					System.out.println("Presiona 6 para volver");
					
					break;
				case 2:
					System.out.println("Ingrese el Nombre del animal que desea añadir: ");
					String nombre1= entrada.next();
					System.out.println("Ingrese el genero del animal: ");
					String genero1= entrada.next();
					System.out.println("Ingrese la edad del animal: ");
					int edad1=entrada.nextInt();
					anfibio = new Anfibio(nombre1,genero1,edad1);
					animal.setAnimal(anfibio);
					System.out.println("Presiona 6 para volver");
					break;
				case 3:
					System.out.println("Ingrese el Nombre del animal que desea añadir: ");
					String nombre11= entrada.next();
					System.out.println("Ingrese el genero del animal: ");
					String genero11= entrada.next();
					System.out.println("Ingrese la edad del animal: ");
					int edad11=entrada.nextInt();
					aves = new Aves(nombre11,genero11,edad11);
					animal.setAnimal(aves);
					System.out.println("Presiona 6 para volver");
					break;
				case 4:
					System.out.println("Ingrese el Nombre del animal que desea añadir: ");
					String nombre2= entrada.next();
					System.out.println("Ingrese el genero del animal: ");
					String genero2= entrada.next();
					System.out.println("Ingrese la edad del animal: ");
					int edad2=entrada.nextInt();
					animal = new Pez(nombre2,genero2,edad2);
					animal.setAnimal(peces);
					System.out.println("Presiona 6 para volver");
					break;
				case 5:
					System.out.println("Ingrese el Nombre del animal que desea añadir: ");
					String nombre3= entrada.next();
					System.out.println("Ingrese el genero del animal: ");
					String genero3= entrada.next();
					System.out.println("Ingrese la edad del animal: ");
					int edad3=entrada.nextInt();
					reptil = new Reptil(nombre3,genero3,edad3);
					animal.setAnimal(reptil);
					System.out.println("Presiona 6 para volver");
					break;
				case 6:
					  System.out.println("Pulse 6 para volver al menu principal");
	                    break;
				default:
                    System.err.println("Ingrese una opcion valida.");
                    break;
				
			 }
			}while (entrada.nextInt() != 6);
			System.out.println("Presiona 1 para volver y 3 para salir");
			break;
			case 3:
                System.out.println("Presiona 3 para salir");
                break;
				
	}
		}while(entrada.nextInt()!=3);
		
	}
	public void menu() {
		System.out.println("A continuacion escoja una opcion:\n1.Ver animales en el zoologico \n2.Añadir animal nuevo\n3.Salir");
	}
	public void menuAnimales() {
		System.out.println("Seleccione un tipo de animal para añadir a la lista:\n1:Mamifero\n2:Anfibio\n3:Ave\n4:Pez\n5:Reptil\n");
	}*/
}
