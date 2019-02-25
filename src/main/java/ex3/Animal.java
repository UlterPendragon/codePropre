package ex3;


// attributes
public class Animal {	
	private  String types;
	protected  String noms;
	protected  String comportements;

	// Constructor
	public Animal(String types, String noms, String comportements) {
		this.types = types;
		this.noms = noms;
		this.comportements = comportements;
	}



	//Getters and Setters
	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getNoms() {
		return noms;
	}

	public void setNoms(String noms) {
		this.noms = noms;
	}

	public String getComportements() {
		return comportements;
	}

	public void setComportements(String comportements) {
		this.comportements = comportements;
	}	
}





