package Interfaces;

import java.util.ArrayList;

import Modelo.Jugador;

/**
 * Interfaz que implementa Equipo
 * @author Angel
 *
 */
public interface IEquipo {
	String getNombre();
	String getColor();
	Integer getnJugadores();
	ArrayList<Jugador> getListaJugadores();
	void setColor(String color);
	void setNombre(String nombre);
	void setnJugadores(Integer nJugadores);
	void setListaJugadores(ArrayList<Jugador> listaJugadores);
	boolean equals(Object o);
    int hashCode();
    String toString();
}
