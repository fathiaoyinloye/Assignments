import java.util.Scanner;

public class Sum{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int sum = 0;

		for(int count = 0; count < 10; count++){
		System.out.print("Enter a number: " );
		int number = scanner.nextInt();
		sum += number;
		
		}

 			System.out.println("Sum of all the numbers is: " + sum);

		
	}


}
