package Pack1;

public class Employe extends Personne {
	
	int salaire;
	
	public Employe(int salaire) {
		super("Jean","Paul","jean.paul@gmail.com");
		this.salaire = salaire;
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
		return "Employe [salaire=" + salaire + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getMail()=" + getMail() + "]";
	}


	
	
	
	
	

}
