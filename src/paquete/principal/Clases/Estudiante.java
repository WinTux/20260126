package paquete.principal.Clases;

public class Estudiante {
	//Abstracción
	protected String nombre;
	protected String apellido;
	protected int matricula;
	protected String curso;
	
	public Estudiante(String n, String a) {
		nombre = n;
		apellido = a;
		matricula = 0;
		curso = "Prefacultativo";
	}
	
	public Estudiante() {
		super();
		nombre = apellido = "NN";
		curso = "prefacultativo";
	}

	public Estudiante(String nombre, String apellido, int matricula, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
		this.curso = curso;
	}

	

	
	// Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if(matricula > 0)
			this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void rendirExamen(String parcial) {
		System.out.println("Como estudiante, estoy rindiendo mi examen "+parcial);
	}
}
