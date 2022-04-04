package Interfaces;

public interface IUsuario {
	String getDNI();
    String getNick();
    Integer getCoin();
    String getAddress();
    Integer getAge();
    void setDNI(String DNI);
    void setNick(String Nick);
    void setAddress(String Address);
    void setAge(Integer Age);
    void setCoin(Integer Coin);
    boolean equals(Object o);
    int hashCode();
    String toString();
}
