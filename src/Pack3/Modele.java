package Pack3;

public class Modele {
	// attributs
	private String nomMarque;
	private String nomMod;
	private int cylindree;
	private int puissance;
	private int vitesseMax;
	
	//constructeurs
	Modele () {
		  // Les constructeurs doivent initialiser les attributs avec les valeurs passées en paramètres
        // Vous pouvez utiliser le constructeur avec paramètres pour initialiser les attributs par défaut
        this("Marque inconnue", "Modèle inconnu", 0, 0, 0);		
	}
	
	Modele (String nomMarque, String nomMod, int cylindree, int puissance, int vitesseMax) {
		this.nomMarque = nomMarque;
        this.nomMod = nomMod;
        this.cylindree = cylindree;
        this.puissance = puissance;
        this.vitesseMax = vitesseMax;
	}

	//accesseurs
	
	
	public String getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

	public String getNomMod() {
		return nomMod;
	}

	public void setNomMod(String nomMod) {
		this.nomMod = nomMod;
	}

	public int getCylindree() {
		return cylindree;
	}

	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	@Override
	public String toString() {
		return "Modele " + nomMarque + "-" + nomMod + " " + cylindree + "cm3 " 
				+ puissance + " kw " + vitesseMax + " km/h";
	}
	
}
