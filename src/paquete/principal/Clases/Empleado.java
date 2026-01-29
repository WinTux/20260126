package paquete.principal.Clases;

public class Empleado implements Persona{
	private int item;
	
	
	public Empleado(int item) {
		super();
		this.item = item;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		if(item > 0)
			this.item = item;
	}

	public void votarPorPartido(String nombrePartido) {
		System.out.println("Como empleado de XYZ, estoy votando por: "+ nombrePartido);
	}
	
	public void saludar(String nombre) {
		System.out.println("Hola, buenas noches "+nombre+".");
	}

	@Override
	public void saludar() {
		System.out.println("Hola, buenas noches.");
	}
}
