package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clases.Miembro;
import clases.Tarea;

public class MiembroTest {
	
	@Test
	public void crearMiembroYAsignarleUnaTarea() {
		Miembro miembro1 = new Miembro("Pepe");
		Tarea tarea1 = new Tarea(miembro1);
		
		assertEquals(miembro1, tarea1.getMiembro());
	}
	
}
