package Modelo;

import Interfaces.IJugador;

public abstract class Jugador implements IJugador{

	private String jNombre;
	private String Atributos;
	private Integer Dorsal;
	private String Equipo;
	private String País;
	private Double Altura;

	
	public Jugador() {
		this("","",-1,"","",0.0);
	}


	public Jugador(String Nombre, String Atributos, Integer Dorsal, String Equipo, String Pais, double Altura) {
		super();
		this.jNombre = Nombre;
		this.Atributos = Atributos;
		this.Dorsal = Dorsal;
		this.Equipo = Equipo;
		this.País = Pais;
		this.Altura = Altura;
	}


	public String getNombre() {
		return jNombre;
	}


	public void setNombre(String nombre) {
		jNombre = nombre;
	}


	public String getAtributos() {
		return Atributos;
	}


	public void setAtributos(String atributos) {
		Atributos = atributos;
	}


	public Integer getDorsal() {
		return Dorsal;
	}


	public void setDorsal(int dorsal) {
		Dorsal = dorsal;
	}


	public String getEquipo() {
		return Equipo;
	}


	public void setEquipo(String equipo) {
		Equipo = equipo;
	}


	public String getPaís() {
		return País;
	}


	public void setPaís(String país) {
		País = país;
	}


	public Double getAltura() {
		return Altura;
	}


	public void setAltura(Double altura) {
		Altura = altura;
	}


	@Override
	public String toString() {
		return "Jugador [Nombre=" + jNombre + ", Atributos=" + Atributos + ", Dorsal=" + Dorsal + ", Equipo=" + Equipo
				+ ", País=" + País + ", Altura=" + Altura + "]";
	}


	public boolean equals(Object obj) {
		boolean result=false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				if(obj instanceof Equipo){
					if (this.Equipo!=null && this.Equipo.equals(((Equipo)obj).Equipo)) {
						result = true;
					}
				}
			}
		}
		return result;
	}
	
	
	
	
}
