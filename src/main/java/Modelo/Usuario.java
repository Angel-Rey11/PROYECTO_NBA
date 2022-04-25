package Modelo;

public class Usuario  {

	private String nUsuario;
	private String Password;
	private int puntos;
	
	
	public Usuario() {
		this("","",0);
	}


	public Usuario(String nUsario, String Password, int puntos) {
		super();
		this.nUsuario = nUsario;
		this.Password = Password;
		this.puntos = puntos;
		
	}


	public String getnUsuario() {
		return nUsuario;
	}


	public void setnUsuario(String nUsuario) {
		this.nUsuario = nUsuario;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	@Override
	public String toString() {
		return "Usuario [nUsuario=" + nUsuario + ", Password=" + Password + ", puntos=" + puntos + "]";
	}
	
	
	public boolean equals(Object obj) {
		boolean result=false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				if(obj instanceof Equipo){
					if (this.nUsuario!=null && this.nUsuario.equals(((Equipo)obj).nUsuario)) {
						result = true;
					}
				}
			}
		}
		return result;
	}
	
}
