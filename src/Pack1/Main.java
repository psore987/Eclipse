package Pack1;

public class Main {

	public static void main(String[] args) {
		Personne pers = new Personne("Joe","Cooker","joe.cooker@gmail.com");
		System.out.println(pers);
		
		Employe emp = new Employe(500);
		System.out.println(emp);
	}

}
