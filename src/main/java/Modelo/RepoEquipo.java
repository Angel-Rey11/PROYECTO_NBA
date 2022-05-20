package Modelo;

import java.io.File;
import java.util.HashMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RepoEquipo")
@XmlAccessorType(XmlAccessType.FIELD)
public class RepoEquipo {
	
	//patron singleton
	private static RepoEquipo _instance;
	
	private HashMap<String, Equipo> misEquipos;
	
	public RepoEquipo() {
		misEquipos = new HashMap<String, Equipo>();
	}
	
	/**
	 * Metodo para instanciar una lista una sola vez
	 * @return Lista instanciada
	 */
	public static RepoEquipo getInstance() {
		if (_instance==null) {
			_instance=new RepoEquipo();
		}
		return _instance;
	}
	
	/**
	 * Metodo para modificar el color de un equipo localizado por su nombre
	 * @param name del equipo a buscar
	 * @param color color al que se quiere cambiar
	 */
	public void modifyColor(String name, String color) {
		if(this.misEquipos.containsKey(name)) {
			misEquipos.get(name).setColor(color);
		}
	}
	
	/**
	 * Metodo para modificar el NJugadores de un equipo localizado por su nombre
	 * @param name del equipo a buscar
	 * @param nj numero de jugadores al que se quiere cambiar
	 */
	public void modifyNPlayers(String name, Integer nj) {
		if(this.misEquipos.containsKey(name)) {
			misEquipos.get(name).setnJugadores(nj);
		}
	}
	
	/**
	 * Metodo para añadir un equipo a la coleccion
	 * @param e equipo que se añade
	 * @return true si se ha añadido y false si no se ha podido añadir
	 */
	public boolean AddEquipo(Equipo e) {
		boolean add = false;
		if (!this.misEquipos.containsKey(e.getNombre())) {
			this.misEquipos.put(e.getNombre(), e);
			add=true;
		}
		return add;
	}
	
	/**
	 * Metodo para eliminar un equipo
	 * @param String nombre que queremos eliminar
	 * @return Si se ha eliminado al equipo
	 */
	public boolean removeEquipo(String nombre) {
		boolean removed=false;
		if(this.misEquipos.containsKey(nombre)) {
			this.misEquipos.remove(nombre);
			removed=true;
		}
		return removed; 
	}
	
	/**
	 * Metodo que devuelve todos los equipos de la lista
	 * @return todos los equipos de la lista
	 */
	public HashMap<String, Equipo> ShowTeams() {
		return misEquipos;
	}
	
	/**
	 * Metodo para mostrar la lista de equipos que se encuentra en el hashmap
	 */
	public void showTeamsList(HashMap <String, Equipo> e){
		for(String key:e.keySet()) {
			System.out.println("ID: " +key+ "Value: " +e.get(key));
		}
	}
	
	/**
	 * Metodo para obtener el equipo de la lista
	 * @param String nombre del equipo a obtener
	 * @return equipo encontrado
	 */
	public Equipo getEquipo(String nombre) {
		return this.misEquipos.get(nombre);
	}
	
	/**
	 * Metodo para guardar los datos en archivo XML
	 * @param url Ubicacion del archivo
	 */
	public void saveFile(String url) {
		JAXBContext contexto; 
		try {
			contexto = JAXBContext.newInstance(RepoEquipo.class);
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
			contexto = JAXBContext.newInstance(RepoEquipo.class);
		    Unmarshaller um = contexto.createUnmarshaller();
		     
		    RepoEquipo newRepoClient = (RepoEquipo) um.unmarshal( new File(url) );
		    misEquipos=newRepoClient.misEquipos;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
		
}
