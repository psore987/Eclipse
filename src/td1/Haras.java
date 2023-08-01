package td1;

import java.util.ArrayList;
import java.util.Arrays;

public class Haras {
	private Cheval[] occupationBoxes;
	private int nbBoxes;
	public ArrayList<Cheval> pre = new ArrayList<>(); // Gestion du pré
	
	
	public Haras(int nbBoxes) {
		super();
		this.occupationBoxes = new Cheval[nbBoxes];
		this.nbBoxes = nbBoxes;
	}

	@Override
	public String toString() {
		return "Haras [occupationBoxes=" + Arrays.toString(occupationBoxes) + ", nbBoxes=" + nbBoxes + "]";
	}

	
	public Cheval[] getOccupationBoxes() {
		return occupationBoxes;
	}


	public void setOccupationBoxes(Cheval[] occupationBoxes) {
		this.occupationBoxes = occupationBoxes;
	}


	public int getNbBoxes() {
		return nbBoxes;
	}


	public void setNbBoxes(int nbBoxes) {
		this.nbBoxes = nbBoxes;
	}


	public void ajouterCheval(int noBox, Cheval ch) {
		
		if (noBox >0 && noBox < nbBoxes) { 
			if (occupationBoxes[noBox - 1] == null) {
				occupationBoxes[noBox - 1] = ch;
			}
				else { 
						System.out.println("Le box " + noBox + " est déjà occupé !");
						}
			}
			else {
				System.out.println("Erreur d'affectation de box " + noBox);
			}
	}

public void amenerAuPre(int noBox) {

	if (noBox > 0 && noBox < nbBoxes) {
		if (occupationBoxes[noBox - 1] != null) { // le box n'est pas vide 
			pre.add(occupationBoxes[noBox - 1]) ; // on amène le cheval du box au pré
			occupationBoxes[noBox - 1] = null;    // on libère le box
			for (Cheval element : pre) {
			    System.out.println("element " + element);
			}
		}
		else {
			System.out.println ("il n'y a pas de cheval dans le box " + noBox + " !");
			}
		}
		else {
			System.out.println("Erreur de no de Box ! ");
		}
}
	
	
}
