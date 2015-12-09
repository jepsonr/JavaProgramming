import java.util.Scanner;
public class TwelveDays 
{
	public static void main(String[] args) 
	{
		//declare variable and scanner object
		int verse;
		Scanner input = new Scanner(System.in);

		//solicit a verse number from user
		System.out.println("With which verse, do you want to start singing "
							+ "The 12 days of Christmas (select a day from 1 - 12):");
		verse = input.nextInt();
		if(verse < 1)
			System.out.println("That's not a verse, silly!");
		else if(verse > 12)
			System.out.println("Now you're just being greedy...");
		else
		{
			System.out.println("On the " + verse + " day of Christmas, "
					+ "my true love sent to me: ");
			if(verse == 1)
				System.out.println("A Partridge in a Pear Tree.");
			else
					switch(verse)
				{
					case 12:
						System.out.println("12 Drummers Drumming");
					case 11:
						System.out.println("11 Pipers Piping");	
					case 10:
						System.out.println("10 Lords a Leaping");	
					case 9:
						System.out.println("9 Ladies Dancing");
					case 8:
						System.out.println("8 Maids a Milking");
					case 7:
						System.out.println("7 Swans a Swimming");
					case 6:
						System.out.println("6 Geese a Laying");
					case 5:
						System.out.println("5 Golden Rings");
					case 4:
						System.out.println("4 Calling Birds");
					case 3:
						System.out.println("3 French Hens");
					case 2:
						System.out.println("2 Turtle Doves");
					default:
						System.out.println("and a Partridge in a Pear Tree.");
				}
		}
		input.close();
	}

}
