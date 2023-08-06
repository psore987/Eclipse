package Pack1;

import javax.management.RuntimeErrorException;

public class Personne {
	private String nom;
	private String prenom;
	private String mail;
	
	// constructeur
	public Personne() {
		this("Villas", "Guillermo", "gv@gmail.com");
	}
	
	public Personne(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom == null || nom.trim().equals("")) {
			throw new RuntimeException("Le nom ne peut être vide");
		} else
			{
			 	this.nom = nom.toUpperCase();
			}
	}

	public String getPrenom() {
			return prenom;
	}

	public void setPrenom(String prenom) {
		if (prenom == null || prenom.trim().equals("")) {
			throw new RuntimeException("Le prénom ne peut être vide");
		} else
			{
			 	this.prenom = prenom;
			}
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
	
		if (mail == null || ! mail.matches( "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$" )) {
			throw new RuntimeException("le format de l'email n'est pas valide! ");
		} else
		{
		this.mail = mail;
		}
	}
	
	
	
	

	
}
