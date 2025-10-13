import java.util.Scanner;

public class ParkingCharges{
	public static double parkingCharges(double hours ){
		double threeHoursCharges = 2.00;
		double getHoursAfterThreeHours =(hours - 3) * 0.50;
		double charges = threeHoursCharges + getHoursAfterThreeHours;
		if (charges > 10.00)
			return 10.00;
		else
			return charges;
		


	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int totalCharges = 0;
		int count = 0;
		while(count != -1){

			System.out.print("Enter Yesterday's parked hours for each customer: ");
			double hours = scanner.nextInt();
			double charges = parkingCharges(hours);
			totalCharges += charges;
			System.out.println(charges);
			System.out.print("Enter -1 if all yesterday's transaction have been entered or any number to continue: ");
			count = scanner.nextInt();

		}
		System.out.println("Total charges for yesterday is: " + totalCharges);

	}



}