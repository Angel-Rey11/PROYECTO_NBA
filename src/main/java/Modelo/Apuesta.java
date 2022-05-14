package Modelo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Apuesta")
@XmlAccessorType(XmlAccessType.FIELD)
public class Apuesta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name = "Cantidad", required = true)
	private Integer Cantidad;
	private Integer nApuesta;
	
	public Apuesta() {
		
	}
	
	public Apuesta(Integer cantidad, Integer nApuesta) {
		super();
		Cantidad = cantidad;
		this.nApuesta = nApuesta;
	}
	
	public Integer getCantidad() {
		return Cantidad;
	}
	
	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}
	
	public Integer getnApuesta() {
		return nApuesta;
	}
	
	public void setnApuesta(Integer nApuesta) {
		this.nApuesta = nApuesta;
	}

	@Override
	public String toString() {
		return "Apuesta [Cantidad=" + Cantidad + ", nApuesta=" + nApuesta + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nApuesta == null) ? 0 : nApuesta.hashCode());
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
		Apuesta other = (Apuesta) obj;
		if (nApuesta == null) {
			if (other.nApuesta != null)
				return false;
		} else if (!nApuesta.equals(other.nApuesta))
			return false;
		return true;
	}
	
	
	
}
