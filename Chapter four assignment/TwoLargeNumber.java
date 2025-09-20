/* 	prompt user to enter a number
	save as number
	create a variable Largest assign 0 to it
	create another variable largest2 assign 0 to it
	create a variable count and count should continue until it as iterate 10 times
	user should also number while it iterate which will be ten times to
	save it as number too
	assume the second number inputed is largest2
	if one of the number inputed is greater than largestit becomes the largest and, 
	if another number inputed is greater than largest and largest2, it becomes second largest
	print largest 
	print the second largest too.

								*/

import java.util.Scanner;

public class TwoLargeNumber{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int largest = 0;
		int largest2 = 0;
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number: ");
			number = scanner.nextInt();
			if(count == 0){
				largest2 = number;
			}

			if (number > largest){
				largest = number;
			}
			else if(number > largest && number > largest2){
				largest2 = number; 
			}
		}
		System.out.println("The largest number is: " + largest);
		System.out.println("The second largest number is: " + largest2);

	}
}