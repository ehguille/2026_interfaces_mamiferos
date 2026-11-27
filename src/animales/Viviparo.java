package animales;

public interface Viviparo {
	
	default void parir(int numeroCrias) {
		System.out.println("Se paren "+numeroCrias+" crías.");
	}

}
