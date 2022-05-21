package Interfaces;

import Modelo.Equipo;

/**
 * Interfaz que implementa Apuesta
 * @author Angel
 *
 */
public interface IApuesta {
	Integer getSaldo();
	Equipo getEquipo();
	Integer getCantidad();
	Integer getnApuesta();
	void setSaldo(Integer saldo);
	void setEquipo(Equipo equipo);
	void setCantidad(Integer cantidad);
	void setnApuesta(Integer nApuesta);
	boolean equals(Object o);
    int hashCode();
    String toString();
}
