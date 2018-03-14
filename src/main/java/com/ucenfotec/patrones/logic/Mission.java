package com.ucenfotec.patrones.logic;

import java.util.ArrayList;

public class Mission {
	private String name;
	private ArrayList objectiveList;
	
	public Mission(String pName, ArrayList pObjectiveList) {
		this.setName(pName);
		this.setObjectiveList(pObjectiveList);
	}
	
	public Mission() {}

	public void objectiveAccomplished() {
		//Refactorizar después
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public ArrayList getObjectiveList() {
		return objectiveList;
	}

	public void setObjectiveList(ArrayList pObjectiveList) {
		this.objectiveList = pObjectiveList;
	}

	@Override
	public String toString() {
		return "Mission [name=" + name + ", objectiveList=" + objectiveList + "]";
	}
	
	
}
