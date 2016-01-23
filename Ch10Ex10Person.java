//Java Programming <Joyce Farrell> 7th ed.Chapter 10 Exercise 10
//created/modified by Rex Jepson <1/23/2016>

import javax.swing.JOptionPane;
public class Person {
	//define object fields
	private String firstName;
	private String lastName;
	private String address;
	private String zipCode;
	private String phoneNumber;
	
	//enter personal information
	public void enterPersonalInfo(){
	firstName 	= JOptionPane.showInputDialog(null,"Enter first name:");
	lastName 	= JOptionPane.showInputDialog(null,"Enter last name:");
	address 	= JOptionPane.showInputDialog(null,"Enter street address:");
	zipCode 	= JOptionPane.showInputDialog(null,"Enter zip code:");
	phoneNumber = JOptionPane.showInputDialog(null,"Enter phone number (xxx)xxx-xxxx:");
	}
	
	//displays personal information
	public void displayPersonalInfo(){
		System.out.println("\n\nPersonal information:");
		System.out.println("Name " + lastName + ", " + firstName +
						";\tAddress " + address + ";\tZIP " + zipCode + 
						";\tPhone " + phoneNumber);
	}
}
