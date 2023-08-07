package Pack1;

public class Employe extends Personne {
	
	private static final int SMIC = 1500;
	int salaire;
	
	
	public Employe() {
		super();    // on fait appel au constructeur de la classe parent : Personne
		this.setSalaire(SMIC);
	}
	
	public Employe(int salaire) {
		super();
		this.salaire = salaire;
	}
	
	public Employe (String nom, String prenom, String mail, int salaire) {
		super(nom, prenom, mail); // on utilise le constructeur du parent "personne"
		this.setSalaire(salaire); // on ajoute simplement le nouveau champ du fils
	}


	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		if (salaire < 0) {
			throw new RuntimeException("Le salaire ne peut être inférieur ou égal à 0 !");
		} else {
			this.salaire = salaire;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Salaire : " + this.salaire + "€";
		
	}


	
	
	
	
	

}
