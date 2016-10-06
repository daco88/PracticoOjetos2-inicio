package clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Proyecto {
	private ArrayList<ArrayList> cantidadRoles;

	public ArrayList<ArrayList> getCantidadRoles() {
		return cantidadRoles;
	}

	public void asignarRolYCantidad(int cantidad, String rol) {
		ArrayList<String> tupla = new ArrayList();
		tupla.add(cantidad, rol);
		cantidadRoles.add(tupla);
	}
}
