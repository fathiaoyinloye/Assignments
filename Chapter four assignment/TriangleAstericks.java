/* 	prompt user to enter a the length of the base of a triangle
	save as number
	for a new variable count which is zero
	count should continue to iterate as far as it is lesser than number 
	count should increase  by one in every iteration
	when count is zero,another variable which is counter should also be zero and should be less than or equal to count
	counter increases by one
	counter also increases as count inceases in every iteration and stops once count does
	print *
						*/
import java.util.Scanner;

public class TriangleAstericks{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter the length of the base of a triangle from 1 - 10: ");
		int number = scanner.nextInt();
		for(int count = 0; count < number; count++){				
			System.out.println();
			for(int counter = 0; counter <=count; counter++){
					System.out.print("* ");
					
					
					
				
			}

		}
			
		


	}

}