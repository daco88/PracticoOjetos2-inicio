package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import clases.Proyecto; 

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
	
	@Test
	public void asignarTarea(){
		
		Proyecto miProyecto = new Proyecto();
		miProyecto.asignarTarea("Configurar entorno",
				"Preparar el entorno para iniciar el desarrollo",
				4);
		
		assertEquals(1, miProyecto.getCantidadTareas());
	}
}