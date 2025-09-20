/* 	prompt user to enter a number
	save as number
	create a new variable total which is equal to zero
	prompt user to input another number save as number2
	total should be adding the sum of the input
	the user should continue entering this number till total is greater than number		*/
	
import java.util.Scanner;

public class SpecifiedSum{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int total = 0;
		while(total < number){
		System.out.print("Enter a number lesser than the first: ");
			int number2 = scanner.nextInt();
			total = total + number2;
		}
		System.out.print("Initial number is: " + number + " sum of subsequent numbers is: " + total);
				



			

	}

}