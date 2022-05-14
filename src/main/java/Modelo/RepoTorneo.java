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

@XmlRootElement(name="RepoTorneo")
@XmlAccessorType(XmlAccessType.FIELD)
public class RepoTorneo {
	
	//patron singleton
	private static RepoTorneo _instance;
		
	private HashMap<Integer, Torneo> misTorneos;
		
	public RepoTorneo() {
		misTorneos = new HashMap<Integer, Torneo>();
	}
	
	/**
	 * Metodo para instanciar una lista una sola vez
	 * @return Lista instanciada
	 */
	public static RepoTorneo getInstance() {
		if (_instance==null) {
			_instance=new RepoTorneo();
		}
		return _instance;
	}
	
	/**
	 * Metodo para añadir un torneo a la coleccion
	 * @param et torneo que se añade
	 * @return true si se ha añadido y false si no se ha podido añadir
	 */
	public boolean AddTorneo(Torneo t) {
		boolean add = false;
		if (!this.misTorneos.containsKey(t.getIdentificador())) {
			this.misTorneos.put(t.getIdentificador(), t);
			add=true;
		}
		return add;
	}
	
	/**
	 * Metodo para eliminar un torneo
	 * @param Integer id que queremos eliminar
	 * @return Si se ha eliminado el torneo
	 */
	public boolean removeEquipo(Integer id) {
		boolean removed=false;
		if(this.misTorneos.containsKey(id)) {
			this.misTorneos.remove(id);
			removed=true;
		}
		return removed; 
	}
	
	/**
	 * Metodo que devuelve todos los torneos de la lista
	 * @return todos los torneos de la lista
	 */
	public HashMap<Integer, Torneo> ShowTorneos() {
		return misTorneos;
	}
	
	/**
	 * Metodo para mostrar la lista de torneos que se encuentra en el hashmap
	 */
	public void showTorneosList(HashMap <Integer, Torneo> t){
		for(Integer key:t.keySet()) {
			System.out.println("ID: " +key+ "Value: " +t.get(key));
		}
	}
	
	/**
	 * Metodo para obtener el torneo de la lista
	 * @param Integer id del torneo a obtener
	 * @return torneo encontrado
	 */
	public Torneo getTorneo(Integer id) {
		return this.misTorneos.get(id);
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
			contexto = JAXBContext.newInstance(RepoTorneo.class);
		    Unmarshaller um = contexto.createUnmarshaller();
		     
		    RepoTorneo newRepoClient = (RepoTorneo) um.unmarshal( new File(url) );
		    misTorneos=newRepoClient.misTorneos;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
