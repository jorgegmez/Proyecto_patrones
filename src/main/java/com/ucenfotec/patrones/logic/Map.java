package com.ucenfotec.patrones.logic;

import java.util.Arrays;

public class Map {
	private String name;
	private Object object;
	private Mission missionMap;
	private Map[][] mapSize = new Map[20][20];
	private Map[][] arena;
	
	public Map(String pName, Object pObject, Mission pMissionMap, Map[][] pMapSize) {
		this.setName(pName);
		this.setObject(new Object());
		this.setMissionMap(new Mission());
		this.setMapSize(pMapSize);
		this.setArena(pMapSize);
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		this.name = pName;
	}


	public Object getObject() {
		return object;
	}

	public void setObject(Object pObject) {
		this.object = pObject;
	}
	

	public Mission getMissionMap() {
		return missionMap;
	}

	public void setMissionMap(Mission pMissionMap) {
		this.missionMap = pMissionMap;
	}

	public Map[][] getMapSize() {
		return mapSize;
	}

	public void setMapSize(Map[][] pMapSize) {
		this.mapSize = pMapSize;
	}
	
	public Map[][] getArena() {
		return arena;
	}

	public void setArena(Map[][] pMapSize) {
		this.arena = pMapSize;
	}

	@Override
	public String toString() {
		return "Map [name=" + name + ", object=" + object + ", missionMap=" + missionMap + 
				", mapSize=" + Arrays.toString(mapSize) + ", arena=" + Arrays.toString(arena) + "]";
	}

	
	
}
