import java.util.*;
import java.io.*;

public class Pelecciones {

	public static void main (String args[]) {

		String nombre, respnombre, ape1, ape2, dni, direccionin, localidadin, tipo, direccionep, direccionay, localidaday, alcalde, partidop, nombrepar, siglas, repres;
		int cp, area, edad;
		

	/*//Habitante

		Habitante habitante = new Habitante ();	

		System.out.print("\n--> Datos del habitante:\n ");

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

		while (dni.length() != 9){
		System.out.print("Dni incorrecto");
		System.out.print("\nIngresa el DNI otra vez: ");
		dni = sc.nextLine();}		
		habitante.setDni(dni);
		
		
		System.out.print("\nIngresa la edad: ");
		edad = sc.nextInt();
		if (edad < 18){
		System.out.print("No eres mayor de edad, no puedes votar");
		System.exit(0);}
		else {
		habitante.setEdad(edad);}

		System.out.println("\n\n Datos introducidos: ");
		System.out.println("\n-------------------------");

		System.out.println("\nEl nombre del habitante es: " + habitante.getNombre());
		System.out.println("\nEl primer apellido del habitante es: " + habitante.getApellido1());
		System.out.println("\nEl segundo apellido del habitante es: " + habitante.getApellido2());
		System.out.println("\nEl DNI del habitante es: " + habitante.getDni());
		System.out.println("\nLa edad del habitante es: " + habitante.getEdad());
		
		System.out.println("\n-------------------------");

	//Inmueble
		
		Scanner sci = new Scanner(System.in);
		
		System.out.print("\n--> Datos del inmueble:\n ");
		
		Inmueble inmueble = new Inmueble ();	

		System.out.print("\nIngresa la localidad: ");
		localidadin = sci.nextLine();
		inmueble.setLocalidadin(localidadin);

		System.out.print("\nIngresa la direccion: ");
		direccionin = sci.nextLine();
		inmueble.setDireccionin(direccionin);

		System.out.print("\nIngresa el codigo postal: ");
		cp = sci.nextInt();
		inmueble.setCp(cp);

		System.out.println("\n\n Datos introducidos: ");
		System.out.println("\n-------------------------");

		System.out.println("\nLa localidad es: " + inmueble.getLocalidadin());
		System.out.println("\nLa direccion es: " + inmueble.getDireccionin());
		System.out.println("\nEl codigo postal es: " + inmueble.getCp());

		System.out.println("\n-------------------------");

	//Espacio Pubilico

		System.out.print("\n--> Datos del espacio publico: \n");

		Scanner sc1 = new Scanner(System.in);
		EspacioPublico ep = new EspacioPublico ();	

		System.out.print("\nIngresa el tipo de espacio: ");
		tipo = sc1.nextLine();
		ep.setTipo(tipo);

		System.out.print("\nIngresa la direccion: ");
		direccionep = sc1.nextLine();
		ep.setDireccionep(direccionep);

		System.out.print("\nIngresa el area: ");
		area = sc1.nextInt();
		ep.setArea(area);

		System.out.println("\n\n Datos introducidos: ");
		System.out.println("\n-------------------------");

		System.out.println("\nEl tipo de espacio es: " + ep.getTipo());
		System.out.println("\nLa direccion es: " + ep.getDireccionep());
		System.out.println("\nEl tamaño es: " + ep.getArea() + "m2");

		System.out.println("\n-------------------------");
	
	//Ayuntamiento

		Scanner sc2 = new Scanner(System.in);

		System.out.print("\n--> Datos del ayuntamiento: \n");

		Ayuntamiento ayun = new Ayuntamiento ();	

		System.out.print("\nIngresa la direccion: ");
		direccionay = sc2.nextLine();
		ayun.setDireccionay(direccionay);

		System.out.print("\nIngresa la localidad: ");
		localidaday = sc2.nextLine();
		ayun.setLocalidaday(localidaday);

		System.out.print("\nIngresa el nombre y los apellidos del alcalde: ");
		alcalde = sc2.nextLine();
		ayun.setAlcalde(alcalde);

		System.out.print("\nIngresa el partido politico al que pertence: ");
		partidop = sc2.nextLine();
		ayun.setPartidop(partidop);

		System.out.println("\n\n Datos introducidos: ");
		System.out.println("\n-------------------------");

		System.out.println("\nLa direccion es: " + ayun.getDireccionay());
		System.out.println("\nEl localidad es: " + ayun.getLocalidaday());
		System.out.println("\nEl alcalde es: " + ayun.getAlcalde());
		System.out.println("\nPertence al partido: " +ayun.getPartidop());

		System.out.println("\n-------------------------");*/

	//Partidos

		
		System.out.print("\n--> Datos del partido: \n");
		ArrayList<Partido> partidos = new ArrayList<Partido>();

		File archivo = new File("/home/zubiri/proyectojava/java2/java2_Elecciones/src/listadoPartidos.txt");
		Scanner salida = null;

		try {	
			
			
			System.out.println("\nEstos son los partidos que hay disponibles:");
			salida = new Scanner(archivo);
		 	while (salida.hasNextLine()) {

			String linea = salida.nextLine();			

			String[] corte = linea.split(",");
			Partido part = new Partido();
			part.setNombrepar(corte[0]);
			part.setSiglas(corte[1]);
			part.setRepres(corte[2]);

			partidos.add(part);}
			
			Iterator<Partido> itrPartido = partidos.iterator();
		while(itrPartido.hasNext()){
			Partido part = itrPartido.next();
			
			System.out.println("\nNombre del partido: " + part.getSiglas());
			System.out.println("Siglas del partido: " + part.getSiglas());
			System.out.println("Maximo representante: " + part.getRepres());
			System.out.println("\n-------------------------------");}

		}
		catch (IOException ioe) {
			System.out.println("Error E/S: " + ioe);
		}
	
	}
}
