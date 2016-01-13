import java.util.*;
public class DivideStrings {

	public static void main(String[] args) {
		
		//declare variables and arrays and Scanner object
		final int MAX_NUM_STRINGS = 20;
		int index = 0;
		int shortIndex = 0;
		int longIndex = 0;
		String[] entries = new String[20];
		String[] shortEntries = new String[20];
		String[] longEntries = new String[20];
		String entry = "";
		String report;
		final String exit = "E";
		Scanner input = new Scanner(System.in);
		
		//primer for the while string entry loop
		System.out.println("Enter a string (E to exit)");
		entry = input.nextLine();
		entries[index] = entry;
		
		/*collects string entries and ends with max number for the array
		or ends input when an "E" is entered*/
		while(index < MAX_NUM_STRINGS && !entry.equals(exit)){
			if(!entry.equals("E")){
				index++;
				System.out.println("Enter another string (E to exit)");
				entry = input.nextLine();
				entries[index] = entry;

			}//end if
		}//end while
		
		//sorts string entries into arrays of short and long strings
		for(int x = 0; x < index; x++){
			entry = entries[x];
			if(entry.length() < 6){
				shortEntries[shortIndex] = entry;
				shortIndex++;
			}//end if

			else{
				longEntries[longIndex] = entry;
				longIndex++;
			}//end else
		}//end for
		
		//prompt user to select a list or exit the program
		System.out.println("Enter \"A\" to see the list of all strings");
		System.out.println("Enter \"L\" to see the list of long strings");
		System.out.println("Enter \"S\" to see the list of short strings");
		System.out.println("Enter any other key to exit");
		report = input.nextLine();

		
		//use input from the report entry to print the appropiate list of strings
		if(report.equals("A") || report.equals("a")){	
			if(index != 0){
				for(int y = 0; y < index; y++){
				System.out.print(entries[y] + " ");
				}//end for
			}//end if
			else
				System.out.print("There are no strings.");
		}//end if
		if(report.equals("L") || report.equals("l")){
			if(longIndex != 0){
				for(int y = 0; y < longIndex; y++){
					System.out.print(longEntries[y] + " ");
				}//end for
			}//end if
			else
				System.out.print("There are no long strings.");
		}//end if
		if(report.equals("S") || report.equals("s")){
			if(shortIndex != 0){
				for(int y = 0; y < shortIndex; y++){
					System.out.print(shortEntries[y] + " ");
				}//end for
			}//end if
			else
				System.out.print("There are no short strings.");
		}//end if
		input.close();
	}//end main
}//end class
