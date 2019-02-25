package ex1;

import java.util.Date;

public class Entreprise {

	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	public static final int CAPITALMAX = 3_000_000;
	
	public String Afficher_statut(){
		return "status";	
	}
	
}
