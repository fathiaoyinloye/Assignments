import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: "); 
	int number = scanner.nextInt();

	if (number % 4 == 0 && number % 100 != 0){
		System.out.println("Leap Year");
	}
	else if (number % 4 == 0 && number % 100 == 0 && number % 400 == 0){
		System.out.println("Leap Year");
	}
	else{
		System.out.println("Not Leap Year");

	}


	




	}






}