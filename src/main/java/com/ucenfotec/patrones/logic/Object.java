package com.ucenfotec.patrones.logic;


public class Object {
	private String name;
	private int attackPower;
	
	public Object(String pName, int pAttackPower) {
		this.setName(pName);
		this.setAttackPower(pAttackPower);
	}

	public Object() {}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int pAttackPower) {
		this.attackPower = pAttackPower;
	}

	@Override
	public String toString() {
		return "Object [name=" + name + ", attackPower=" + attackPower + "]";
	}
	
	
}
