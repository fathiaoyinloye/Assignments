/*	prompt user to enter a number
	collect and save in a container called number
	create an empty container called sum 
	create another container that keeps track of how many times you repeat an action
	name it count
	count should countinue adding by one at every iteration process until it is less than or equal to the number inputed 
	if the number divided by count does not have a remainder
	add count up to sum
	create a container prime and it should be equal to number added to one
	if sum is the same as prime; print number is a prime number
	if sum is not the same as prime; print number is not a prime number


				*/

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0) {
			sum = sum + count;
				
			}
 		}

		int prime = number + 1;		
		if(prime == sum){
			System.out.println(number + " is a prime number");
		}
		else{
			System.out.println(number + " is not a prime number");
		}


	}


}
