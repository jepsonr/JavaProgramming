
public abstract class Alien {
	protected String group;
	protected String color;
	protected String breather;
	private String class;
	protected int classification;
	
	public Alien(String g, String c, String b){
		group = g;
		color = c;
		breather = b;
		class = Integer.toString(classification);
	}
	public void Description(){
		System.out.println("A " + group + " is a " + color + ", " + breather 
							+ " breather with a human classification to " 
							+ class + " decimal places.");
	}
}
