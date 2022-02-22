
public class ejecutable {

	public static void main(String[] args) {
		club c= club.getInstance();
		
		c.addSocio(new socio(1,"Ana","21/02/2021"));
		c.addSocio(new socio(24,"Antonio","1/12/2021"));
		c.addSocio(new socio(85,"Pedro","3/02/2022"));


		c.saveFile("club.xml");

	}
}
