package Interfaces;

import java.util.HashSet;

public interface IEquipo {
	String getColor();
	String getNombre();
	Integer getNP();
	HashSet <IJugador> getPlayers();
	void setColor(String color);
	void setNombre(String nombre);
	void setNP(Integer NP);
}
