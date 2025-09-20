/* 	Prompt user to enter a single digit from 0 - 9
	store the input in digit
	check if input is equal to 1
	print One, if not
	check if input is equal to 2
	print Two, if not
	check if input is equal to 3
	print three, if not
	check if input is equal to 4
	print four, if not
	check if input is equal to 5
	print five, if not
	check if input is equal to 6
	print Six, if not
	check if input is equal to 7
	print Seven, if not
	check if input is equal to 8
	print Eight, if not
	check if input is equal to 9
	print Nine, if not
	print invalid input, please input  digit from 0 - 9 */



import java.util.Scanner;

public class SingleDigit{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a digit from 0 - 9: ");
	int digit = scanner.nextInt();

	if(digit == 1){
	System.out.println("One");
	}

	else if(digit == 2){
	System.out.println("Two");
	}
	else if(digit == 3){
	System.out.println("Three");
	}
	else if(digit == 4){
	System.out.println("Four");
	}
	else if(digit == 5){
	System.out.println("Five");
	}
	else if(digit == 6){
	System.out.println("Six");
	}
	else if(digit == 7){
	System.out.println("Seven");
	}
	else if(digit == 8){
	System.out.println("Eight");
	}
	else if(digit == 9){
	System.out.println("Nine");
	}

	else {
	System.out.println("Invalid input, please input digit from 0 - 9 ");
	}


	}
}