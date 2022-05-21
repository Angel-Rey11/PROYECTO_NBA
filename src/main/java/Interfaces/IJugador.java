package Interfaces;

import java.util.ArrayList;

import Modelo.Atributo;

/**
 * Interfaz que implementa Jugador
 * @author Angel
 *
 */
public interface IJugador {
	Integer getId();
	String getNombre();
	ArrayList<Atributo> getAtributo();
	Integer getDorsal();
    String getPais();
    Double getAltura();
    void setId(Integer id);
    void setNombre(String nombre);
    void setAtributo(ArrayList<Atributo> atributo);
    void setDorsal(Integer Dorsal);
    void setPais(String Pais); 
    void setAltura(Double Altura);
    boolean equals(Object o);
    int hashCode();
    String toString();
}
