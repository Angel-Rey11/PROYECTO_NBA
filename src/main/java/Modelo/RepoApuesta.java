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

@XmlRootElement(name="RepoApuesta")
@XmlAccessorType(XmlAccessType.FIELD)
public class RepoApuesta {
	
	//patron singleton
		private static RepoApuesta _instance;
		
	private HashMap<Integer, Apuesta> misApuestas;
	
	public RepoApuesta() {
		misApuestas = new HashMap<Integer, Apuesta>();
	}
	
	/**
	 * Metodo para instanciar una lista una sola vez
	 * @return Lista instanciada
	 */
	public static RepoApuesta getInstance() {
		if (_instance==null) {
			_instance=new RepoApuesta();
		}
		return _instance;
	}
	
	/**
	 * Metodo para guardar los datos en archivo XML
	 * @param url Ubicacion del archivo
	 */
	public void saveFile(String url) {
		JAXBContext contexto; 
		try {
			contexto = JAXBContext.newInstance(RepoApuesta.class);
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
			contexto = JAXBContext.newInstance(RepoApuesta.class);
		    Unmarshaller um = contexto.createUnmarshaller();
		     
		    RepoApuesta newRepoClient = (RepoApuesta) um.unmarshal( new File(url) );
		    misApuestas=newRepoClient.misApuestas;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
