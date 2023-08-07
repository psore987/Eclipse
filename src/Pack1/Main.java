package Pack1;

public class Main {

	public static void main(String[] args) {
		
//		Personne pers = new Personne("Joe","Cooker","joe.cooker@gmail.com");
//		System.out.println(pers);
//		
//		Employe emp = new Employe("Jason","Bourne","jbourne@cia.com",10000);
//		System.out.println(emp);
//		
//		Client cli = new Client(14,"Brel","Jacques","j.brel@gmail.com");
//		System.out.println(cli);
//		Client cli2 = new Client(2);
//		System.out.println(cli2);
		
		Personne[] tabPersonnes = new Personne[10];
		tabPersonnes[0] = new Personne("Chantal","Lobby","chl@gmail.com");
		tabPersonnes[1] = new Employe("Dominique","Farroudja","d.farroudja@free.fr",8000);
		tabPersonnes[2] = new Client(7,"Alain","Chabat","alain.chabat@orange.fr");
		
		// J'affiche tout le monde
		for (Personne person : tabPersonnes) {
			System.out.println(person);
		}
		
		// Je n'affiche que les employés
		for (Personne person : tabPersonnes) {
			if (person instanceof Employe) { 
			System.out.println(person); }
		}
	}
}
