import java.util.Scanner;

public class EvenIndexes{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	int[] score = new int[10];

	for (int count = 0; count < 10; count++){
		System.out.print("Enter your score: ");
		int scoreInputed = scanner.nextInt();
		if(count % 2 == 0)
			sum = sum + scoreInputed;
		if(count == 0)
		sum = 0;
		score[count] = scoreInputed;

	}
	System.out.print("The sum  of even indexes is: " + sum);


}




}