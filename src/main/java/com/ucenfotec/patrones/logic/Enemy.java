package com.ucenfotec.patrones.logic;

public class Enemy implements IAttack {
	private String name;
	private int health;
	private int power;
	
	public Enemy(String pName, int pHealth, int pPower) {
		this.setName(pName);
		this.setHealth(pHealth);
		this.setPower(pPower);
	}
	
	
	public Enemy() {}


	@Override
	public int attack() {
		Character character = new Character();
		int myAttack = 0;
		myAttack = character.getHealth() - getPower();
		return myAttack;//Refactorizar
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


	public int getPower() {
		return power;
	}


	public void setPower(int pPower) {
		this.power = pPower;
	}


	@Override
	public String toString() {
		return "Enemy [name=" + name + ", health=" + health + ", power=" + power + "]";
	}
	
}
