package animales;

public class Pinguino extends Ave {

	public Pinguino(int peso, String nombre) {
		super(peso, nombre);
		// TODO Auto-generated constructor stub
	}

	public void ponerHuevos(int numeroHuevos) {
		System.out.println("Soy un pingüino y pongo "+numeroHuevos+" huevos.");
		
	}

	public void alimentarse() {
		System.out.println("Soy un pingüino y como cosas frías.");
		
	}

}
