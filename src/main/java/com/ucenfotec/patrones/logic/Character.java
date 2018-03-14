package com.ucenfotec.patrones.logic;

public class Character {
	private String name;
	private int health;
	private int experience;
	private int power;
	
	public Character(String pName, int pHealth, int pExperience, int pPower) {
		this.setName(pName);
		this.setHealth(pHealth);
		this.setExperience(pExperience);
		this.setPower(pPower);
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int pHealth) {
		this.health = pHealth;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int pExperience) {
		this.experience = pExperience;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int pPower) {
		this.power = pPower;
	}
	
	public void getObject() {
		//Refactorizar después
	}
	
	public void loadObject() {
		//Refactorizar después
	}
	
	public void addExperience() {
		//Refactorizar después
	}
	
	public void moveCharacter() {
		//Refactorizar después
	}
	
	public void attack() {
		//Refactorizar después
	}
	
}
