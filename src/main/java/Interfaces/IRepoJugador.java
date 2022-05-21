package Interfaces;

import java.util.HashMap;

import Modelo.Jugador;

/**
 * Interfaz que implementa RepoJugador
 * @author Angel
 *
 */
public interface IRepoJugador {
	void modifyName(Integer ID, String Name);
	void modifyDorsal(Integer ID, Integer dorsal);
	void modifyAltura(Integer ID, Double altura);
	void modifyPais(Integer ID, String pais);
	boolean AddJugador(Jugador j);
	boolean removeJugador(Integer id);
	HashMap<Integer, Jugador> ShowPlayers();
	void showPlayersList(HashMap <Integer, Jugador> j);
	Jugador getJugador(Integer id);
	void saveFile(String url);
	void loadFile(String url);
}
