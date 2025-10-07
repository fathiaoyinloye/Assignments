import java.util.Scanner;

public class TaskOne{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	double[] score = new double[3];
	int occurence = 0;

	for (int count = 0; count < score.length; count++){
		System.out.print("Enter your score");
		int scoreInputed = scanner.nextInt();
		//if (scoreInputed == scoreInputed)
		//occurence += 1;
		score[count] = scoreInputed;

	}
	for (int count = 0; count < score.length; count++){
		System.out.println(score[count]);
	}
		//System.out.println(occurence);

	arrayTest(new int[] {5,4,3,2,1,8,6,4,3,6});

	

}



public static void arrayTest(int[] number){

for (int count = 0; count < number.length; count++){
	System.out.print(number[count] + " ");


}




}




}