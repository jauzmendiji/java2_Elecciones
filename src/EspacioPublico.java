public class EspacioPublico {
	private String tipo;
	private String direccionep;
	private int area;

	public void setTipo (String mota){
		tipo = mota;
	}
	
	public String getTipo(){
		return tipo;
	}

	public void setDireccionep (String dir){
		direccionep = dir;
	}
	public String getDireccionep(){
		return direccionep;
	}

	public void setArea (int m2){
		area = m2;
	}
	public int getArea(){
		return area;
	}

	
}
