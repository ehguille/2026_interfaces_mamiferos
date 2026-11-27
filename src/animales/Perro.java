package animales;

public class Perro extends Mamifero implements Viviparo {

	public Perro(int peso, String nombre) {
		super(peso, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alimentarse() {
		System.out.println("Soy un perro y como sobras.");
	}
	
	public void parir( ) {
		System.out.println("Soy un perro y alumbro manadas.");
	}

}
