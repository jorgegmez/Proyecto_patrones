package com.ucenfotec.patrones.logic;

public class Object {
	private String name;
	private int power;
	
	public Object(String pName, int pPower) {
		this.setName(pName);
		this.setPower(pPower);
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int pPower) {
		this.power = pPower;
	}

	@Override
	public String toString() {
		return "Object [name=" + name + ", power=" + power + "]";
	}
	
	
}
