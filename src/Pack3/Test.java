package Pack3;

public class Test {

	public static void main(String[] args) {

		int i;
		
		Modele mod1 = new Modele("BMW","Predator",1300,80,220);
		System.out.println(mod1.toString());

		Modele mod2 = new Modele("Ducati","Scramble",800,54,180);
		System.out.println(mod2.toString());

		Moto moto1 = new Moto(1,mod1,0);
		
		for (i = 0; i < 10; i++) {
			moto1.accelerer(50);
			System.out.println(moto1.toString());
		}
		
		for (i = 0; i < 10; i++) {
			moto1.ralentir(50);
			System.out.println(moto1.toString());
		}
	}
}
