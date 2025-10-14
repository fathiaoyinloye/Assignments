import java.util.Scanner;
public class DUplicateElimination{
	public static void main (String... args){

		Scanner inputed = new Scanner(System.in);

		int[] numbers = new int[10];
 
		for (int index = 0; index < numbers.length; index++){
			System.out.print("Enter a number from 10 - 100: ");
			int number = inputed.nextInt();
			if (number < 10 || number > 100){						
				System.out.println("Invalid input");
				index = index - 1;
			}
			numbers[index] = number;


		}


		for (int index = 0; index < numbers.length; index++){
			System.out.print(numbers[index] + "  " );
			
		}






	}
}