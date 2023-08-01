package Pack3;

public class Moto {
	private int id;
	private Modele modele;
	private double vitesseActuelle;

	// constructeur
	public Moto(int id, Modele modele, double vitesseActuelle) {
		super();
		this.id = id;
		this.modele = modele;
		this.vitesseActuelle = vitesseActuelle;
	}

	// accesseurs
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Modele getModele() {
		return modele;
	}



	public void setModele(Modele modele) {
		this.modele = modele;
	}



	public double getVitesseActuelle() {
		return vitesseActuelle;
	}



	public void setVitesseActuelle(double vitesseActuelle) {
		this.vitesseActuelle = vitesseActuelle;
	}


	// toString
	@Override
	public String toString() {
		return "La moto " + modele + " no " + id + " roule actuellement à " 
				+ vitesseActuelle + " km/h et peut atteindre " + modele.getVitesseMax()+ " km/h"
				+ "\nIl me faut " + freinageUrgence() + " m pour m'arrêter\n";
		
	}
	
	//méthodes
	public void accelerer(double nbKil) {
		if (vitesseActuelle + nbKil < modele.getVitesseMax()  ) {
			vitesseActuelle = vitesseActuelle + nbKil;
		} 
		else {
			vitesseActuelle = modele.getVitesseMax();
		}
	}	
	public void ralentir(double nbKil) {
			if (vitesseActuelle - nbKil < 0   ) {
				vitesseActuelle = 0;
			} 
			else {
				vitesseActuelle = vitesseActuelle - nbKil;
			}
	}
	
	public double freinageUrgence() {
		return (vitesseActuelle / 10) * 3;
	}
	
	}




