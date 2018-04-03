package com.ucenfotec.patrones.logic;

import java.util.ArrayList;

public class Mission {
	private String name;
	private ArrayList<Objective> objectives;
	
	public Mission(String pName) {
		this.setName(pName);
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String pName) {
		this.name = pName;
	}

		
	public void addObjetivesIntoMission(String pName, boolean pStatus){
		Objective newObjective = new Objective(pName, pStatus);
		
		try {
			this.objectives.add(newObjective);
		}catch(Exception error) {
			error.getClass();
			error.getMessage();
		}
		
	}
	
	public ArrayList<Objective> getObjectives() {
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
