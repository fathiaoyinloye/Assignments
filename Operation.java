import java.util.Scanner;

public class Operation{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.print("Enter the type of operation either + / - or * : ");
		char symbol = scanner.next().charAt(0);

		System.out.print("Enter second number: ");
		int number2 = scanner.nextInt();
		
		int division = number / number2;
		int plus = number + number2;
		int multiplication = number * number2;
		int subtraction = number - number2;
	
		if (symbol == '/'){
		System.out.print("The division of the numbers is: " + division);
		}
		else if (symbol == '+'){
		System.out.print("The addition of the numbers is: " + plus);
		}
		else if (symbol == '*'){
		System.out.print("The multiplication of the numbers is: " + multiplication);
		}
		else if (symbol == '-'){
		System.out.print("The subtraction of the numbers is: " + subtraction);
		}
		else{
		System.out.print("Incorrect input, Please input the correct operation");
		}
	}
}