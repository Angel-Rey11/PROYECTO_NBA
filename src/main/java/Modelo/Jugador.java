package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import Interfaces.IJugador;

@XmlRootElement(name="Jugador")
@XmlAccessorType(XmlAccessType.FIELD)
public class Jugador implements Serializable,IJugador {
	
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name = "ID", required = true)
	private Integer id;
	@XmlAttribute(name = "Nombre", required = true)
	private String nombre;
	private ArrayList<Atributo> atributo;
	private Integer dorsal;
	private String pais;
	private Double altura;
	
	public Jugador() {
		
	}
	
	public Jugador(Integer id,String nombre, ArrayList<Atributo> atributo, Integer dorsal, String pais, Double altura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.atributo = atributo;
		this.dorsal = dorsal;
		this.pais = pais;
		this.altura = altura;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atributo> getAtributo() {
		return atributo;
	}

	public void setAtributo(ArrayList<Atributo> atributo) {
		this.atributo = atributo;
	}

	public Integer getDorsal() {
		return dorsal;
	}

	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", atributo=" + atributo + ", dorsal=" + dorsal + ", pais="
				+ pais + ", altura=" + altura + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Jugador other = (Jugador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
