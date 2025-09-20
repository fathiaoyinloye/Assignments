/* 	prompt user to enter two numbers
	save as first and second respectively
	check if first is equal to second, print 1 if yes, if not
	check if first is greater than second, print 1, if not
	check if second is greater than first, print -1 if yes		*/

import java.util.Scanner;

public class Comparator{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int first = scanner.nextInt();

		System.out.print("Enter second number: ");
		int second = scanner.nextInt();

		if(first == second){
			System.out.println("0");
		}
		else if(first > second){
			System.out.print("1");
		}
		else if(second > first){
			System.out.print("-1");
		}

	}
}