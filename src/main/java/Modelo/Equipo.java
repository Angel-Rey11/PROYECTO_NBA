package Modelo;


import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import Interfaces.IEquipo;

@XmlRootElement(name="Equipo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Equipo implements Serializable,IEquipo{
	
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name = "Nombre", required = true)
	private String nombre;
	private String color;
	private Integer nJugadores;
	private ArrayList<Jugador> listaJugadores;
	
	public Equipo() {
		
	}
	public Equipo(String nombre, String color, Integer nJugadores, ArrayList<Jugador> listaJugadores) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.nJugadores = nJugadores;
		this.listaJugadores = listaJugadores;
	}
	
	
	public Equipo(String nombre, String color, Integer nJugadores) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.nJugadores = nJugadores;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getnJugadores() {
		return nJugadores;
	}
	
	public void setnJugadores(Integer nJugadores) {
		this.nJugadores = nJugadores;
	}
	
	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	
	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", color=" + color + ", nJugadores=" + nJugadores + ", listaJugadores="
				+ listaJugadores + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
