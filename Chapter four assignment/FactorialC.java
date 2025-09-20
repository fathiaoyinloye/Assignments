/*	prompt user to enter number of terms
	save as terms
	I assume than my x is 5 which will be saved in a variable number
	create a variable ex which will be equal to 1
	for count which is one
	count should iterate as far as it is less than terms
	count should increase by one
	create a new variable factorial which is equal to one
	another variable counter should beequal tocount 
	it should continue iterating as far as it is greater or equals to one
	count should decrease by one
	multiplty counter by factorial which will be reassign to factorial
	eX shuld be equal to x raise to power count which will divide factorial
	print ex
										*/


import java.util.Scanner;

public class FactorialC{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of terms: ");
		int terms = scanner.nextInt();
		double eX = 1;
		for(int count = 1; count < terms; count++){
			int factorial = 1;
			for(int counter = count; counter >= 1; counter--){
				factorial *= counter;
			}
			eX = eX + Math.pow(5, count) /factorial;
		}
 		System.out.println(eX);

	}



}