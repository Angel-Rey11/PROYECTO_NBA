package Modelo;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import Utils.Utils;

@XmlRootElement(name="RepoJugador")
@XmlAccessorType(XmlAccessType.FIELD)
public class RepoJugador {
	
	//patron singleton
	private static RepoJugador _instance;
	
	private HashMap<Integer, Jugador> jugadores;

	public RepoJugador() {
		jugadores = new HashMap<Integer, Jugador>();
	}
	
	/**
	 * Metodo para instanciar una lista una sola vez
	 * @return Lista instanciada
	 */
	public static RepoJugador getInstance() {
		if (_instance==null) {
			_instance=new RepoJugador();
		}
		return _instance;
	}
	
	/**
	 * Metodo para modificar el nombre de un jugador localizado por su ID
	 * @param ID del jugador a buscar
	 * @param Name Nombre al que se quiere cambiar
	 */
	public void modifyName(Integer ID, String Name) {
		if(this.jugadores.containsKey(ID)) {
			jugadores.get(ID).setNombre(Name);
		}
	}
	
	/**
	 * Metodo para modificar el dorsal de un jugador localizado por su ID
	 * @param ID del jugador a buscar
	 * @param dorsal dorsal al que se quiere cambiar
	 */
	public void modifyDorsal(Integer ID, Integer dorsal) {
		if(this.jugadores.containsKey(ID)) {
			jugadores.get(ID).setDorsal(dorsal);
		}
	}
	
	/**
	 * Metodo para modificar la altura de un jugador localizado por su ID
	 * @param ID del jugador a buscar
	 * @param altura altura al que se quiere cambiar
	 */
	public void modifyAltura(Integer ID, Double altura) {
		if(this.jugadores.containsKey(ID)) {
			jugadores.get(ID).setAltura(altura);
		}
	}
	
	/**
	 * Metodo para modificar el pais de un jugador localizado por su ID
	 * @param ID del jugador a buscar
	 * @param pais pais al que se quiere cambiar
	 */
	public void modifyPais(Integer ID, String pais) {
		if(this.jugadores.containsKey(ID)) {
			jugadores.get(ID).setPais(pais);
		}
	}
	
	/**
	 * Metodo para añadir un jugador a la coleccion
	 * @param j jugador que se añade
	 * @return true si se ha añadido y false si no se ha podido añadir
	 */
	public boolean AddJugador(Jugador j) {
		boolean add = false;
		if (!this.jugadores.containsKey(j.getId())) {
			this.jugadores.put(j.getId(), j);
			add=true;
		}
		return add;
	}
	
	/**
	 * Metodo para eliminar un jugador
	 * @param id que queremos eliminar
	 * @return Si se ha eliminado al jugador
	 */
	public boolean removeJugador(Integer id) {
		boolean removed=false;
		if(this.jugadores.containsKey(id)) {
			this.jugadores.remove(id);
			removed=true;
		}
		return removed; 
	}
	
	/**
	 * Metodo que devuelve todos los jugadores de la lista
	 * @return todos los jugadores de la lista
	 */
	public HashMap<Integer, Jugador> ShowPlayers() {
		return jugadores;
	}
	
	/**
	 * Metodo para mostrar la lista de clientes que se encuentra en el hashmap
	 */
	public void showPlayersList(HashMap <Integer, Jugador> j){
		for(Integer key:j.keySet()) {
			System.out.println("ID: " +key+ "Value: " +j.get(key));
		}
	}
	
	/**
	 * Metodo para obtener el jugador de la lista
	 * @param Integer id del jugador a obtener
	 * @return jugador encontrado
	 */
	public Jugador getJugador(Integer id) {
		return this.jugadores.get(id);
	}
	
	/**
	 * Metodo para guardar los datos en archivo XML
	 * @param url Ubicacion del archivo
	 */
	public void saveFile(String url) {
		JAXBContext contexto; 
		try {
			contexto = JAXBContext.newInstance(RepoJugador.class);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			m.marshal(_instance, new File(url));
		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo para cargar los datos de un archivo XML
	 * @param url Ubicacion del archivo
	 */
	public void loadFile(String url) {
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(RepoJugador.class);
		    Unmarshaller um = contexto.createUnmarshaller();
		     
		    RepoJugador newRepoClient = (RepoJugador) um.unmarshal( new File(url) );
		    jugadores=newRepoClient.jugadores;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	
}
