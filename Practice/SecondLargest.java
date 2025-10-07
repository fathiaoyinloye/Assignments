import java.util.Scanner;

public class SecondLargest{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter  number 1 : ");
		int maximum = scanner.nextInt();
		int secondLargest = 0;


		for (int count = 2; count <= 5; count++){
			System.out.printf("Enter  number %d : ", count);
			int number = scanner.nextInt();

			if(number > maximum){
			secondLargest = maximum;
			maximum = number;
			}
			else if(number < maximum && number < secondLargest){
			secondLargest = number;
			}
		}

		System.out.print("The largest number is " + secondLargest );

	}


}