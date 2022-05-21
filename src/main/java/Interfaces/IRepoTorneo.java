package Interfaces;

import java.util.HashMap;

import Modelo.Torneo;

/**
 * Interfaz que implementa RepoTorneo
 * @author Angel
 *
 */
public interface IRepoTorneo {
	boolean AddTorneo(Torneo t);
	boolean removeTorneo(Integer id);
	HashMap<Integer, Torneo> ShowTorneos();
	void showTorneosList(HashMap <Integer, Torneo> t);
	Torneo getTorneo(Integer id);
	void saveFile(String url);
	void loadFile(String url);
}
