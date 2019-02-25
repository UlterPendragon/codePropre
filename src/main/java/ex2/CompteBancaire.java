package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	public CompteBancaire(double solde) {
		this.solde = solde;
	}

	//Ajoute un montant au solde
	public void ajouterMontant(double montant){
		this.solde += montant;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
}

