package poo;
import java.util.*;
public class Animal{//Super clase animal, incluye todas las especies de animales
	
	private List<Animal> animales= new ArrayList<>();
	public void ImprimirListaDeAnimales() {
		
		// Bucle de cada animal en el ArrayList
		for (Animal a : animales) {
			// Imprimir animales 
			System.out.println(a);
		}
	}
	
	public List <Animal> getAnimales(){
		return animales;
	}
	public void setAnimal(Animal animal) {
		this.animales.add(animal);
	}
	public void Imprimirlistadeanimales() {
		
		for (Animal a : animales) {
			System.out.println(a);
		}
	}
	public class Mamifero extends Animal{
		private String Nombre;
		private String Genero;
		private int edad;
		public Mamifero() {}
		
		public Mamifero(String Nombre, String Genero, int edad) {
			this.Nombre=Nombre;
			this.Genero=Genero;
			this.edad=edad;
		}
		
		
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre=Nombre;
		}
		public String getGenero() {
			return Genero;
		}
		public void setGenero(String Genero) {
			this.Genero=Genero;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
		@Override
		public String toString() {
			return Nombre+" Este Mamifero tiene "+edad+" Años de edad y es de genero "+Genero+"\n";
		}
	}
	public class Anfibio extends Animal{
		private String Nombre;
		private String Genero;
		private int edad;
		public Anfibio() {}
		
		public Anfibio(String Nombre, String Genero, int edad) {
			this.Nombre=Nombre;
			this.Genero=Genero;
			this.edad=edad;
		}
		
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre=Nombre;
		}
		public String getGenero() {
			return Genero;
		}
		public void setGenero(String Genero) {
			this.Genero=Genero;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
		@Override
		public String toString() {
			return Nombre+" Este Anfibio tiene "+edad+" Años de edad y es de genero "+Genero+"\n";
		}
	}
	public class Aves extends Animal{
		private String Nombre;
		private String Genero;
		private int edad;
		public Aves() {}
		
		public Aves(String Nombre, String Genero, int edad) {
			this.Nombre=Nombre;
			this.Genero=Genero;
			this.edad=edad;
		}
		
		
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre=Nombre;
		}
		public String getGenero() {
			return Genero;
		}
		public void setGenero(String Genero) {
			this.Genero=Genero;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
		@Override
		public String toString() {
			return Nombre+" Esta Ave tiene "+edad+" Años de edad y es de genero "+Genero+"\n";
		}
	}
	public class Pez extends Animal{
		private String Nombre;
		private String Genero;
		private int edad;
		public Pez() {}
		
		public Pez(String Nombre, String Genero, int edad) {
			this.Nombre=Nombre;
			this.Genero=Genero;
			this.edad=edad;
		}
		
		
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre=Nombre;
		}
		public String getGenero() {
			return Genero;
		}
		public void setGenero(String Genero) {
			this.Genero=Genero;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
		@Override
		public String toString() {
			return Nombre+" Este Pez tiene "+edad+" Años de edad y es de genero "+Genero+"\n";
		}
	}
	public class Reptil extends Animal{
		private String Nombre;
		private String Genero;
		private int edad;
		public Reptil() {}
		
		public Reptil(String Nombre, String Genero, int edad) {
			this.Nombre=Nombre;
			this.Genero=Genero;
			this.edad=edad;
		}
		
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre=Nombre;
		}
		public String getGenero() {
			return Genero;
		}
		public void setGenero(String Genero) {
			this.Genero=Genero;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
		@Override
		public String toString() {
			return Nombre+" Este Reptil tiene "+edad+" Años de edad y es de genero "+Genero+"\n";
		}
	}
}