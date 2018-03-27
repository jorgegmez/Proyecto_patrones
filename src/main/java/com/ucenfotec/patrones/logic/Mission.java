package com.ucenfotec.patrones.logic;

import java.util.ArrayList;

public class Mission {
	private String name;
	private ArrayList<Objective> objectives;
	
	public Mission(String pName, ArrayList<Objective> pObjectives) {
		this.setName(pName);
		this.setObjectives(pObjectives);
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String pName) {
		this.name = pName;
	}


	public ArrayList<Objective> getObjectives() {
		return objectives;
	}


	public void setObjectives(ArrayList<Objective> pObjectives) {
		this.objectives = pObjectives;
	}

	
	public ArrayList<Objective> addObjetivesIntoMission(Objective pNewObjtive){
		this.objectives.add(pNewObjtive);
		
		return objectives;
	}


	public int objectivesAchieved() {
		return 0;//Refactorizar después
	}



	@Override
	public String toString() {
		return "Mission [name=" + name + ", objectives=" + objectives + "]";
	}
	
}
