package Modelo;


public class Moneda {
	private Integer valor;
	
	public Moneda() {
		
	}

	public Moneda(Integer valor) {
		super();
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Moneda [valor=" + valor + "]";
	}
}
