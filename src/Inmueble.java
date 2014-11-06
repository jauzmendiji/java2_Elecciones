public class Inmueble {
	private String direccion;
	private String localidad;
	private int cp;


	public void setDireccion (String dir){
		direccion = dir;
	}
	public String getDireccion(){
		return direccion;
	}

	public void setLocalidad (String loc){
		localidad = loc;
	}

	public String getLocalidad(){
		return localidad;
	}

	public void setCp (int codp){
		cp = codp;
	}
	public int getCp(){
		return cp;
	}

	
}
