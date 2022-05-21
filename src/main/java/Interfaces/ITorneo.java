package Interfaces;

import java.util.ArrayList;

import Modelo.Equipo;

/**
 * Interfaz que implementa Torneo
 * @author Angel
 *
 */
public interface ITorneo {
	Integer getIdentificador();
	String getNombre();
	ArrayList<Equipo> getListaEquipos();
	void setIdentificador(Integer identificador);
	void setNombre(String nombre);
	void setListaEquipos(ArrayList<Equipo> listaEquipos);
	boolean equals(Object o);
	int hashCode();
	String toString();
}
