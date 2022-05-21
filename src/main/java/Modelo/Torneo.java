package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import Interfaces.ITorneo;

@XmlRootElement(name="Torneo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Torneo implements Serializable,ITorneo {
	
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name = "ID", required = true)
	private Integer identificador;
	private String nombre;
	private ArrayList<Equipo> listaEquipos;
	
	public Torneo() {
		
	}

	public Torneo(Integer identificador, String nombre, ArrayList<Equipo> listaEquipos) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.listaEquipos = listaEquipos;
	}
	
	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	@Override
	public String toString() {
		return "Torneo [identificador=" + identificador + ", nombre=" + nombre + ", listaEquipos=" + listaEquipos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
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
		Torneo other = (Torneo) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

	
}
