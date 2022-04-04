package Interfaces;

import java.util.ArrayList;

public interface IJugador {
	String getName();
    String getPais();
    Integer getDorsal();
    Integer getAge();
    Double getAltura();
    ArrayList<IAtribute> getAtribute();
    String getTeam();
    void setTeam(String Team);
    void setAtribute(String Atribute);
    void setAltura(Double Altura);
    void setName(String Name);
    void setPais(String Pais);
    void setAge(Integer Age);
    void setDorsal(Integer Dorsal);
    boolean equals(Object o);
    int hashCode();
    String toString();
}
