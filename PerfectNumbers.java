import java.util.Scanner;
public class Perfect {  
	//returns a set of perfect numbers
	public static void main(String[] args) {
		//define variables and object
		long limit;
		double exponent;
		Scanner input = new Scanner(System.in);
		
		/*enter a number (less than 19 digits long) 
		 * but greater than the largest desired perfect number*/
		System.out.println("Enter upper limit for perfect "
							+ "numbers (up to eighteen digits): ");
		limit = input.nextLong();
		
		//calculation of Euclid-Euler theorem Mersenne primes
		exponent = (Math.log(.5+Math.sqrt(2*limit+.25)) 
								/ Math.log(2));
		/*cycle through the set of factors to find the set of primes
		 associated with the user's chosen limit*/
		for(int prime = 2; prime <= exponent; prime++){
			
			/*call isMersenne to check if the counter 
			is a Mersenne prime*/
			if(isMersenne(prime)){
				
				//calculates and prints the associated perfect number
				isPerfect(prime);  
			}//end if
		}//end for
		input.close();
	}//end main
	public static boolean isMersenne(int p){
		for(int i=2; i<p; i++){
			double mers = Math.pow(2, p) - 1;
			if(mers%i == 0)
				return false;
		}//end for
		return true;
	}//end function

	public static void isPerfect(int p){
		double perf = Math.pow(2, (p-1)) * (Math.pow(2, p) - 1);
		long perfect = (long) Math.floor(perf);
		System.out.println(perfect);
	}//end function

}

