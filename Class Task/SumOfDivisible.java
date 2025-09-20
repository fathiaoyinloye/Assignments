/* 	prompt user to enter a number
	save as number
	create a  variable call it divisible, two is the lowest possible number that can divide any number, therefore equate divisible to 10
	check if two can divide the number, if not add 1 to the divisible until it can divide the number.
	create another variable sum where all the divisible will be adding up
	print sum
					*/




import java.util.Scanner;

public class SumOfDivisible{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int divisible = 2;
		int sum = 0;
		while(number != 0 && number != 1){

			if(number % divisible == 0 ) {
			sum = sum + divisible;
			number = number/ divisible;
			}
			else if (number % divisible != 0){
			divisible = divisible + 1;

			}
		
		}
		System.out.println(sum);

	}
}