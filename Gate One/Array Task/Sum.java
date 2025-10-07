import java.util.Scanner;

public class Printrepetition{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int[] numberArray  = new int[5];

	int odd = 0;
	int even = 0;

		for(int count = 0; count < numberArray.length; count++){
		System.out.print("Enter a number: " );
		int number = scanner.nextInt();
		if(number )
		even += number;
		else
		odd += number;
		sumOddEven[count] = number;



		}


		for (int count = 0; count < numberArray.length; count++) {
			System.out.println(sumOddEven[count]);
		}

			System.out.println("Sum of even number is: " + even);
			System.out.println("Sum of odd number is: " + odd);

		
	}


}
