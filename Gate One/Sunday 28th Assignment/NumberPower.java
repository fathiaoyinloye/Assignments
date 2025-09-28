import java.util.Scanner;

public class NumberPower{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.print("Enter the power to be raised: ");
		int power = scanner.nextInt();
 
		int total = 1;
		for(int count = 1; count <= power; count++){
			total = total  * number;
		}
		System.out.print(number + " raised to the power of " + power + " is " + total);



	}
}