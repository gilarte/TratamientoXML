
public class socio {

	private int id;
	private String nameSocio;
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
