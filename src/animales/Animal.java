package animales;

public abstract class Animal {
	
	protected int peso;

	protected String nombre;
	
	public Animal(int peso, String nombre) {
		this.peso=peso;
		this.nombre=nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	
	public  String toString() {
		return "(Animal.java) Nombre="+nombre+";Peso="+peso+".";
	}
	
	public abstract void alimentarse();
	
}
