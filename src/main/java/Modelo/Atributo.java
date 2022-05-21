package Modelo;

import Interfaces.IAtribute;

public class Atributo implements IAtribute{
	private Integer tiro;
	private Integer defensa;
	private Integer posicionamiento;
	private Integer velocidad;
	private Integer fuerza;
	private Integer salto;
	private Integer dribling;
	private Integer resistencia;
	private Integer vision;
	private Integer pase;
	private Integer agilidad;
	
	public Atributo() {
		
	}
	
	public Atributo(Integer tiro, Integer defensa, Integer posicionamiento, Integer velocidad, Integer fuerza,
			Integer salto, Integer dribling, Integer resistencia, Integer vision, Integer pase, Integer agilidad) {
		super();
		this.tiro = tiro;
		this.defensa = defensa;
		this.posicionamiento = posicionamiento;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.salto = salto;
		this.dribling = dribling;
		this.resistencia = resistencia;
		this.vision = vision;
		this.pase = pase;
		this.agilidad = agilidad;
	}

	public Integer getTiro() {
		return tiro;
	}

	public void setTiro(Integer tiro) {
		this.tiro = tiro;
	}

	public Integer getDefensa() {
		return defensa;
	}

	public void setDefensa(Integer defensa) {
		this.defensa = defensa;
	}

	public Integer getPosicionamiento() {
		return posicionamiento;
	}

	public void setPosicionamiento(Integer posicionamiento) {
		this.posicionamiento = posicionamiento;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getFuerza() {
		return fuerza;
	}

	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}

	public Integer getSalto() {
		return salto;
	}

	public void setSalto(Integer salto) {
		this.salto = salto;
	}

	public Integer getDribling() {
		return dribling;
	}

	public void setDribling(Integer dribling) {
		this.dribling = dribling;
	}

	public Integer getResistencia() {
		return resistencia;
	}

	public void setResistencia(Integer resistencia) {
		this.resistencia = resistencia;
	}

	public Integer getVision() {
		return vision;
	}

	public void setVision(Integer vision) {
		this.vision = vision;
	}

	public Integer getPase() {
		return pase;
	}

	public void setPase(Integer pase) {
		this.pase = pase;
	}

	public Integer getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(Integer agilidad) {
		this.agilidad = agilidad;
	}

	@Override
	public String toString() {
		return "Atributo [tiro=" + tiro + ", defensa=" + defensa + ", posicionamiento=" + posicionamiento
				+ ", velocidad=" + velocidad + ", fuerza=" + fuerza + ", salto=" + salto + ", dribling=" + dribling
				+ ", resistencia=" + resistencia + ", vision=" + vision + ", pase=" + pase + ", agilidad=" + agilidad
				+ "]";
	}
}
