import java.util.Scanner;

public class Swap4{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int first = scanner.nextInt();

	System.out.print("Enter second number: ");
	int second = scanner.nextInt();
	first = first + second;
	second = first - second;
	first = first - second;
	
	
	System.out.println("First number is: " +first);

	System.out.println("Second number is: " + second);

	}
}