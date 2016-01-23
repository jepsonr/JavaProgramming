//Java Programming <Joyce Farrell> 7th ed.Chapter 10 Exercise 10
//created/modified by Rex Jepson <1/23/2016>

import javax.swing.JOptionPane;
public class Student extends Person{
	//defines Student fields
	private String[] majors = {"CHEM", "EECS", "MATH", "PSYC", "PHYS", "SOCI", "ARTS"};
	private String major;
	private double gpa;
	
	//defines a Person object
	Person student = new Person();
	
	//enter student specific information
	public void enterStudentInfo(){
		student.enterPersonalInfo();//calls Person Class to 
		 							//enter personal information
		major = (String) JOptionPane.showInputDialog(null, "Select major:",
				"List of Majors", JOptionPane.QUESTION_MESSAGE, null, 
				majors, majors[0]);
		gpa = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter student's GPA: "));

	}
	//displays student specific information
	public void displayStudentInfo(){
		student.displayPersonalInfo();//calls Person Class to
									  //display personal information
		System.out.println("Student information:");
		System.out.print("Major " + major + ";\t");
		System.out.print("GPA ");
		if(gpa < 0 || gpa > 4)//checks input for valid gpa
			System.out.println("Invalid");
		else
			System.out.printf("%4.2f", gpa);
	}
}
