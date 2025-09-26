/*	prompt user to enter  scores
	save it in box
	if score is greater than and equal to 90, print A, if not
	if score is greater than and equal to 80, print B, if not
	if score is greater than and equal t0 60, print C, if not
	if score is less than 60, print F.
							*/

import java.util.Scanner;

public class ThreeScore{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter student score: " );
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