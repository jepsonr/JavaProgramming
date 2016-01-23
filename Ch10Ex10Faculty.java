//Java Programming <Joyce Farrell> 7th ed.Chapter 10 Exercise 10
//created/modified by Rex Jepson <1/23/2016>

import javax.swing.JOptionPane;
public class Faculty extends CollegeEmployee{
	//define faculty fields
	private int tenure;
	private boolean tenured = false;
	
	//defines a CollegeEmployee object
	CollegeEmployee faculty = new CollegeEmployee();
		
	//enter faculty specific information
	public void enterFacultyInfo(){
		faculty.enterEmployeeInfo();//calls calls CollegeEmployee Class 
								    //which in turn calls Person Class 
								    //to enter employee and personal information
		tenure = JOptionPane.showConfirmDialog(null,
			    "Tenured faculty?",
			    "Faculty status",
			    JOptionPane.YES_NO_OPTION);
		if(tenure == 0)
			tenured = true;
	}
	//displays faculty specific information
	public void displayFacultyInfo(){
		faculty.displayEmployeeInfo();//calls calls CollegeEmployee Class 
									  //which in turn calls Person Class 
									  //to display employee and personal information
		System.out.println("Faculty member status:");
		if(tenured)
			System.out.println("Tenured");
		else
			System.out.println("Non-tenured");
	}
}
