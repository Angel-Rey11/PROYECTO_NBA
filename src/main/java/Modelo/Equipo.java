package Modelo;

import java.util.ArrayList;

import Interfaces.IEquipo;

public abstract class Equipo implements IEquipo{
	private String Nombre;
	private String Color;
	private int Njugadores;
	private String ArrayJugadores;
	
	public Equipo() {
			this("vacio","sin color",-1,"vacio");
	}

	public Equipo(String Nombre, String Color, int Njugadores, String Arrayjugadores) {
		super();
		this.Nombre = Nombre;
		this.Color = Color;
		this.Njugadores = Njugadores;
		this.ArrayJugadores = Arrayjugadores;	
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getNjugadores() {
		return Njugadores;
	}

	public void setNjugadores(int njugadores) {
		Njugadores = njugadores;
	}

	public String getArrayJugadores() {
		return ArrayJugadores;
	}

	public void setArrayJugadores(String arrayJugadores) {
		ArrayJugadores = arrayJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [Nombre=" + Nombre + ", Color=" + Color + ", Njugadores=" + Njugadores + ", ArrayJugadores="
				+ ArrayJugadores + "]";
	}
	
	
	public boolean equals(Object obj) {
		boolean result=false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				if(obj instanceof Equipo){
					if (this.Nombre!=null && this.Nombre.equals(((Equipo)obj).Nombre)) {
						result = true;
					}
				}
			}
		}
		return result;
	}
	
	
}
