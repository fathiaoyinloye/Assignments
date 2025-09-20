/*	 prompt a user to enter a number
	save it in a container called number
	multiply the number by 1 save it as number1
	multiply the number by 2 save it as number2
	multiply the number by 3 save it as number3
	multiply the number by 4 save it as number4
	multiply the number by 5 save it as number5
	multiply the number by 6 save it as number6
	multiply the number by 7 save it as number7
	multiply the number by 8 save it as number8
	multiply the number by 9 save it as number9
	multiply the number by 10 save it as number10
	multiply the number by 12 save it as number11
	multiply the number by 13 save it as number12    
	print the number1 - number12
							*/



import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int number1 = number * 1;
		int number2 = number * 2;
		int number3 = number * 3;
		int number4 = number * 4;
		int number5 = number * 5;
		int number6 = number * 6;
		int number7 = number * 7;
		int number8 = number * 8;
		int number9 = number * 9;
		int number10 = number * 10;
		int number11 = number * 11;
		int number12 = number * 12;
	
		System.out.println( number + " * 1 = " + number1); 
		System.out.println( number + " * 2 = " + number2); 
		System.out.println( number + " * 3 = " + number3); 
		System.out.println( number + " * 4 = " + number4); 
		System.out.println( number + " * 5 = " + number5); 
		System.out.println( number + " * 6 = " + number6); 
		System.out.println( number + " * 7 = " + number7); 
		System.out.println( number + " * 8 = " + number8); 
		System.out.println( number + " * 9 = " + number9); 
		System.out.println( number + " * 10 = " + number10); 
		System.out.println( number + " * 11 = " + number11); 
		System.out.println( number + " * 12 = " + number12); 




	}
}