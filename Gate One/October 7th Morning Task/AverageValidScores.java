import java.util.Scanner;

public class AverageValidScores{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	int sumInvalid = 0;
	int validCount = 0;
	for (int count = 0; count < 3; count++){
		System.out.print("Enter scores between 0-100: ");
		int scores = scanner.nextInt();
		if(scores < 0 || scores > 100){
		sumInvalid = sumInvalid + scores;
		}
		else{
		sum = sum + scores;
		validCount = validCount + 1;

		}
	

}
	double sumDouble = sum;
	double countDouble = validCount;
	double average = sumDouble/countDouble;
	System.out.printf("The average of valid scores is: %.2f", average);


	}



}