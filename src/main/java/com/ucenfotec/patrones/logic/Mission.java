package com.ucenfotec.patrones.logic;

import java.util.ArrayList;

public class Mission {
	private String name;
	private ArrayList<Objective> objectives;
	
	public Mission(String pName, ArrayList<Objective> pMyObjectives) {
		this.setName(pName);
		this.setObjectives(pMyObjectives);
	}
	
	
	public Mission() {}


	public String getName() {
		return name;
	}


	public void setName(String pName) {
		this.name = pName;
	}
	

		
	public ArrayList<Objective> addObjetivesIntoMission(String pName, boolean pStatus){
		Objective newObjective = new Objective(pName, pStatus);
		
		try {
			if(this.objectives == null || this.objectives != null) {
				this.objectives.add(newObjective);
			}
		}catch(Exception error) {
			error.getClass();
			error.getMessage();
		}
		
		return this.objectives;
	}
	
	public void setObjectives(ArrayList<Objective> pMyObjectives) {
		this.objectives = pMyObjectives;
	}


	public ArrayList<Objective> getObjectives() {
		return this.objectives;
	}


	public int objectivesAchieved() {
		return 0;//Refactorizar después
	}


	@Override
	public String toString() {
		return "Mission [name=" + name + ", objectives=" + objectives + "]";
	}
	
}
