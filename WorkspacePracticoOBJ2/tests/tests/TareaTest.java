package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clases.Proyecto;
import clases.Tarea;

public class TareaTest {
	
	@Test
	public void testTareaPrevia(){
		
		Tarea tarea = new Tarea("tarea", "alguna descripcion", 4);
		Tarea tareaAProbar = new Tarea("tarea", "alguna descripcion", 4, tarea);
		Proyecto proyecto = new Proyecto();
		proyecto.asignarTarea("tarea", "alguna descripcion", 4, tarea);
		
		
		assertEquals(proyecto.getTarea(0).getTareaPrevia(), tareaAProbar.getTareaPrevia());
	}
}
