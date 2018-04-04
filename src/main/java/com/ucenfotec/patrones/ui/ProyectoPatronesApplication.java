package com.ucenfotec.patrones.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

import com.ucenfotec.patrones.logic.*;



public class ProyectoPatronesApplication {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static GeneralManager manager = new GeneralManager();
    static Map myMap = new Map();
    static Mission myMission = new Mission();

	public static void main(String[] args) {
		//SpringApplication.run(ProyectoPatronesApplication.class, args);
		int option = -1;
        boolean stop = false;
        do{
            try {
                showMenu();
                option = readOption();
                stop = executeOption(option);
            } catch (Exception e) {
                out.println("Digite una opcion correcta");
            }

        }while(stop != true);
	}
	
	public static void showMenu(){
        out.println("\n" + "**Menu pincipal**" + "\n");
        out.println("1. Crear Personaje");
        out.println("2. Crear Mundo");
        out.println("3. Iniciar Partida");
        out.println("4. Cargar Partida");
        out.println("5. Salir");
    }
	
	public static int readOption() throws IOException{
        int option;

        out.println("Seleccione su opción: ");
        option = Integer.parseInt(in.readLine());
        out.println();

        return option;
    }
	
	static boolean executeOption(int pOption) throws IOException{
        boolean stop = false;

        switch(pOption){
            case 1:
            	createCharacter();
            break;

            case 2:
            	createMap();
            break;

            case 3:
            	newGame();
            break;
            
            case 4:
            	loadGame();
            break;

            case 5 :
            	stop = true;
            	out.println("Ha salido del sistema");
            break;

            default:
            	out.print("Ingrese una opcion valida" + '\n');
            break;
        }
        return stop;
    }
	
	public static void createCharacter() throws IOException {
		String name;
		int health;
		int experience;
		int power;
		boolean valid;
		
		out.println("\n" + "Ingrese el nombre del nuevo personaje");
		name = in.readLine();
		out.println("\n" + "Ingrese el poder/fuerza que desea que tenga el personaje");
		out.println("Maximo 50%");
		out.println("Minimo 5%");
		power = Integer.parseInt(in.readLine());
		
		do {
			out.println("El valor es invalido");
			out.println("Favor ingrese de nuevo el valor: ");
			power = Integer.parseInt(in.readLine());
		}while(power < 5 || power > 50);
		

		out.println("\n" + "El valor de vida por defecto es de 100%");
		health = 100;
		out.println("\n" + "El valor de experiencia por defecto es de 5%" + "\n");
		experience = 5;
		
		valid = manager.createCharacter(name, health, experience, power);
		
		if(valid) {
			out.println("\n" + "El personaje ha sido creado exitosamente" + "\n");
		}else {
			out.println("\n" + "Oops! Ha ocurrido un error." + "\n");
		}
	}
	
	
	public static void createMap() throws IOException {
		boolean valid;
		String name;
		int row;
		int col;
		int optionObjectives;
		ArrayList<Mission> myMissions;
		ArrayList<Item> myItems;
		
		out.println("Ingrese el nombre del mapa:");
        name = in.readLine();
        out.println("\n" + "Ingrese el alto del mapa:");
        row = Integer.parseInt(in.readLine());
        out.println("\n" + "Ingrese el ancho del mapa:");
        col = Integer.parseInt(in.readLine());
        
        out.println("\n" + "Desea ingresar una nueva mision al mapa?");
        out.println("1. Si");
		out.println("2. No");
		optionObjectives = Integer.parseInt(in.readLine());
		
		do {
			myMissions = createMission();
			out.println("\n" + "Desea ingresar una nueva mision al mapa?");
	        out.println("1. Si");
			out.println("2. No");
			optionObjectives = Integer.parseInt(in.readLine());
		}while(optionObjectives == 1);
		
		out.println("\n" + "Desea ingresar un nuevo item al mapa?");
        out.println("1. Si");
		out.println("2. No");
		optionObjectives = Integer.parseInt(in.readLine());
		
		do {
			myItems = createItem();
			out.println("\n" + "Desea ingresar un nuevo item al mapa?");
	        out.println("1. Si");
			out.println("2. No");
			optionObjectives = Integer.parseInt(in.readLine());
		}while(optionObjectives == 1);
		
		valid = manager.createMap(name, row, col, myMissions, myItems);
		
		if(valid) {
			out.println("\n" + "El mapa ha sido creado exitosamente" + "\n");
		}else {
			out.println("\n" + "Oops! Ha ocurrido un error." + "\n");
		}
	}
	
	public static ArrayList<Mission> createMission() throws IOException{
		String missionName;
		int optionObjectives;
		ArrayList<Objective> myObjectives;
		ArrayList<Mission> missionList;
		
		out.println("Ingrese el nombre de la mission:");
		missionName = in.readLine();
		
		out.println("\n" + "Desea ingresar un nuevo objectivo a la mision?");
		out.println("1. Si");
		out.println("2. No");
		optionObjectives = Integer.parseInt(in.readLine());
		
		do {
			myObjectives = createObjective();
			out.println("\n" + "Desea ingresar un nuevo objectivo a la mision?");
			out.println("1. Si");
			out.println("2. No");
			optionObjectives = Integer.parseInt(in.readLine());
		}while(optionObjectives == 1);
		
		missionList = myMap.addMissionsIntoMap(missionName, myObjectives);
		
		if(missionList != null) {
			out.println("\n" + "Misisones del mapa" + "\n");
			out.print(missionList.toString());
		}
		
		return missionList;
	}
	
	public static ArrayList<Objective> createObjective() throws IOException{
		String objectiveName;
		boolean status;
		ArrayList<Objective> objectivesList;
		
		out.println("Ingrese el nombre del objetivo de la mision");
		objectiveName = in.readLine();
		out.println("\n" + "El estatus por defecto del objectivo es false(Sin cumplir)");
		status = false;
		
		objectivesList = myMission.addObjetivesIntoMission(objectiveName, status);
		
		if(objectivesList != null) {
			out.println("\n" + "Objectivos de la mision" + "\n");
			out.print(objectivesList.toString());
		}
		
		return objectivesList;
	}
	
	public static ArrayList<Item> createItem() throws IOException{
		String itemName;
		int itemPower;
		ArrayList<Item> itemsList;
		
		out.println("Ingrese el nombre del item:");
		itemName = in.readLine();
		out.println("\n" + "Ingrese el poder/fuerza que posee el item:");
		itemPower = Integer.parseInt(in.readLine());
		
		itemsList = myMap.addObjetsIntoMap(itemName, itemPower);
		
		if(itemsList != null) {
			out.println("\n" + "Items del mapa" + "\n");
			out.print(itemsList.toString());
		}
		
		return itemsList;
	}
	
	public static void newGame() {
		out.println("Option 3");
	}
	
	public static void loadGame() {
		out.println("Option 4");
	}
	
}
