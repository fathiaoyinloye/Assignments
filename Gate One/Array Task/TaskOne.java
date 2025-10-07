import java.util.Scanner;

public class TaskOne{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	int[] scores = new int[5];
	int sum = 0;
		for (int count = 0; count < scores.length; count++){
			System.out.print("Enter a number: ");
			int scoreInput = scanner.nextInt(); 
			scores[count] = scoreInput;						sum = sum + scores[count];
												System.out.println();
			System.out.println("sum is: "+ sum);

			
		}

		System.out.println("**********************");		
		System.out.println("Done collecting");	
		System.out.println("**********************");				
			


		for(int count = 0; count < 5;count++){
			System.out.print(scores[count] + "  ");


		}

	}

	}