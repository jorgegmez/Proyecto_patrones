package com.ucenfotec.patrones.logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Map {
	private String name;
	private ArrayList<Object> objectList;
	private Map[][] mapSize = new Map[20][20];
	
	public Map(String pName, ArrayList<Object> pObjectList, Map[][] pMapSize) {
		this.setName(pName);
		this.setObjectList(pObjectList);
		this.setMapSize(pMapSize);
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public ArrayList<Object> getObjectList() {
		return objectList;
	}

	public void setObjectList(ArrayList<Object> pObjectList) {
		this.objectList = pObjectList;
	}

	public Map[][] getMapSize() {
		return mapSize;
	}

	public void setMapSize(Map[][] pMapSize) {
		this.mapSize = pMapSize;
	}

	@Override
	public String toString() {
		return "Map [name=" + name + ", objectList=" + objectList + ", mapSize=" + Arrays.toString(mapSize) + "]";
	}
	
	
	
	
}
