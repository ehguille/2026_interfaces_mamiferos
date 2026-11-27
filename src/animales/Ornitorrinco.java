package animales;

public class Ornitorrinco extends Mamifero implements Oviparo {

	public Ornitorrinco(int peso, String nombre) {
		super(peso, nombre);
	}

	@Override
	public void ponerHuevos(int numeroHuevos) {
		System.out.println("Soy un ornitorrinco y pongo "+numeroHuevos+" huevos aunque sea un mamífero.");
		
	}

	@Override
	public void alimentarse() {
		System.out.println("Soy un ornitorrinco y como lo que me echen.");
	}

}
