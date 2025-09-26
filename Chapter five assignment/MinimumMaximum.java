/* 	prompt a user to enter the number terms they want to input a number
	collect it and save it in a box called terms
	create a container called largest and it should be empty
	create a container called smallest and it should be empty
	create a container that keeps track of how many times you repeat an action and name it  count and this should be equal to zero
	count should continue repeating an action as long as it is less than the number that was inputed
	count should increase by one at every repetiton
	the following process should be repeated if count is less than inputed number
	prompt user to input another number
	save it to a container number
	its assumed that the first number inputed is equal to largest and also smallest
	if there is any number that is greater than the number, it should take the place of the largest
		if there is any number that is smaller than the number, it should take the place of the smallest
Print largest and smallest



									*/
						
import java.util.Scanner;

public class MinimumMaximum{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter the number of time you want to input numbers: ");
		int terms = scanner.nextInt();

		int smallest = 0;
		int largest = 0; 

		for(int count = 0; count < terms; count++){
		
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
				if (count == 0){
					largest = number;
					smallest = number;
				}
				if(number > largest){
					largest = number;
				}
				if(number < smallest){
					smallest = number;
				}


		}
			System.out.println("The largest of all the inputed number is " +largest);
			System.out.println("The smallest of all the inputed number is " +smallest);





	}
}