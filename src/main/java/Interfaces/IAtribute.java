package Interfaces;

/**
 * Interfaz que implementa Atributo
 * @author Angel
 *
 */
public interface IAtribute {
	Integer getTiro();
	Integer getDefensa();
	Integer getPosicionamiento();
	Integer getVelocidad();
	Integer getFuerza();
	Integer getSalto();
	Integer getDribling();
	Integer getResistencia();
	Integer getVision();
	Integer getPase();
	Integer getAgilidad();
	void setTiro(Integer tiro);
	void setDefensa(Integer defensa);
	void setPosicionamiento(Integer posicionamiento);
	void setVelocidad(Integer velocidad);
	void setFuerza(Integer fuerza);
	void setSalto(Integer salto);
	void setDribling(Integer dribling);
	void setResistencia(Integer resistencia);
	void setVision(Integer vision);
	void setPase(Integer pase);
	void setAgilidad(Integer agilidad);
}
