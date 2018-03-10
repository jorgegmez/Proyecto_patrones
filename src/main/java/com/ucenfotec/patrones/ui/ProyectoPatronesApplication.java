package com.ucenfotec.patrones.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoPatronesApplication {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

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
		
		out.println("\n" + "Ingrese el nombre del nuevo personaje");
		name = in.readLine();
		out.println("\n" + "Ingrese el poder/fuerza que desea que tenga el personaje");
		out.println("Maximo 50%");
		out.println("Minimo 5%");
		power = Integer.parseInt(in.readLine());
		out.println("\n" + "El valor de vida por defecto es de 100%");
		health = 100;
		out.println("\n" + "El valor de experiencia por defecto es de 5%" + "\n");
		experience = 5;
	}
	
	
	public static void createMap() {
		out.println("Option 2");
	}
	
	public static void newGame() {
		out.println("Option 3");
	}
	
	public static void loadGame() {
		out.println("Option 4");
	}
	
}
