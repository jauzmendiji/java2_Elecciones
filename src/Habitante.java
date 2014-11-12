public class Habitante {
	private String nombre;
	private String ape1;
	private String ape2;
	private String dni;
	int edad;

	

	public void setNombre (String izena){
		nombre = izena;
	}
	public String getNombre(){
		return nombre;
	}

	public void setApellido1 (String ab1){
		ape1 = ab1;
	}
	public String getApellido1(){
		return ape1;
	}

	public void setApellido2 (String ab2){
		ape2 = ab2;
	}

	public String getApellido2(){
		return ape2;
	}	

	public void setDni (String nan){
		dni = nan;
	}

	public String getDni(){
		return dni;
	}

	public void setEdad (int ad){
		edad = ad;
	}

	public int getEdad(){
		return edad;
	}
}
