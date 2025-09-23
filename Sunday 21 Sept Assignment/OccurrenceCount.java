/* 	create variable for number and assign zero to it
	largest should be equals to number too
	for variable count which is zero,
	count should continue running as far aa it is less than 5
	if number is greater than largest
	largest becomes number
	largestcount should be increase by 1



					*/
import java.util.Scanner;

public class OccurrenceCount{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		
		int number = 0;
		int largest = number;
		int largestCount = 0;
		
		for(int count = 0; count < 5; count++){
			System.out.print("Enter a number: ");
			number = scanner.nextInt();

			if(number > largest){
			largest = number;
			largestCount = largestCount + 1;
			}
			
		}

			System.out.println("The largest number is: " + largest);
			System.out.println("The largest occured: " + largestCount);



	}

}