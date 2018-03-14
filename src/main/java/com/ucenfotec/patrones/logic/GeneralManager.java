package com.ucenfotec.patrones.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeneralManager {
	
	public boolean createCharacter(String pName, int pHealth, int pExperience, int pPower){
        boolean valid;
        ArrayList<Character> characterList = new ArrayList<>();
        Character newCharacter = new Character(pName, pHealth, pExperience, pPower);
        characterList.add(newCharacter);
        
        try {
        	FileWriter fw = new FileWriter("characters.txt", false);
        	BufferedWriter bw = new BufferedWriter(fw);
        	for(Character ch : characterList) {
        		String chText = ch.toString();
        		bw.write(chText);
        		bw.newLine();
        	}
        	bw.close();
        	valid = true;
        }catch(IOException error) {
        	error.printStackTrace();
        	valid = false;
        }
        return valid;
    }
	
	public boolean createMap(String pName, ArrayList<Object> pObjectList, Map[][] pMapSize) {
		return true;
	}

}
