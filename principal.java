package proyecto_cvs;
import proyecto_cvs.*;	


public class principal {

	private String nombre;
	private int alquiler;
	

	public principal(String nombre, int alquiler) {
		super();
		this.nombre = nombre;
		this.alquiler = alquiler;
	}
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getAlquiler() {
		return alquiler;
	}



	public void setAlquiler(int alquiler) {
		this.alquiler = alquiler;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 principal pr2=new principal();
		 pr2.setNombre ("plaza santiago");
		 System.out.print(pr2.getNombre());
		 System.out.print(pr2.getAlquiler());
	}


}
