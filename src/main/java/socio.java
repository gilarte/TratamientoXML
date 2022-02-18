import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="socio")
@XmlAccessorType(XmlAccessType.FIELD)
public class socio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name="identificador")
	private int id;
	@XmlAttribute(name="Nombre")
	private String nameSocio;
	@XmlAttribute(name="Fecha")
	private String fechaAlta;
	
	//IMPORTANTE: el constructor por defecto es obligatorio para trabajar con XML
	public socio() {
		this.id=-1;
		this.nameSocio="";
		this.fechaAlta="";
		
	}

	public socio(int id, String nameSocio, String fechaAlta) {
		super();
		this.id = id;
		this.nameSocio = nameSocio;
		this.fechaAlta = fechaAlta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSocio() {
		return nameSocio;
	}

	public void setNameSocio(String nameSocio) {
		this.nameSocio = nameSocio;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "socio [id=" + id + ", nameSocio=" + nameSocio + ", fechaAlta=" + fechaAlta + "]";
	}
	
	
}
