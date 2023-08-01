package pack1;
public class Cercle {
    private double rayon;

    // Constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Accesseur pour le rayon
    public double getRayon() {
        return rayon;
    }

    // Mutateur pour le rayon
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Méthode pour calculer la circonférence
    public double calculerCirconference() {
        return 2 * Math.PI * rayon;
    }

    // Méthode pour calculer la surface
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}
