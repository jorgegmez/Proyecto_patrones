package com.ucenfotec.patrones.logic;

public class Map implements IGround {
	private String name;
	private String arena;
	private Object object;
	
	public Map(String pName, String pArena, Object pObject) {
		this.setName(pName);
		this.setArena(pArena);
		this.setObject(pObject);
	}
	

	public String getName() {
		return name;
	}


	public void setName(String pName) {
		this.name = pName;
	}


	public String getArena() {
		return arena;
	}


	public void setArena(String pArena) {
		this.arena = pArena;
	}


	public Object getObject() {
		return object;
	}


	public void setObject(Object pObject) {
		this.object = pObject;
	}


	@Override
	public String type() {
		return null;
	}


	@Override
	public String toString() {
		return "Map [name=" + name + ", arena=" + arena + ", object=" + object + "]";
	}
	
}
