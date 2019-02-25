package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	
	public void addAnimal(Animal animal){
		if (animal.getTypes().equals("MAMMIFERE") && animal.getComportements().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getTypes().equals("MAMMIFERE") && animal.getComportements().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getTypes().equals("REPTILE")){
			fermeReptile.addAnimal();
		}
		else if (animal.getTypes().equals("POISSON")){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
