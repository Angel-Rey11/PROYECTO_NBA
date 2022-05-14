package Modelo;

public class Apuesta {
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
	
	
}
