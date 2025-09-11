import java.util.Scanner;

public class Investment{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
			
		System.out.print("Enter investment amount: ");
		double investment = scanner.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double interest = scanner.nextDouble();

		System.out.print("Enter number of years: ");
		double years = scanner.nextDouble();

		double month = years / 12;

		double power = years * 12;
		double future = investment * Math.pow( (1 + month), power);
		
			
		System.out.println("Accumulated value: " +future);
		
	
	}
}