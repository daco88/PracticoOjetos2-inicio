package clases;

public class Tarea {

	private String nombre;
	private String descripcion;
	private int cantidadDeHoras;
	
	private Miembro miembro;
	
	public Tarea(){}
	
	public Tarea(Miembro miembro) {
		this.miembro = miembro;
	}
	
	public Tarea(String nombre, String descripcion, int cantidadHoras) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidadDeHoras = cantidadHoras;
	}

	public Miembro getMiembro() {
		return miembro;
	}
}
