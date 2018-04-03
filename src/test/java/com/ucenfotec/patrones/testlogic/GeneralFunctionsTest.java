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
	
	@Test
	public void createEnemyTest() {
		GeneralManager enemyTest = new GeneralManager();
		assertEquals(true,enemyTest.createEnemy("Enemy1", 100, 2));
	}
	
	@Test
	public void createMapTest() {
		GeneralManager mapTest = new GeneralManager();
		assertEquals(true,mapTest.createMap("Map1", 20, 20, "Mission1", "Objetivo1", "Item1", 10));
	}
	
}
