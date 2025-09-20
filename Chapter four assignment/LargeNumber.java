/*	create a variable number
	create a variable largest
	for a variable count which is equal to zero
	count should run as far as it is less than 10
	count should keep increasing by one
	prompt the user to enter a number
	save it to the variable number
	if number is greater than largest
	reassign number to largest
	print largest
									*/

import java.util.Scanner;

public class LargeNumber{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int largest = 0;
		
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number: ");
			number = scanner.nextInt();

			if (number > largest){
				largest = number;
			}
			
			
		}
		System.out.println("The largest number is: " + largest);

	}
}