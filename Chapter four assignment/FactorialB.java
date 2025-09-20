/*	prompt user to enter number of terms
	save as terms
	create a variable e which will be equal to 1
	for count which is one
	count should iterate as far as it is less than terms
	count should increase by one
	create a new variable factorial which is equal to one
	another variable counter should beequal tocount 
	it should continue iterating as far as it is greater or equals to one
	count should decrease by one
	multiplty counter by factorial which will be reassign to factorial
	e shuld be equal to e plus one divided by the factorial
										*/


import java.util.Scanner;

public class FactorialB{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of terms: " );
		int terms = scanner.nextInt();
		float e = 1;

		for(int count = 1; count < terms; count++){
			int factorial = 1;
			for(int counter = count; counter >= 1; counter--){
				factorial = factorial * counter;

			}

			e = (e + 1) / factorial;
		}
		
			System.out.println(e);

	}
}