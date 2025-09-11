/* collect a number from user
save as score
check if number is greater than or equal to 90
print A, if not
check if number is greater than or equal to 80
print B, if not
check if number is greater than or equal to 70
print C, if not
check if number is greater than or equal to 60
print A, if not
print C */

import java.util.Scanner;

public class Score4{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your score: ");
	int score = scanner.nextInt();

	if(score >= 90){
	System.out.println("A");
	}

	else if(score >= 80){
	System.out.println("B");
	}
	else if(score >= 70){
	System.out.println("C");
	}

	else if(score >= 60){
	System.out.println("D");
	}
	else{
	System.out.print("F");
	}

	}
}