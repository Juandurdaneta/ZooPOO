package poo;

public class Anfibio extends Animal {
	private String Nombre;
	private String Genero;
	private String edad;
	public Anfibio() {}
	
	public Anfibio(String Nombre, String Genero, String edad) {
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
	public String getEdad() {
		return edad;
	}
	public void setEdad(String string) {
		this.edad=string;
	}
	@Override
	public String toString() {
		return Nombre+" Este Anfibio tiene "+edad+" Años de edad y es de genero "+Genero+"\n";
	}
}
