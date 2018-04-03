package com.ucenfotec.patrones.testlogic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ucenfotec.patrones.logic.GeneralManager;



public class GeneralFunctionsTest {

	@Test
	public void createCharacterTest() {
		GeneralManager characterTest = new GeneralManager();
		assertEquals(true,characterTest.createCharacter("Character1", 100, 5, 5));
	}	
	
}
