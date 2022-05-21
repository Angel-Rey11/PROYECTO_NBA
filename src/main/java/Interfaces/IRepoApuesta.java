package Interfaces;

import java.util.HashMap;

import Modelo.Apuesta;

/**
 * Interfaz que implementa RepoApuesta
 * @author Angel
 *
 */
public interface IRepoApuesta {
	boolean AddEquipo(Apuesta a);
	boolean removeEquipo(Integer n);
	HashMap<Integer, Apuesta> ShowApuestas();
	Integer showApuestaList(HashMap <Integer, Apuesta> e);
	void saveFile(String url);
	void loadFile(String url);
}
