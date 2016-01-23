

import javax.swing.JOptionPane;
public class CollegeEmployee extends Person{
	
	//define object fields
	private String ssn;
	private String salary;
	private String[] departments = {"CHEM", "EECS", "MATH", "PSYC", 
									"PHYS", "SOCI", "ARTS"};
	private String department;
	
	//defines a Person object
	Person employee = new Person();
	
	//enter employee specific information
	public void enterEmployeeInfo(){
		employee.enterPersonalInfo();//calls Person Class to 
									 //enter personal information
		ssn = JOptionPane.showInputDialog(null,"Enter employee's SSN: ");
		salary = JOptionPane.showInputDialog(null,
						"Enter employee's annual salary: ");
	    department = (String) JOptionPane.showInputDialog(null, "Select department:",
						"List of departments", JOptionPane.QUESTION_MESSAGE, null, 
						departments, departments[0]);
	}
	
	//displays employee specific information
	public void displayEmployeeInfo(){
		employee.displayPersonalInfo();//calls Person Class to display personal information
		System.out.println("Employee information:");
		System.out.println("SSN " + ssn  + ";\tSalary $" + salary  +  ";\tDepartment "+  department);
	}
}
