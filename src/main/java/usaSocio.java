import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class usaSocio {

	public static void main(String[] args) {
		JAXBContext contexto;
		socio s=new socio(26,"Pepito Grillo","22/2/22");

		try {
			contexto=JAXBContext.newInstance(socio.class);
			Marshaller m=contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			try {
				m.marshal(s, new FileWriter("socio.xml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
