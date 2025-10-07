import java.util.Scanner;

public class AverageOfSumOfEven{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int[] numberCollection  = new int[10];

		int noOfEven = 0;
		int even = 0;
		for(int count = 0; count < numberCollection.length; count++){
			System.out.print("Enter a number: " );
			int number = scanner.nextInt();
			if(number % 2 == 0){
				even += number;
				noOfEven += 1;
			}
			numberCollection[count] = number;

		}


		for (int count = 0; count < numberCollection.length; count++) {
			System.out.println(numberCollection[count]);
		}
		
		double average = even/noOfEven;

			System.out.println("The average of sum of even number is: " + average);

		
	}


}
