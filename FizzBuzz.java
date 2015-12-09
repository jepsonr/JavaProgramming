
public class Fizzbuzz {

	public static void main(String[] args) {

		for(int num = 100; num > 0; num -= 1){

			if(num%15 == 0)
				System.out.println("FizzBuzz");
			else if(num%5 == 0)
				System.out.println("Fizz");
			else if(num%3 == 0)
				System.out.println("Buzz");
			else
				System.out.println(num);
		}
	}

}
