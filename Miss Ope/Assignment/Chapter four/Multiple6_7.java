import java.util.Scanner;

public class Multiple6_7{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if(number % 6 == 0){
		System.out.printf("%d is a multiple of 6", number);
		}
		else if(number % 7 == 0){
		System.out.printf("%d is a multiple of 7", number);
		}
		else{
		System.out.printf("%d is neither a multiple of 6 nor 7", number);
		}

	}
}