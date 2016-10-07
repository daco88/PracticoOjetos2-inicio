package clases;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	private List<Tarea> listaTareas = new ArrayList<>();
	private List<ArrayList> cantidadRoles = new ArrayList<>();

	public int getCantidadRoles() {
		return cantidadRoles.size();
	}

	public void asignarRolYCantidad(int cantidad, String rol) {
		ArrayList<String> tupla = new ArrayList();
		tupla.add(String.valueOf(cantidad));
		tupla.add(rol);
		cantidadRoles.add(tupla);
	}

	public void asignarTarea(String nombre, String descripcion, int cantidadHoras) {
		Tarea nuevaTarea = new Tarea(nombre, descripcion, cantidadHoras);
		listaTareas.add(nuevaTarea);
		
	}

	public Object getCantidadTareas() {
		return listaTareas.size();
	}
}
