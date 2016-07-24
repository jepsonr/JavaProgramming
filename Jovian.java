// parent class Alien.java 
// called from CreateAliens.java application


public class Jovian extends Alien{

	public Jovian(int classified) {
		
		//passes Jovian characteristics to the Alien Class
		super("Jovian","purple", "methane");
		
		//sets the Alien variable passed by the CreateAlien app
		classification = classified;
	}
}
