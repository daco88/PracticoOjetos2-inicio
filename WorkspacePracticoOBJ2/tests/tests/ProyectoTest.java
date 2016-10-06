package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clases.Proyecto;
import junit.framework.Assert; 

public class ProyectoTest {

	@Before
	public void crearProyecto() {
		//Proyecto miProyecto = new Proyecto();
	}
	
	@Test
	public void asignarRolYCantidad() {
		Proyecto miProyecto = new Proyecto();
		miProyecto.asignarRolYCantidad(5, "Desarrollador");
		
		assertEquals(1, miProyecto.getCantidadRoles().size());
	}
}