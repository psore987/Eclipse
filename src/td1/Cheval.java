package td1;

public class Cheval {

	//atributs
	private String nomC;
	private int anneeNais;
	private int tailleC;
	private int poidsC;
	private int vitesseC;
	
	//constructeurs
	public Cheval() {
		 this("Cheval inconnu", 1900, 0, 0, 0);	
	}
	
	
	public Cheval(String nomC, int anneeNais, int tailleC, int poidsC, int vitesseC) {
		super();
		this.nomC = nomC;
		this.anneeNais = anneeNais;
		this.tailleC = tailleC;
		this.poidsC = poidsC;
		this.vitesseC = vitesseC;
	}


	// accesseurs et mutateurs
	
	public String getNomC() {
		return nomC;
	}


	public void setNomC(String nomC) {
		this.nomC = nomC;
	}


	public int getAnneeNais() {
		return anneeNais;
	}


	public void setAnneeNais(int anneeNais) {
		this.anneeNais = anneeNais;
	}


	public int getTailleC() {
		return tailleC;
	}


	public void setTailleC(int tailleC) {
		this.tailleC = tailleC;
	}


	public int getPoidsC() {
		return poidsC;
	}


	public void setPoidsC(int poidsC) {
		this.poidsC = poidsC;
	}


	public int getVitesseC() {
		return vitesseC;
	}


	public void setVitesseC(int vitesseC) {
		this.vitesseC = vitesseC;
	}


	// méthode toString (surcharge)
	@Override
	public String toString() {
		return "Cheval : " + nomC + ", " + anneeNais + ", mesurant " + tailleC + ", pour un poids de " + poidsC
				+ ". Sa vitesse actuelle est " + vitesseC + "km/h.";
	}
	
	public void courir() {
		this.vitesseC = 30;
	}
	
	public void trotter() {
			this.vitesseC = 10;
	}
	
	public void stopper() {
		this.vitesseC = 0;
		this.hennir();
	}
	
	private void hennir() {
		System.out.println("Hiiiii !");
	}
}


