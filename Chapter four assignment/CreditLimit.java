/*prompt user to enter account number
	save as acount number
	prompt user to enter begining balance
	save as begining balance
	promt user to enter total items charged the month
	save as itemsCharged
	prompt user to enter all credit applied to the customer's account this month
	save as credit applied
	prompt user to enter allowed credit limit
	save as creit limit
	calculate the new balance by;
	add up begining balance and items charged and subtract creditapplied
	print new balance
	if new balnace is greater than creditlimit, 
	print credit limit exceeded, if not
	print credit limit not exceeded


					*/


import java.util.Scanner;

public class CreditLimit{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		

		int count = 0;
		while(count != -1){
		System.out.print("Enter your five digit account number: ");
		int accountNumber = scanner.nextInt();

		System.out.print("Enter balance at the begining of the month: ");
		int beginingBalance = scanner.nextInt();
	
		System.out.print("Enter total of all items charged this month: ");
		int itemsCharged = scanner.nextInt();

		System.out.print("Enter total of all credits applied to the customer's account this month: ");
		int creditApplied = scanner.nextInt();

		System.out.print("Enter allowed credit limits: ");
		int creditLimits = scanner.nextInt();
	
		int newBalance = beginingBalance + itemsCharged - creditApplied;
		
		System.out.println("New balance is: " + newBalance);

		if(newBalance >  creditLimits){
			System.out.println("Credit Limit Exceeded");
		}
		else{
			System.out.println("Not Exceeded Credit Limit");
		}
		System.out.print("Enter -1 to end or any number to input more data: ");
		count = scanner.nextInt();
		} 

	







	}


}