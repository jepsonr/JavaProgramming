import javax.swing.*;
public class Alphabetize2 {

	public static void main(String[] args) {

		//declare variables
		String first;
		String second;
		String third;
		
		String one;
		String two;
		String three;

		String result;

		/*enter phrases to be compared and 
		 set the case of each */
		first 	= JOptionPane.showInputDialog(null, 
				"Enter 1st phrase: ");
		second 	= JOptionPane.showInputDialog(null, 
				"Enter 2nd phrase: ");
		third  	= JOptionPane.showInputDialog(null, 
				"Enter 3rd phrase: ");

		one = first.toUpperCase();
		two = second.toUpperCase();
		three = third.toUpperCase();
		
		/*get integer values between the 
		 zero indices of each phrase */
		int oneToTwo = two.compareTo(one);
		int oneToThree = three.compareTo(one);
		int twoToThree = three.compareTo(two);

		
		/*use integer values from above to order phases
		 and assign to the "results" variable */
		if(oneToTwo >= 0){
			if(oneToThree >= 0){
				if(twoToThree >= 0)
					result = first + " " + second + " " + third;
				else
					result = first + " " + third + " " + second;
			}//end if
			else
				result = third + " " + first + " " + second;
		}//end if
		else{
			if(twoToThree >= 0){
				
				if(oneToThree >= 0)
					result = second + " " + first + " " + third;
				else
					result = second + " " + third + " " + first;
			}//end if
			else
				result = third + " " + second + " " + first;
		}//end if
		
		System.out.println(result);
	}//end main

}
