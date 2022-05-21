package Vistas;

import Interfaces.IVista;

public class Vistas implements IVista{
	/**
	 * Vista para el menu principal del programa
	 */
	public void showMainMenu() {
		System.out.println("1. Jugadores");
		System.out.println("2. Equipos");
		System.out.println("3. Torneos");
		System.out.println("4. Retirar saldo y Salir");
	}
	
	/**
	 * Vista para el menu principal de jugador
	 */
	public void showMainPlayer() {
		System.out.println("1. Crear jugador");
		System.out.println("2. Eliminar jugador");
		System.out.println("3. Editar jugador");
		System.out.println("4. Ver jugadores");
		System.out.println("5. Volver");
	}
	
	/**
	 * Vista para el menu principal de equipos
	 */
	public void showMainTeam() {
		System.out.println("1. Crear equipo");
		System.out.println("2. Eliminar equipo");
		System.out.println("3. Editar equipo");
		System.out.println("4. Ver equipos");
		System.out.println("5. Volver");
	}
	
	/**
	 * Vista para el submenu de jugador para modificar un jugador 
	 */
	public void showModifyPlayer() {
		System.out.println("1. Modificar Nombre");
		System.out.println("2. Modificar Dorsal");
		System.out.println("3. Modificar Altura");
		System.out.println("4. Modificar Pais");
		System.out.println("5. Volver");
	}
	
	/**
	 * Vista para el submenu de equipo para modificar un equipo
	 */
	public void showModifyTeam() {
		System.out.println("1. Modificar Color");
		System.out.println("2. Modificar Numero de jugadores");
		System.out.println("3. Volver");
	}
	
	/**
	 * Vista para el menu de torneos
	 */
	public void showMainTorneos() {
		System.out.println("1. Crear torneo");
		System.out.println("2. Eliminar torneo");
		System.out.println("3. Comenzar torneo");
		System.out.println("4. Ver torneos");
		System.out.println("5. Volver");
	}
	
	/**
	 * Vista para el submenu de torneo para empezar un torneo o entrar al menu de apuestas
	 */
	public void showStartTorneo() {
		System.out.println("1. Empezar torneo");
		System.out.println("2. Ver emparejamientos del torneo");
		System.out.println("3. Apuestas");
		System.out.println("4. Volver");
	}
	
	/**
	 * Vista para el submenu de empezar torneo para hacer apuestas y poder verlas
	 */
	public void showMenuApuestas() {
		System.out.println("1. Hacer apuesta");
		System.out.println("2. Eliminar apuesta");
		System.out.println("3. Ver apuestas");
		System.out.println("4. Volver");
	}
	
	/**
	 * Vista para separar unas de otras
	 */
	public void separar() {
		System.out.println("---------------------------------------");
	}

}
