package Pack1;

public class Main {

	public static void main(String[] args) {
		Personne pers = new Personne("Joe","Cooker","joe.cooker@gmail.com");
		System.out.println(pers);
		
		Employe emp = new Employe("Jason","Bourne","jbourne@cia.com",10000);
		System.out.println(emp);
		
		Client cli = new Client(14,"Brel","Jacques","j.brel@gmail.com");
		System.out.println(cli);
		Client cli2 = new Client(2);
		System.out.println(cli2);
	}

}
