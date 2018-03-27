package com.ucenfotec.patrones.logic;

import java.util.ArrayList;

public class Character implements IAttack, IAbility {
	
	private String name;
	private int health;
	private int experience;
	private int power;
	private ArrayList<Object> myObject;
	
	public Character(String pName, int pHealth, int pExperience, int pPower) {
		this.setName(pName);
		this.setHealth(pHealth);
		this.setExperience(pExperience);
		this.setPower(pPower);
	}
	
	public Object getObject() {
		return null;//Refactorizar después
	}
	
	public ArrayList<Object> loadObject() {
		myObject.add(null);
		return myObject;//Refactorizar después
	}
	
	public int addExperience() {
		return 0;//Refactorizar después
	}
	
	public void moveCharacter() {
		//Refactorizar después
	}

	@Override
	public String ability() {
		return null;//Refactorizar después
	}

	@Override
	public int attack() {
		return this.getPower();
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

	@Override
	public String toString() {
		return "Character [name=" + name + ", health=" + health + ", experience=" + experience + 
				", power=" + power + ", myObject=" + myObject + "]";
	}

}
