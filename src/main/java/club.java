import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="club")
@XmlAccessorType(XmlAccessType.FIELD)
public class club {

	private ArrayList <socio> socios;
	private static club instance;
	
	private club() {
		socios=new ArrayList<socio>();
	}
	
	public static club getInstance() {
		if(instance==null) {
			instance=new club();
		}
		return instance;
	}
	
	public void addSocio(socio s) {
		socios.add(s);
	}

	@Override
	public String toString() {
		return "club [socios=" + socios + "]";
	}
	
	public void saveFile (String url) {
		JAXBContext contexto;
		
		try {
			contexto=JAXBContext.newInstance(club.class);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			m.marshal(instance, new File (url));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadFile(String url) {
		JAXBContext contexto;

		try {
			contexto=JAXBContext.newInstance(club.class);
			Unmarshaller um=contexto.createUnmarshaller();
			
			club newClub= (club) um.unmarshal(new File(url));
			socios = newClub.socios;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
