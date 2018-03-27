package com.ucenfotec.patrones.logic;

public class Objective {
	private String name;
	private boolean status;
	
	public Objective(String pName) {
		this.setName(pName);
		this.setStatus(false);
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean pStatus) {
		this.status = pStatus;
	}

	@Override
	public String toString() {
		return "Objective [name=" + name + ", status=" + status + "]";
	}
	
	
}
