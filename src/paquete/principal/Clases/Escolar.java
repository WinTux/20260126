package paquete.principal.Clases;

public class Escolar extends Estudiante implements Persona {
	private String nombreColegio;
	private String paralelo;
	public Escolar() {
		super("EscolarAnonimo","EscolarAnonimo");
		nombreColegio = paralelo = "";
	}
	public Escolar(String ap) {
		apellido = ap;
		paralelo = "A";
	}
	public Escolar(String nombre, String apellido, int matricula, String curso, String nombreColegio, String paralelo) {
		super(nombre, apellido, matricula, curso);
		this.nombreColegio = nombreColegio;
		this.paralelo = paralelo;
	}
	
	public void votarPorPartido(String nombrePartido) {
		System.out.println("Como escolar, estoy votando por: "+ nombrePartido);
	}
	
	public void saludar() {
		System.out.println("Como escolar, saludo a la bandera.");
	}
	
}
