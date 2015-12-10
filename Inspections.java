import java.util.Scanner;
public class Inspections {

	public static void main(String[] args) {
		//declare variables and object
		int factory;
		double factory1 = 0.0;
		double factory2 = 0.0;
		double factory3 = 0.0;
		double factory4 = 0.0;
		Scanner input = new Scanner(System.in);
		
		//get user to initiate schedule
		System.out.println("Factory inspection schedule:");
		System.out.println("Press any key to construct: ");
		String key = input.nextLine();
		System.out.println("Week\tFactory");
		
		//assign a random factory to each week of the year
		for(int week = 1; week < 53; week++){
			factory = 1 + (int) (Math.random() * 4);
			System.out.println(week +"\t   " + factory);
			if		(factory == 1)
				factory1 += 1;
			else if	(factory == 2)
				factory2 += 1;
			else if	(factory == 3)
				factory3 += 1;
			else 
				factory4 += 1;
		}//end for loop
		System.out.println();
		
		//format output into percents 
		factory1 = 100*factory1/52;
		factory2 = 100*factory2/52;
		factory3 = 100*factory3/52;
		factory4 = 100*factory4/52;

		//format and display output to the nearest hundredth
		System.out.println();
		System.out.println("Percent of the visits by site:");
		System.out.println("Factory 1\tFactory 2\tFactory 3\tFactory 4");
		System.out.print(" ");
		System.out.printf("%.2f", factory1);
		System.out.print("%\t\t ");
		System.out.printf("%.2f", factory2);
		System.out.print("%\t\t ");
		System.out.printf("%.2f", factory3);
		System.out.print("%\t\t ");
		System.out.printf("%.2f", factory4);
		System.out.print("%");
		input.close();
	}
}
