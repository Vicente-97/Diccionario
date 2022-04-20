package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.java.model.Diccionario;

class DiccionarioTest {

	@Test
	void tesotAddPalabra() {
		
		Diccionario dic = new Diccionario();
		dic.annadirPalabra("máquina", "Artificio para aprovechar, dirigir o regular la acción de una fuerza.");
		dic.annadirPalabra("máquina", "Conjunto de aparatos combinados para recibir cierta forma de energía y "
									+ "transformarla en otra más adecuada, o para producir un efecto determinado.");
		
		assertTrue(!dic.buscarPalabraDiccionario("máquina").isEmpty());
		assertEquals(dic.buscarPalabraDiccionario("máquina").size(), 2);
		assertNull(dic.buscarPalabraDiccionario("palabranoesta"));
	
	}

	
	@Test
	void testBorrarPalabra() {
		Diccionario dic = new Diccionario();
		dic.annadirPalabra("máquina", "Artificio para aprovechar, dirigir o regular la acción de una fuerza.");
		
		assertTrue(!dic.buscarPalabraDiccionario("máquina").isEmpty());
		
		dic.borrarPalabraDiccionario("máquina");
		
		assertNull(dic.buscarPalabraDiccionario("máquina"));
	}
	
	@Test
	void testListarPalabras() {
		Diccionario dic = new Diccionario();
		dic.annadirPalabra("maquinar", "Urdir, tramar algo oculta y artificiosamente.");
		dic.annadirPalabra("maquiavelico", "Astuto y engañoso.");
		
		assertEquals(dic.ListarPalabra("maqu").size(), 2);
		assertEquals(dic.ListarPalabra("maqu").get (0),"maquiavelico");
		assertEquals(dic.ListarPalabra("hi").size(), 0);
		
	}
}
