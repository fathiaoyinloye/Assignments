/* 	prompt a user to enter a number between 0 - 10
	save it as binary
	declare a new variable to be decimal and assign 0 to it
	declare your count and assign 1 to it
	declare your digit and assign 0 to it
	
	while inputed number (binary) is greater  than zero
	digit should be equal to the reminder of binary divided by 10
	digit should multiply count and be added to decimal then reassign to decimal
	binary should then become binary divided by 0
	count should also be multiplied by 2
	print  the decimal
	
								*/
	

import java.util.Scanner;

public class Binary{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number that must be 0 and 1: ");
		int binary = scanner.nextInt();
		int decimal = 0;
		int count = 1;
		int digit = 0;

		while(binary > 0 ){	
			digit = binary % 10;
			decimal = decimal +  (digit * count);
			binary = binary/10;
			count = count * 2;
		}
			System.out.println("The binary number " + binary + " equivalent in decimal is " + decimal);



	}
}
