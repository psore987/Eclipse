package pack1;
public class Test {
    public static void main(String[] args) {
        
	
    	// Création d'un objet Cercle avec un rayon de 5.0
        Cercle cercle = new Cercle(5.0);

        // Affichage du rayon
        System.out.println("Rayon du cercle: " + cercle.getRayon());

        // Affichage de la circonférence
        System.out.println("Circonférence du cercle: " + cercle.calculerCirconference());

        // Affichage de la surface
        System.out.println("Surface du cercle: " + cercle.calculerSurface());
    
    
        Phrase ph = new Phrase();
        Phrase ph = new Phrase("Pierre");
           
        
    }
    
}

