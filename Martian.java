
public class Martian extends Alien{
    
    //passes martian characterization to the Alien class
	public Martian(int classified){
		super("Martian", "red", "carbon dioxyde");
		
		//set Alien classification directly from the CreateAlien class
		classification = classified;
	}
}
