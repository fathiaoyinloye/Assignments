/* 	prompt user to enter a non negative number
	save the number in a variable number
	create another variable call it total and assign 1 to it
	for another variable count which is equal to number
	count should countinue as long as it is greater than zero and count should keep decreasing
	total should now be total times count
	print total
									*/
import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a non negative number: ");
		int number = scanner.nextInt();
		int total = 1;

		for(int count = number;  count > 0; count--){
		total = total * count;

		}
		System.out.printf("The factorial of %d is %d%n", number, total);


	}
}