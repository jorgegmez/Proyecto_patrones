package com.ucenfotec.patrones.testlogic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ucenfotec.patrones.logic.GeneralManager;

public class GeneralFunctionsTest {

	@Test
	public void createCharacterTest() {
		GeneralManager characterTest = new GeneralManager();
		assertEquals(true,characterTest.createCharacter("Prueba1",100,5,5));
	}	
	
	@Test
	public void createMapTest() {
		GeneralManager mapTest = new GeneralManager();
		assertEquals(true,mapTest.createMap("Mapa1", null, null));
	}
}
