package com.ucenfotec.patrones.logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Map implements IGround {
	private String name;
	private String[][] arena;
	private ArrayList<Object> mapObjects;
	private ArrayList<Mission> mapMissions;
	
	public Map(String pName, ArrayList<Object> pMapObjects, ArrayList<Mission> pMapMissions, int pCantCol, int pCantRow) {
		this.setName(pName);
		this.setMapObjects(pMapObjects);
		this.setMapMissions(pMapMissions);
		this.setArena(new String[pCantRow][pCantCol]);
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String pName) {
		this.name = pName;
	}



	public String[][] getArena() {
		return arena;
	}



	public void setArena(String[][] pArena) {
		this.arena = pArena;
	}



	public ArrayList<Object> getMapObjects() {
		return mapObjects;
	}


	public void setMapObjects(ArrayList<Object> pMapObjects) {
		this.mapObjects = pMapObjects;
	}



	public ArrayList<Mission> getMapMissions() {
		return mapMissions;
	}


	
	public void setMapMissions(ArrayList<Mission> pMapMissions) {
		this.mapMissions = pMapMissions;
	}

	public ArrayList<Object> addObjetsIntoMap(Object pNewObject){
		this.mapObjects.add(pNewObject);
		
		return this.mapObjects;
	}
	
	public ArrayList<Mission> addMissionsIntoMap(Mission pNewMission){
		this.mapMissions.add(pNewMission);
		
		return this.mapMissions;
	}

	@Override
	public String type() {
		return null;//Refactorizar después
	}


	@Override
	public String toString() {
		return "Map [name=" + name + ", arena=" + Arrays.toString(arena) + ", mapObjects=" + mapObjects
				+ ", mapMissions=" + mapMissions + "]";
	}
	
	
}
