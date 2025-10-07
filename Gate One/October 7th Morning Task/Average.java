import java.util.Scanner;

public class Average{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
		int sum =0;
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number: " );
			int number = scanner.nextInt();
			sum += number;
		
		}
		double average = sum/10;
		System.out.print("The average of the numbers is: " + average);
		
	}


}
