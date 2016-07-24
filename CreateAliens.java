// instantiates child classes Jovian.java and Martian.java 
// the parent class is Aliens.java 


public class CreateAliens {
	
	//passes the classification to humanoid to each child of Alien
	public static void main(String[] args) {
		
		Martian mars = new Martian(6);
		Jovian jupiter = new Jovian(4);
		
		//calls the display fuction from each subclass to Alien class
		mars.Description();
		jupiter.Description();
	}
}
