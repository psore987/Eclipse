package pack2;

public class TableMultiplication {
    private int nombre;
	
    public TableMultiplication(int nombre) {
    	this.nombre = nombre;
	}

	public void afficher() {
		int i;
		for (i = 1; i < 10; i++) {
			System.out.println( this.nombre + " * " + i + " = " + i * this.nombre);
		}
	}
}
