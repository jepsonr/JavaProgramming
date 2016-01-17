/*Java Programming <Joyce Ferrall> 7th ed pg 448
this non-static class is used for the 
BubbleSortAnArray class*/

public class Employee {
	private int empNum;
	private String firstName;
	private String lastName;
	private double salary;
	
	public int getEmpNum(){
		return empNum;
	}
	public void setEmpNum(int n){
		empNum = n;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String fn){
		firstName = fn;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String ln){
		lastName = ln;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double s){
		salary = s;
	}
}
