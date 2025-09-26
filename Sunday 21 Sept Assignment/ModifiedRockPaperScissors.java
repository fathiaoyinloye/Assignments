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

public class ModifiedRockPaperScissors{
	public static void main(String[] args){

		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		int computer = random.nextInt(0, 3);

		System.out.print("Enter a number between 0 - 2: ");
		int number = scanner.nextInt();
		 
		//while(computer != number){
		int userScore = 0;
		int computerScore = 0;
		while(computerScore != 2 || userScore != 2){
			if(computer == 0 && number == 0){
				System.out.println("Computer entered: " + computer);
				System.out.println("The computer is scissors, You are scissor its a draw");
				}
		else if(computer == 0 && number == 1){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is scissors, You are rock, You won");
			userScore = userScore + 1;
		}
		else if(computer == 0 && number == 2){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is scissors, You are paper, Computer won");
			computerScore = computerScore + 1;

		}
		else if(computer == 1 && number == 0){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is rock, You are scissors, Computer won");
			computerScore = computerScore + 1;

		}

		else if(computer == 1 && number == 1){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is rock, You are rock, It's a draw");
		}
		else if(computer == 1 && number == 2){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is rock, You are paper, You won");
			userScore = userScore + 1;

		}
		else if(computer == 2 && number == 0){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is paper, You are scissors, You won");
			userScore = userScore + 1;

		}
		else if(computer == 2 && number == 1){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is paper, You are rock, Computer won");
			computerScore = computerScore + 1;

		}
		else if(computer == 2 && number == 2){
			System.out.println("Computer entered: " + computer);
			System.out.println("The computer is paper, You are paper, It's a draw");
		}
		else{
			System.out.println("Invalid input, please input number between 0 - 2");
		}

		} 
	}

}