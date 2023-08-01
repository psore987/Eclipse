package td1;

public class main {

	Cheval ch1, ch2; 
	Haras h1;
	
	public static void main(String[] args) {
		Cheval ch1 = new Cheval("Stewbal",2020,190,450,0);
		Cheval ch2 = new Cheval("Jappelou",2018,180,400,0);
		
		// vérification des méthodes
		ch1.courir();
		System.out.println(ch1.toString());
		ch1.trotter();
		System.out.println(ch1.toString());
		ch1.stopper();
		System.out.println(ch1.toString());
		
		// vérification des affectations de box
		Haras h1 = new Haras(40);
		System.out.println(h1.toString());
		h1.ajouterCheval(0, ch1); //erreur affectation
		System.out.println(h1.toString());
		h1.ajouterCheval(4, ch1); // le box 4 est occupé par le cheval 1
		System.out.println(h1.toString());
		h1.ajouterCheval(4, ch2); // box déjà occupé
		System.out.println(h1.toString());
		h1.ajouterCheval(8, ch2); // le box 8 est occupé par le cheval 2
		System.out.println(h1.toString());
		
		//vérification des mises au pré
		h1.amenerAuPre(3); // box vide
		h1.amenerAuPre(42); // erreur index
		h1.amenerAuPre(4); // on amène le cheval du box 4 au pré (ch2)
		System.out.println(h1.toString()); // on vérifie qu'il ne reste que le box 8 occupé
		
	}

}
