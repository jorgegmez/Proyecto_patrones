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
	
	public Map(String pName, String[][] pArena) {
		this.setName(pName);
		this.setArena(pArena);
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


	public ArrayList<Mission> getMapMissions() {
		return mapMissions;
	}


	public void addObjetsIntoMap(String pNameItem, int pPowerItem){
		Item newItem = new Item(pNameItem, pPowerItem);
		try {
			this.mapItems.add(newItem);
		}catch(Exception error) {
			error.getClass();
			error.getMessage();
		}
	}
	
	public void addMissionsIntoMap(String pNameMission, String pNameObjective){
		boolean status = false;
		Mission newMission = new Mission(pNameMission);
		
		
		try {
			newMission.addObjetivesIntoMission(pNameObjective, status);
			this.mapMissions.add(newMission);

		}catch(Exception error) {
			error.getClass();
			error.getMessage();
		}
		
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
