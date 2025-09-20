
/* 	prompt a user to enter their total earnings
	save as earnings
	create a variable taxrate to be zero
	if earnings is lesser or equal to thirty,
	tax rate should be 15% of eanings, if not   
	tax rate should be 20% of earnings 
	print the tax rate
	user should input -1 once they are done calculating all citizen taxrate
	
							*/
	

import java.util.Scanner;

public class TaxCalculator{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		int count = 0;
		while(count != -1){
			System.out.print("Enter your total earnings: $");
			int earnings = scanner.nextInt();
			float tax_rate = 0;

			if(earnings <= 30000){
				tax_rate = earnings * 15/100 ;
			}
			else if(earnings > 30000){
				tax_rate = earnings * 20/100;
			}
		System.out.println("Tax payable  for " + name + " is: " +  "$" + tax_rate );
		System.out.print("Enter -1 if all customers name have been inputed or any number to input more: ");
		count = scanner.nextInt();
		}
	}
}



	