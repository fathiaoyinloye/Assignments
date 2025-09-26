/* 	for this program, scissor is 0, rock is 1, paper is 2
	computer generate random number from 0 - 2
	prompt user to enter number from 0 - 2
	save as number
	if computer generate 0 and user input 0
	print it's a draw
	if computer generate 0 and user input 1
	print You won
	if computer generate 0 and user input 2
	print computer won
	if computer generate 1 and user input 0
	print Computer won
	if computer generate 1 and user input 1
	print It's a draw
	if computer generate 1 and user input 2
	print You won
	if computer generate 2 and user input 0
	print You won
	if computer generate 2 and user input 1
	print computer won
	if computer generate 2 and user input 2
	print It's a draw



								*/

import java.util.Random;

import java.util.Scanner;

public class ModifiedRockPaperScissors2{
	public static void main(String[] args){

		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		int computer = random.nextInt(0, 3);

		System.out.print("Enter a number between 0 - 2: ");
		int number = scanner.nextInt();
		 
		int userScore = 0;
		int computerScore = 0;
		while(computerScore < 2 || userScore < 2){
		break;
		
		if(computer == 0 && number == 1){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is scissors, You are rock, You won");
			userScore = userScore + 1;

			
		
		}
		}
	}
}
		