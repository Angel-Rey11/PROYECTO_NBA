package Interfaces;

import java.util.HashMap;

import Modelo.Equipo;

/**
 * Interfaz que implementa RepoEquipo
 * @author Angel
 *
 */
public interface IRepoEquipo {
	void modifyColor(String name, String color);
	void modifyNPlayers(String name, Integer nj);
	boolean AddEquipo(Equipo e);
	boolean removeEquipo(String nombre);
	HashMap<String, Equipo> ShowTeams();
	void showTeamsList(HashMap <String, Equipo> e);
	Equipo getEquipo(String nombre);
	void saveFile(String url);
	void loadFile(String url);
}
