package poo;

public class Reptil extends Animal {
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
