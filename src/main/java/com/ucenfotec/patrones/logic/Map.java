package com.ucenfotec.patrones.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Map implements IGround {
	private String name;
	private String[][] arena;
	private ArrayList<Item> mapItems;
	private ArrayList<Mission> mapMissions;
	
	public Map(String pName, String[][] pArena, ArrayList<Mission> pMyMissions, ArrayList<Item> pMyItems) {
		this.setName(pName);
		this.setArena(pArena);
		this.setMapMissions(pMyMissions);
		this.setMapItems(pMyItems);
	}
	
	
	public Map() {}


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
	

	public void setMapItems(ArrayList<Item> mapItems) {
		this.mapItems = mapItems;
	}
	
	public ArrayList<Item> getMapItems() {
		return this.mapItems;
	}
	
	public void setMapMissions(ArrayList<Mission> mapMissions) {
		this.mapMissions = mapMissions;
	}

	public ArrayList<Mission> getMapMissions() {
		return this.mapMissions;
	}


	public ArrayList<Item> addObjetsIntoMap(String pNameItem, int pPowerItem){
		Item newItem = new Item(pNameItem, pPowerItem);
		try {
			if(this.mapItems == null || this.mapItems != null){
				this.mapItems.add(newItem);
			}
		}catch(Exception error) {
			error.getClass();
			error.getMessage();
		}
		
		return this.mapItems;
	}
	
	public ArrayList<Mission> addMissionsIntoMap(String pNameMission, ArrayList<Objective> pMyObjectives){
		Mission newMission = new Mission(pNameMission, pMyObjectives);
		
		try {
			 if(mapMissions == null || this.mapMissions != null){
				 this.mapMissions.add(newMission);
			 }

		}catch(Exception error) {
			error.getClass();
			error.getMessage();
		}
		
		return this.mapMissions;
		
	}
	

	@Override
	public String type(String pType) {
		return pType;//Refactorizar después
	}


	@Override
	public String toString() {
		return "Map [name=" + name + ", arena=" + Arrays.toString(arena) + ", mapItems=" + mapItems + ", mapMissions="
				+ mapMissions + "]";
	}

	
}
