import java.util.Scanner;

public class PositiveNegativeZero{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int positive = 0;
		int negative = 0;
		int zero = 0;
		while(count != -1){
	
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			if(number > 0){
				positive = positive + 1;
			}
			else if(number < 0){
				negative = negative + 1;
			}
			else
				zero = zero + 1;
		
		
		System.out.print("Enter any number to continue or -1 to stop: ");
		count = scanner.nextInt();

		}
		
		System.out.println("The number of Positive number is " + positive);
		System.out.println("The number of Negative number is " + negative);
		System.out.println("The number of Zero is " + zero);


	}
}
	