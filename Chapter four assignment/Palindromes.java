/* 	prompt user to enter a a five digit number
	if number is greater than 9999 or greater or equal to 100000, print invalid digit
	find each digit of the number
	if firt digit is equal to last digit and second digit is equals fourth
	print Palindrome if not,
	print its not a palindrome
									*/
	


import java.util.Scanner;

public class Palindromes{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a five digit number: ");
		int number = scanner.nextInt();
			
		int digit1 = number/10000;
		int digit2 = (number % 10000) / 1000;
		int digit3 = (number % 1000) / 100;
		int digit4 = (number % 100) / 10;
		int digit5 = number % 10;


		
		if(number <= 9999 || number >= 100000){
			System.out.print("Invalid input, please input a five digit number");
		}
		
		else if(digit1 == digit5 && digit2  == digit4){
			System.out.print( number + " is a palindromes number");
		}
		
		else{
			System.out.print( number + " is not a palindromes number");

		}


	}
}

