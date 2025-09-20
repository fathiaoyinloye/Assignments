/*	prompt a user to enter total miles driven
	save as miles
	prompt a user to enter total gallons of gas used 
	save as gallon
	miles should be divided by gallon and saved in another variable called milesPerGallon 
	print milesPerGallon
	all this should run continously if the user  does not input -1

												*/

import java.util.Scanner;

public class MilesPerGallon{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
	
		int count = 0;
		while(count != -1){

			
			System.out.print("Enter Total miles driven: ");
			int miles = scanner.nextInt();

			System.out.print("Enter Total gallons of gas used: ");
			int gallon = scanner.nextInt();

			float miles_per_gallon =  miles/gallon;
	
			System.out.printf("Miles per gallon is %.2f%n", miles_per_gallon);
			System.out.print("Enter -1 to exit or any number to continue");
			count = scanner.nextInt();
		}

	}
}