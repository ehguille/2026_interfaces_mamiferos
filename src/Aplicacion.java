import java.util.Scanner;
import animales.*;

public class Aplicacion {

	public Aplicacion() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del gorrión.");
		String nombreGorrion=s.next();
		System.out.println("Introduce el peso del gorrión.");
		int pesoGorrion=s.nextInt();
		Gorrion g=new Gorrion(pesoGorrion, nombreGorrion);
		System.out.println(g);
		
		s.close();
	}
	
	public static void main(String[] args) {
		Aplicacion a=new Aplicacion();

	}

}
