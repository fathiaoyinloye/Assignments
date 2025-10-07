import java.util.Scanner;

public class Maximum{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter  number 1 : ");
		int maximum = scanner.nextInt();


		for (int count = 2; count <= 5; count++){
			System.out.printf("Enter  number %d : ", count);
			int number = scanner.nextInt();

			if(number > maximum)
			maximum = number;

		}

		System.out.print("The largest number is " + maximum );

	}


}