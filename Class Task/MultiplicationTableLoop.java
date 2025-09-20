/* 	prompt a user to enter a number
	save the number in a container number
	create another container that will house the multiplication of the number, equate it to zero, lets call it total
	create a counter that will increase over time but is zero for now
	start an iteration process that will stop once the counter is less than twelve
	the counter should start increasing here
	total should be equal to the number times the count
	print out number times count is eq
										*/
	
	

import java.util.Scanner;

public class MultiplicationTableLoop{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int total = 0;		
		int count = 0;

		while(count < 12){
			count++;
			total = number * count;
			//System.out.printf("%d * %d = %d%n ", number, count, total);
			System.out.println(number + " * " + count  + " = " + total);
		}


	}
}

