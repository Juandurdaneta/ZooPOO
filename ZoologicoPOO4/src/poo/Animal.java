package poo;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Animal{//Super clase animal, incluye todas las especies de animales
	
	private JFrame veranimales = new JFrame();
	private JTextArea ListadeAnimales = new JTextArea();
	private JScrollPane verpanel;
	
	
	private List<Animal> animales= new ArrayList<>();
	
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
	
}