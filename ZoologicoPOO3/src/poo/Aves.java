package poo;

public class Aves extends Animal {
	private String Nombre;
	private String Genero;
	private String edad;
	public Aves() {}
	
	public Aves(String Nombre, String Genero, String edad) {
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
		return Nombre+" Esta Ave tiene "+edad+" Años de edad y es de genero "+Genero+"\n";
	}
}
