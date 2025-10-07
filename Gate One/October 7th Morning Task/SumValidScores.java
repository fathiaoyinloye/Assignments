import java.util.Scanner;

public class SumValidScores{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	int sumInvalid = 0;
	for (int count = 0; count < 10; count++){
		System.out.print("Enter scores between 0-100: ");
		int scores = scanner.nextInt();
		if(scores < 0 || scores > 100)
		sumInvalid = sumInvalid + scores;
		else
		sum = sum + scores;
	System.out.println("The sum of the scores is: " + sum);


}
	

	}



}