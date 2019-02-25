package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.corrige1.Animal;

public abstract class Zone {

		
	protected List<Animal> listeAnimaux = new ArrayList<>();
	

	public void addAnimal(Animal animal) {
		listeAnimaux.add(animal);
	}
	
	
	public void afficherListeAnimaux(){
		for (Animal nomAnimaux : listeAnimaux){
		System.out.println(nomAnimaux.getNom());
	 	}
	}
	
	public final int compterAnimaux() {
		return listeAnimaux.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
	
	public  abstract double getPoids();		
}
