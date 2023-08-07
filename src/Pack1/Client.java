package Pack1;

import javax.management.RuntimeErrorException;

public class Client {

	private int idClient;
	
	// constructeurs
	public Client (int id, String nom, String prenom, String mail) {
		super(nom, prenom, mail); // on utilise le constructeur du parent "personne"
		this.setIdClient(id); // on ajoute simplement le nouveau champ du fils
	
	public Client(int idClient) {
		super();
		this.idClient = idClient;
	}	
	
	// Getter / setter
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		if (idClient <= 0) {
			throw new RuntimeException("Le numéro du client ne peut être <= 0 !");
		} else {
		this.idClient = idClient;
		}
	}


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + "]" + super.toString();
	}
	
	
}
