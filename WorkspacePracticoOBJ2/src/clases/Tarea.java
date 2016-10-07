package clases;

public class Tarea {

	private Tarea tareaPrevia;
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

	public Tarea(String nombre, String descripcion, int cantidadHoras, Tarea tarea) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidadDeHoras = cantidadHoras;
		this.tareaPrevia = tarea;
	}

	public Miembro getMiembro() {
		return miembro;
	}

	public Tarea getTareaPrevia() {
		return tareaPrevia;
	}

	public void setTareaPrevia(Tarea tareaPrevia) {
		this.tareaPrevia = tareaPrevia;
	}
	
	
}
