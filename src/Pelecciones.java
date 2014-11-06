import java.util.*;

public class Pelecciones {

	public static void main (String args[]) {

		String nombre, respnombre, ape1, ape2, dni, fechnaci;
		

	//Habitante

		Habitante habitante = new Habitante ();	

		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa el nombre: ");
		nombre = sc.nextLine();
		habitante.setNombre(nombre);

		System.out.print("\nIngresa el primer apellido: ");
		ape1 = sc.nextLine();
		habitante.setApellido1(ape1);

		System.out.print("\nIngresa el segundo apellido: ");
		ape2 = sc.nextLine();
		habitante.setApellido2(ape2);

		System.out.print("\nIngresa el DNI: ");
		dni = sc.nextLine();
		habitante.setDni(dni);

		System.out.print("\nIngresa la fecha de nacimiento: (DD/MM/AAAA)    ");
		fechnaci = sc.nextLine();
		habitante.setFechnaci(fechnaci);

		System.out.println("\n\n Datos introducidos: ");
		System.out.println("\n-------------------------");

		System.out.println("\nEl nombre del habitante es: " + habitante.getNombre());
		System.out.println("\nEl primer apellido del habitante es: " + habitante.getApellido1());
		System.out.println("\nEl segundo apellido del habitante es: " + habitante.getApellido2());
		System.out.println("\nEl DNI del habitante es: " + habitante.getDni());
		System.out.println("\nLa fecha de nacimiento del habitante es: " + habitante.getFechnaci());
	
	}
}
