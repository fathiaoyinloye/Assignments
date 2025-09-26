/* 	prompt a user to input a number times to continue counting a number
	save as number
	create a container and name is sum, this means sum is zero
	create a container which helps you keep tracks of how many times you want to repeat a process, name it count
	our count should also be equals to one for now
	count should continue to repeat itself as long as it is not greater than the number that was inputed by the user
	count should increase at every repetition
	sum should also increase by whatever count is at every repetition
	
						*/


import java.util.Scanner;

public class SumOfSeries{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("Enter the number terms a number should be counted: ");
		long number = scanner.nextLong();

		System.out.println("Number\t\tSum of Numbers");

		for(int count = 1; count <= number; count++){
				sum = sum + count;
				
		System.out.println(count + "\t\t\t" + sum);

		}






	}
}
