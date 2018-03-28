package com.ucenfotec.patrones.logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Map implements IGround {
	private String name;
	private String[][] arena;
	private ArrayList<Item> mapItems;
	private ArrayList<Mission> mapMissions;
	
	public Map(String pName, ArrayList<Item> pMapItems, ArrayList<Mission> pMapMissions, int pCantCol, int pCantRow) {
		this.setName(pName);
		this.setMapObjects(pMapItems);
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


	public ArrayList<Item> getMapObjects() {
		return mapItems;
	}


	public void setMapObjects(ArrayList<Item> pMapItems) {
		this.mapItems = pMapItems;
	}


	public ArrayList<Mission> getMapMissions() {
		return mapMissions;
	}

	
	public void setMapMissions(ArrayList<Mission> pMapMissions) {
		this.mapMissions = pMapMissions;
	}

	public ArrayList<Item> addObjetsIntoMap(Item pNewItem){
		this.mapItems.add(pNewItem);
		
		return this.mapItems;
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
		return "Map [name=" + name + ", arena=" + Arrays.toString(arena) + ", mapItems=" + mapItems + ", mapMissions="
				+ mapMissions + "]";
	}

	
}
