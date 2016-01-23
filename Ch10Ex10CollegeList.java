//Java Programming <Joyce Farrell> 7th ed.Chapter 10 Exercise 10
//created/modified by Rex Jepson <1/23/2016>

import javax.swing.JOptionPane;

public class CollegeList {

	public static void main(String[] args) {
		// define variables
		String[] personnel = {"C", "F", "S", "Q"};
		String person;
		int e = 0;
		int f = 0;
		int s = 0;
		final int FAC_MAX = 3;
		final int STU_MAX = 7;
		final int EMP_MAX = 4;
		
		//define arrays to hold personnel objects
		Faculty[] faculty = new Faculty[FAC_MAX];
		Student[] student = new Student[STU_MAX];
		CollegeEmployee[] employee = new CollegeEmployee[EMP_MAX];
		
		//primer for the while statement designating personnel category
		person = (String) JOptionPane.showInputDialog(null, 
				"Select C-college employee, F-faculty, S-student:, or Q-quit",
				"Personnel Categories", JOptionPane.QUESTION_MESSAGE, null, 
				personnel, personnel[0]);
		
		//instantiate personnel objects
		while(person != "Q"){
			if(person == "C" && e < EMP_MAX){
				employee[e] = new CollegeEmployee();
				employee[e].enterEmployeeInfo();
				e++;
			}
			else if(person == "F" && f < FAC_MAX){
				faculty[f] = new Faculty();	
				faculty[f].enterFacultyInfo();
				f++;
			}
			else if(person == "S" && s < STU_MAX){
				student[s] = new Student();
				student[s].enterStudentInfo();
				s++;
			}
			else{
				System.out.println("Error: "//default for exceeding limits set in lines 12-14
						+ "Exceeded the max number of personnel in category: " + person);
			}
			person = (String) JOptionPane.showInputDialog(null, 
					"Select C-college employee, F-faculty, S-student:, or Q-quit",
					"Personnel Catagories", JOptionPane.QUESTION_MESSAGE, null, 
					personnel, personnel[0]);		
		}
		//Checks for records by category and 
		//calls an array of personal record information
		if(e == 0)
			System.out.println("\nThere are no employee records.");
		else{
			for(int x = 0; x < e; x++){
				employee[x].displayEmployeeInfo();
			}//end for
		}//end else
		if(f == 0)
			System.out.println("\nThere are no faculty records.");
		else{
			for(int y = 0; y < f; y++){
				faculty[y].displayFacultyInfo();
			}//end for
		}//end else
		if(s == 0)
			System.out.println("\nThere are no student records.");
		else{
			for(int z = 0; z < s; z++){
				student[z].displayStudentInfo();
			}//end for
		}//end else
	}//end main
}
