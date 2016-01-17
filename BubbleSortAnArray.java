/*Java Programming <Joyce Ferrall> 7th ed ch8 this extends author's 
created/modified by <Rex Jepson> 1/16/2016*/

import java.util.*;
public class bubbleSort {

	public static void main(String[] args) {
		Employee[] someEmp = new Employee[4];
		int len = someEmp.length;
		Scanner input = new Scanner(System.in);
		
		//collects employee info for each instance of the Employee class
		for(int n = 0; n < len; n++){ 
			someEmp[n] = new Employee();
			System.out.println("Enter employee " + (n+1) + 
											"'s number: ");
			int num = input.nextInt();
			someEmp[n].setEmpNum(num);
			input.nextLine();
			
			System.out.println("Enter employee " + (n+1) + 
											"'s first name: ");
			String first = input.nextLine();
			someEmp[n].setFirstName(first);
			System.out.println();
			
			System.out.println("Enter employee " + (n+1) + 
											"'s last name: ");
			String last = input.nextLine();
			someEmp[n].setLastName(last);
			System.out.println();
			
			System.out.println("Enter employee " + (n+1) + 
											"'s salary: ");
			double sal = input.nextDouble();
			someEmp[n].setSalary(sal);
			input.nextLine();
		
		}//end for
		
		//calls the sort method based on salary
		sort(someEmp);
		
		//prints a table of Employees
		System.out.println("Employee information:");
		System.out.println("Number \t First \t Last \t Salary");
		for(int n = 0; n < len; n++){
			int num = someEmp[n].getEmpNum();
			String first = someEmp[n].getFirstName();
			String last = someEmp[n].getLastName();
			double sal = someEmp[n].getSalary();
			System.out.print(num + "\t" + first + "\t" + last + "\t");
			System.out.printf("$%.2f", sal);
			System.out.println();
		}//end for	
	}//end main
	public static void sort(Employee[] array){
		int x, y;
		Employee temp;
		int high = array.length -1;
		for(x = 0; x < high; ++x){
			for(y = 0; y < high; ++y){
				if(array[y].getSalary() > array[y+1].getSalary()){
					temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp;
				}//end if
			}//end 'y' for
		}//end 'x' for
	}//end sort
}//end class
