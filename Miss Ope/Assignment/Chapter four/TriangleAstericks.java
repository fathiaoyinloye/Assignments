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