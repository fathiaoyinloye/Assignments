import java.util.Scanner;

public class SumOfEven{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int[] numberCollection  = new int[10];

		int even = 0;
		for(int count = 0; count < numberCollection.length; count++){
			System.out.print("Enter a number: " );
			int number = scanner.nextInt();
			if(number % 2 == 0)
			even += number;
			numberCollection[count] = number;

		}


		for (int count = 0; count < numberCollection.length; count++) {
			System.out.println(numberCollection[count]);
		}

			System.out.println("Sum of even number is: " + even);

		
	}


}
