import java.util.Scanner;

public class BarChartPrinting{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		for(int count = 1; count <=6; count++) {
				System.out.print("Enter a number from 1 - 30: ");
				int number = input.nextInt();
				if(number >= 1 && number <= 30){
					count += 1;
				}
				else{
					continue;
					}

				for(int counter = 1; counter <= number; counter++) {
					System.out.print("*");

				}

		System.out.println();

		
		}

	}

}


//It's printing just each input, not printing all consecutively