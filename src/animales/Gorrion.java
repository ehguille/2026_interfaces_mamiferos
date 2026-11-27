package animales;

public class Gorrion extends Ave {

	public Gorrion(int peso, String nombre) {
		super(peso, nombre);
	}

	@Override
	public void ponerHuevos(int numeroHuevos) {
		System.out.println("Soy un Gorrión y pongo "+numeroHuevos+" huevos pequeños.");
		
	}

	@Override
	public void alimentarse() {
		System.out.println("Soy un Gorrión y como migas de pan.");
	}
	
	public  String toString() {
		return "(Gorrión.java) Nombre="+nombre+";Peso="+peso+".";
	}
	

}
