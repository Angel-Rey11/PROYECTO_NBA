package Vistas;

import Interfaces.IVista;

public class Vistas implements IVista{
	public void showMainMenu() {
		System.out.println("1. Jugadores");
		System.out.println("2. Equipos");
		System.out.println("3. Torneos");
		System.out.println("4. Salir");
	}
	
	public void showMainPlayer() {
		System.out.println("1. Crear jugador");
		System.out.println("2. Eliminar jugador");
		System.out.println("3. Editar jugador");
		System.out.println("4. Añadir atributos");
		System.out.println("5. Volver");
	}
	
	public void showMainTeam() {
		System.out.println("1. Crear equipo");
		System.out.println("2. Eliminar equipo");
		System.out.println("3. Editar equipo");
		System.out.println("4. Añadir jugadores");
		System.out.println("5. Volver");
	}
	
	public void showMainTorneos() {
		System.out.println("1. Crear torneo");
		System.out.println("2. Eliminar torneo");
		System.out.println("3. Apuestas");
		System.out.println("4. Ver torneo");
		System.out.println("5. Volver");
	}
	
	public void separar() {
		System.out.println("---------------------------------------");
	}

}
